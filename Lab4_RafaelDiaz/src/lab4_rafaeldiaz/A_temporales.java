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
public class A_temporales extends Almacen{

    public A_temporales() {
        super();
    }

    public A_temporales(double tamanometros, double altura) {
        super(tamanometros, altura);
    }

    @Override
    public String toString() {
        return "A_temporales{" + '}'+super.toString();
    }
    
}
