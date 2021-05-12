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
import org.supermarket.model.Ventas;

/**
 *
 * @author alberto
 */
public class DAOVentas implements DaoGeneral<Ventas> {

    private Session session;

    public DAOVentas() {
    }
    
    

    @Override
    public boolean guardar(Ventas pojo) {
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
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
            System.out.print("No se pudo guardar");
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public boolean borrar(Ventas pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(pojo);
            res = true;
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }

        return res;
    }

    @Override
    public boolean actualizar(Ventas pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(pojo);
            res = true;
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public Ventas mostrarUno(Ventas pojo) {
        Ventas ventas = new Ventas();
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            ventas = (Ventas) session.createQuery("SELECT pojo FROM Ventas pojo WHERE id = " + pojo.getId()).uniqueResult();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return ventas;
    }

    @Override
    public List<Ventas> mostrarTodos() {
        List<Ventas> List = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("SELECT ventas FROM Ventas ventas");
            List = query.list();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return List;
    }

}
