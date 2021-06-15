/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.supermarket.config.HibernateUtil;
import org.supermarket.model.Productos;

/**
 *
 * @author alberto
 */
public class DAOAlmacen implements DaoGeneral<Productos> {

    private Session session;

    public DAOAlmacen() {

    }

    @Override
    public boolean guardar(Productos pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            if (pojo.getPiezas() <= 0 || pojo.getPrecio() <= 0) {

            } else {
                session.save(pojo);
                res = true;
                transaction.commit();
            }
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public boolean borrar(Productos pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(pojo);
            transaction.commit();
            res = true;
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }

        return res;
    }

    @Override
    public boolean actualizar(Productos pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            if (pojo.getPiezas() < 0 || pojo.getPrecio() < 0) {
      
            } else {
                session.update(pojo);
                res = true;
                transaction.commit();
            }
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public Productos mostrarUno(Productos pojo) {
        Productos productos = new Productos();
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            productos = (Productos) session.createQuery("SELECT pojo FROM Productos pojo WHERE id_producto = " + pojo.getIdProducto()).uniqueResult();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return productos;
    }

    @Override
    public List<Productos> mostrarTodos() {
        List<Productos> List = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("SELECT productos FROM Productos productos");
            List = query.list();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return List;
    }

}
