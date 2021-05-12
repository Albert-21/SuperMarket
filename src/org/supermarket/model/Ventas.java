/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alberto
 */
@Entity
@Table(name = "ventas")
public class Ventas implements Serializable {
    
    @Id
    @Column
    private long id;
    @Column
    private String fecha;
    @Column
    private String hora;
    @Column
    private long id_empleado;
    @Column
    private long total;

    public Ventas() {
    }

    public Ventas(String fecha, String hora, long id_empleado, long total) {
        this.fecha = fecha;
        this.hora = hora;
        this.id_empleado = id_empleado;
        this.total = total;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    

    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

   
    
    
    
}
