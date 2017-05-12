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
public abstract class Antirrobo {

    public Antirrobo() {
    }
    
    public abstract String codificacion(String x, String clave);
    public abstract String decodificacion(String y, String clave);
}
