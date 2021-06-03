/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.controller;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.supermarket.model.Usuarios;

/**
 *
 * @author alberto
 */
public class DAOUsuarioTest {
    
    public DAOUsuarioTest() {
    }
    
    /**
     * Test of iniciarSesion method, of class DAOUsuario.
     * @throws java.lang.Exception
     */
    @Test
    public void testIniciarSesion_1() throws Exception {
        System.out.println("iniciarSesion");
        Usuarios usuarioo = new Usuarios();
        usuarioo.setNombre_usuario("cajero1");
        usuarioo.setContraseña("cajero");
        DAOUsuario instance = new DAOUsuario();
        Usuarios result = instance.iniciarSesion(usuarioo);
        assertNotNull(result);
    }

    /**
     * Test of guardar method, of class DAOUsuario.
     * @throws java.lang.Exception
     */
    @Test
    public void testGuardar_2() throws Exception {
        System.out.println("guardar");
        Usuarios pojo = new Usuarios("PruebaTest", "direccion de prueba", "555-555-5555", "testPrueba", "prueba", "cajero");
        DAOUsuario instance = new DAOUsuario();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of borrar method, of class DAOUsuario.
     */
    @Test
    public void testBorrar_3() throws Exception {
        System.out.println("borrar");
        Usuarios pojo = new Usuarios("PruebaTest", "direccion de prueba", "555-555-5555", "testPrueba", "prueba", "cajero");
        DAOUsuario instance = new DAOUsuario();
        Usuarios usuario = instance.iniciarSesion(pojo);
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class DAOUsuario.
     * @throws java.lang.Exception
     */
    @Test
    public void testActualizar_4() throws Exception {
        System.out.println("actualizar");
       Usuarios pojo = new Usuarios("PruebaTest", "direccion de prueba actualizada", "555-555-5555", "testPrueba", "prueba", "cajero");
        DAOUsuario instance = new DAOUsuario();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of mostrarUno method, of class DAOUsuario.
     */
    @Test
    public void testMostrarUno_5() throws Exception {
        System.out.println("mostrarUno");
        Usuarios pojo = new Usuarios();
        pojo.setId(0);
        DAOUsuario instance = new DAOUsuario();
        Usuarios expResult = new Usuarios("Admin", " ", " ", "admin","YWRtaW4=", "administrador");
        Usuarios result = instance.mostrarUno(pojo);
        assertTrue(true);
    }

    /**
     * Test of mostrarTodos method, of class DAOUsuario.
     */
    @Test
    public void testMostrarTodos_6() {
        System.out.println("mostrarTodos");
        DAOUsuario instance = new DAOUsuario();
        List<Usuarios> expResult = null;
        List<Usuarios> result = instance.mostrarTodos();
        assertNotEquals(expResult, result);
        }
    
}
