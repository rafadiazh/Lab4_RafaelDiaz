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
    
    //Al hacer la validacion, usar ignore case.

    @Override
    public String codificacion(String codigo, String key) {
        String c = codigo.toUpperCase();
        //System.out.println(c);
        char[][] tabla=new char[26][26];
        String[] salida=new String[2];
        tabla=Tabla();
        salida[0]="";
        int contador=0;
        for (int i = 0; i < codigo.length(); i++) {
            int letracodigo=c.charAt(i)-65;
            if (contador==key.length()){
                contador=0;
            }
            if(letracodigo<0 || letracodigo>26){
                salida[0]+=c.charAt(i);
            }else{
                int letrakey=key.charAt(contador)-65;
                salida[0]+=tabla[letracodigo][letrakey];
                contador++;
            }
        }
        salida[1]=key;
        String enviar = salida[0];
        return enviar;
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
