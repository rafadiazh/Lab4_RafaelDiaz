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
public class Binario extends Antirrobo{

    @Override
    public String codificacion(String x, String clave) {
        String binario = "";
        String inverso = "";
        for (int i = 0; i < x.length(); i++) {
            binario += Integer.toBinaryString((int)x.charAt(i))+" ";
        }
        for (int i = binario.length()-1; i >= 0; i--) {
            inverso += binario.charAt(i);
            
        }
        //System.out.println("Normal: "+binario);
        //System.out.println("Inverso: "+inverso);
        return inverso;
    }

    @Override
    public String decodificacion(String y, String clave) {
        String binario = "";
        String inverso = "";
        String retorno="";
        for (int i = 0; i < y.length(); i++) {
            binario += Integer.toBinaryString((int)y.charAt(i))+" ";
        }
        for (int i = binario.length()-1; i >= 0; i--) {
            inverso += binario.charAt(i);
            
        }
        if(inverso.equals(clave)){
            retorno = "verdad";
        }
        return retorno;
       
    }
    
}
