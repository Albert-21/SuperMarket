/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alberto
 */
@Entity
@Table(name = "productos")
public class Productos {
    @Id 
    @Column
    private long id_producto;
    @Column
    private String nombre_producto;
    @Column
    private String descripcion;
    @Column
    private long precio;
    @Column
    private long piezas;

    public Productos() {
        
    }
    

    public Productos(long id_producto, String nombre_producto, String descripcion, long precio, long piezas) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.piezas = piezas;
    }

    public long getIdProducto() {
        return id_producto;
    }

    public void setIdProducto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public long getPiezas() {
        return piezas;
    }

    public void setPiezas(long piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "Producto {" + "id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", descripcion=" + descripcion + ", precio=" + precio + ", piezas=" + piezas + '}';
    }
    
    
    
    
}
