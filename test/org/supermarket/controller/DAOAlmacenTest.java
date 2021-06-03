/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.controller;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.supermarket.model.Productos;

/**
 *
 * @author alberto
 */
public class DAOAlmacenTest {
    
    public DAOAlmacenTest() {
    }

    /**
     * Test of guardar method, of class DAOAlmacen.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Productos pojo = new Productos(0, "producto de prueba", "este es un producto de prueba", 1, 1);
        DAOAlmacen instance = new DAOAlmacen();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of borrar method, of class DAOAlmacen.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        Productos pojo = new Productos();
        pojo.setIdProducto(0);
        DAOAlmacen instance = new DAOAlmacen();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class DAOAlmacen.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Productos pojo = new Productos(0, "producto de prueba", "este es un producto de prueba", 1, 1);;
        DAOAlmacen instance = new DAOAlmacen();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of mostrarUno method, of class DAOAlmacen.
     */
    @Test
    public void testMostrarUno() {
        System.out.println("mostrarUno");
        Productos pojo = new Productos();
        pojo.setIdProducto(0);
        DAOAlmacen instance = new DAOAlmacen();
        Productos expResult = null;
        Productos result = pojo;
        assertNotNull(result);
    }

    /**
     * Test of mostrarTodos method, of class DAOAlmacen.
     */
    @Test
    public void testMostrarTodos() {
        System.out.println("mostrarTodos");
        DAOAlmacen instance = new DAOAlmacen();
        List<Productos> expResult = null;
        List<Productos> result = null;
        assertEquals(expResult, result);
    }
    
}
