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
public class A_plataforma extends Almacen{

    public A_plataforma() {
        super();
    }

    public A_plataforma(double tamanometros, double altura) {
        super(tamanometros, altura);
    }

    @Override
    public String toString() {
        return "A_plataforma{" + '}'+super.toString();
    }
    
}
