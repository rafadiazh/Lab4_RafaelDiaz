/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

/**
 *
 * @author Rafael
 */
public class A_dePlanta extends Almacen{

    public A_dePlanta(int numplantas, double tamanometros, double altura) {
        super(tamanometros, altura);
        this.numplantas = numplantas;
    }

    public A_dePlanta() {
        super();
    }
    
    int numplantas;

    public int getNumplantas() {
        return numplantas;
    }

    public void setNumplantas(int numplantas) {
        this.numplantas = numplantas;
    }

    @Override
    public String toString() {
        return "A_dePlanta{" + "numplantas=" + numplantas + '}'+super.toString();
    }
    
}
