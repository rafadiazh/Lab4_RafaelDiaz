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
public class A_regionales extends Almacen{
    String nombredepartamento;

    public A_regionales() {
        super();
    }

    public A_regionales(String nombredepartamento, double tamanometros, double altura) {
        super(tamanometros, altura);
        this.nombredepartamento = nombredepartamento;
    }

    @Override
    public String toString() {
        return "A_regionales{" + "nombredepartamento=" + nombredepartamento + '}'+super.toString();
    }
    
}
