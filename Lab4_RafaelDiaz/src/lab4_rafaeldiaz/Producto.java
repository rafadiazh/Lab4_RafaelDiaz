/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Producto {
    Date fecha;
    double vidautil;
    double precio;
    double tamano;
    String descripcion;
    String nombre;
    int numeroproductos;

    public Producto(Date fecha, double vidautil, double precio, double tamano, String descripcion, String nombre, int numeroproductos) {
        this.fecha = fecha;
        this.vidautil = vidautil;
        this.precio = precio;
        this.tamano = tamano;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.numeroproductos = numeroproductos;
    }

    public Producto() {
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getVidautil() {
        return vidautil;
    }

    public void setVidautil(double vidautil) {
        this.vidautil = vidautil;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroproductos() {
        return numeroproductos;
    }

    public void setNumeroproductos(int numeroproductos) {
        this.numeroproductos = numeroproductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "fecha=" + fecha + ", vidautil=" + vidautil + ", precio=" + precio + ", tamano=" + tamano + ", descripcion=" + descripcion + ", nombre=" + nombre + ", numeroproductos=" + numeroproductos + '}';
    }
    
}
