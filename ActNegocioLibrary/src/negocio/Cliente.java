/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author Elias Barrientos
 */
public class Cliente { // Clase que contiene los datos del cliente que se usara en la base de datos
    
    String cedula; // Cedula de identidad del usuario
    String nombre; // Nombre de usuario
    String apellido; // Apellido del usuario
    String fechaUltimaCompra; // Fecha de la ultima compra que se realizo
    int id; // Identificador que sera el numero de cedula

    public Cliente(String cedula, String nombre, 
                           String apellido, String fechaUltimaCompra, int id) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.id = id;
    }

    public String getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(String fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", fechaUltimaCompra=" + fechaUltimaCompra + 
                ", id=" + id + '}';
    }   
}