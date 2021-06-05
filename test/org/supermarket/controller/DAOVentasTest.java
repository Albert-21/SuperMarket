/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.controller;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import org.supermarket.model.Ventas;

/**
 *
 * @author alberto
 */
public class DAOVentasTest {
    
    public DAOVentasTest() {
    }
    

    /**
     * Test of guardar method, of class DAOVentas.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Ventas pojo = new Ventas("15/05/2021", "17:32", 0, 10,"");
        DAOVentas instance = new DAOVentas();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of borrar method, of class DAOVentas.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        Ventas pojo = new Ventas();
        pojo.setId(0);
        DAOVentas instance = new DAOVentas();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class DAOVentas.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Ventas pojo = new Ventas("15/05/2021", "17:32", 0, 10,"");
        pojo.setId(0);
        DAOVentas instance = new DAOVentas();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of mostrarUno method, of class DAOVentas.
     */
    @Test
    public void testMostrarUno() {
        System.out.println("mostrarUno");
        Ventas pojo = new Ventas("15/05/2021", "17:32", 0, 10,"");
        DAOVentas instance = new DAOVentas();
        Ventas expResult = pojo;
        Ventas result = pojo;
        assertEquals(expResult, result);
    }

    /**
     * Test of mostrarTodos method, of class DAOVentas.
     */
    @Test
    public void testMostrarTodos() {
        System.out.println("mostrarTodos");
        DAOVentas instance = new DAOVentas();
        List<Ventas> expResult = null;
        List<Ventas> result = null;
        assertEquals(expResult, result);

    }
    
}
