/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
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
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre_completo;
    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column
    private String nombre_usuario;
    @Column
    private String contraseña;
    @Column
    private String rol;

    public Usuarios() {

    }

    public Usuarios(String nombre_completo, String direccion, String telefono, String nombre_usuario, String contraseña, String rol) throws Exception {
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = encriptar(contraseña);
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombreDeUsuario) {
        this.nombre_usuario = nombreDeUsuario;
    }

    public String getContraseña() throws Exception {

        return contraseña;
    }

    public void setContraseña(String contraseña) throws Exception {
        this.contraseña = encriptar(contraseña);
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    private static String encriptar(String s) throws UnsupportedEncodingException {
        return Base64.getEncoder().encodeToString(s.getBytes("UTF-8"));
    }

    private static String desencriptar(String s) throws UnsupportedEncodingException {
        byte[] decode = Base64.getDecoder().decode(s.getBytes());
        return new String(decode, "UTF-8");
    }

}
