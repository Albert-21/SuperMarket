/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.supermarket.config.HibernateUtil;
import org.supermarket.model.Usuarios;


/**
 *
 * @author alberto
 */
public class DAOUsuario implements DaoGeneral<Usuarios> {
    private Usuarios usuario;
    private Session session;

    public DAOUsuario() {
    }
    
    
    public Usuarios iniciarSesion(Usuarios usuarioo) throws Exception{
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query =  session.createQuery("SELECT pojo FROM Usuarios pojo WHERE nombre_usuario = '" +usuarioo.getNombre_usuario().trim()+"' AND contraseña = '"+usuarioo.getContraseña().trim()+"'" );
            usuario = (Usuarios) query.uniqueResult();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return usuario;
    }
   

    @Override
    public boolean guardar(Usuarios pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(pojo);
            res = true;
            transaction.commit();
            System.out.print("Guardado");
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, e);
            System.out.print("No se pudo guardar");
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public boolean borrar(Usuarios pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(pojo);
            res = true;
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }

        return res;
    }

    @Override
    public boolean actualizar(Usuarios pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(pojo);
            res = true;
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public Usuarios mostrarUno(Usuarios pojo) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            usuario = (Usuarios) session.createQuery("SELECT pojo FROM Usuarios pojo WHERE id = " + pojo.getId()).uniqueResult();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return usuario;
    }

    @Override
    public List<Usuarios> mostrarTodos() {
        List<Usuarios> List = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("SELECT usuario FROM Usuarios usuario");
            List = query.list();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return List;
    }

}
