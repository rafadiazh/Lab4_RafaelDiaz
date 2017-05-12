/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Almacen {
    ArrayList<Producto> productos = new ArrayList();
    ArrayList<Empleado> empleados = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();
    double tamanometros, altura;

    public Almacen() {
    }

    public Almacen(double tamanometros, double altura) {
        this.tamanometros = tamanometros;
        this.altura = altura;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getTamanometros() {
        return tamanometros;
    }

    public void setTamanometros(double tamanometros) {
        this.tamanometros = tamanometros;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Almacen{" + "productos=" + productos + ", empleados=" + empleados + ", clientes=" + clientes + ", tamanometros=" + tamanometros + ", altura=" + altura + '}';
    }
    
}
