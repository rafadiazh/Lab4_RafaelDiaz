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
public class Vigenere extends Antirrobo{

    @Override
    public String codificacion(String codigo, String key) {
        char[][] tabla=new char[26][26];
        String salida="";
        tabla=Tabla();
        int contador=0;
        for (int i = 0; i < codigo.length(); i++) {
            int letracodigo=codigo.charAt(i)-65;
            if (contador==key.length()){
                contador=0;
            }
            if(letracodigo<0 || letracodigo>26){
                salida+=codigo.charAt(i);
            }else{
                int letrakey=key.charAt(contador)-65;
                salida+=tabla[letracodigo][letrakey];
                contador++;
            }
        }
        return salida;
    }

    @Override
    public String decodificacion(String codigo, String key) {
        char[][] tabla=new char[26][26];
        String salida="";
        tabla=Tabla();
        int contador=0;
        for (int i = 0; i < codigo.length(); i++) {
            int letracodigo=codigo.charAt(i)-65;
            if (contador==key.length()){
                contador=0;
            }
            if(letracodigo<0 || letracodigo>26){
                salida+=codigo.charAt(i);
            }else{
                int letrakey=key.charAt(contador)-65;
                for (int j = 0; j < 26; j++) {
                    if (tabla[letrakey][j]==codigo.charAt(i)){
                        salida+=(char)(j+65);
                    }
                }
                contador++;
            }
        }
        return salida;
    }
    
    public char[][] Tabla(){
        char[][] tabla = new char[26][26];
        int abecedario=65;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                tabla[i][j]=(char)abecedario;
                abecedario++;
                if (abecedario==91)
                    abecedario=65;
            }
            abecedario++;
        }
        return tabla;
    }
    
}
