/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.controller;

import java.util.List;

/**
 *
 * @author alberto
 * @param <T>
 */
public interface DaoGeneral<T> {
    
    public boolean guardar(T pojo);
    public boolean borrar (T pojo);
    public boolean actualizar(T pojo);
    public T mostrarUno(T pojo);
    public List<T> mostrarTodos();
    
}
