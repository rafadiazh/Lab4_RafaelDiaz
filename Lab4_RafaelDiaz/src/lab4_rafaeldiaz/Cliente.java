/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

/**
 *
 * @author Josue Rodriguez
 */
public class Cliente extends Persona {
    
    double dinero;
    String fecha_compra;
    //ArrayList<Producto> producto = new ArrayList();    

    public Cliente() {
        super();
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dinero=" + dinero + ", fecha_compra=" + fecha_compra + '}';
    }
    
    
    
    
    
}
