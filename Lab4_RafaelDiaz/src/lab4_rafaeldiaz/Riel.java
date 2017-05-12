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
public class Riel extends Antirrobo {

    @Override
    public String codificacion(String codigo, String clave) {
        char[][] cripted = new char[3][codigo.length()];
        String x = "";
        for (int i = 0; i < cripted.length; i++) {
            for (int j = 0; j < cripted[i].length; j++) {
                cripted[i][j] = '-';
            }

        }
        int a = 0, a2 = 0;
        int bandera = 1;
        for (int j = 0; j < codigo.length(); j++) {
            cripted[a][j] = codigo.charAt(j);
            if (a == 2) {
                bandera = 2;
            } else if (a == 0) {
                bandera = 1;
            }
            if (bandera == 1) {
                a++;
            } else if (bandera == 2) {
                a--;
            }
        }
        for (int i = 0; i < cripted[0].length; i++) {
            for (int j = 0; j < cripted.length; j++) {
                x += cripted[j][i];
            }

        }
        return x;
    }

    @Override
    public String decodificacion(String codigo, String clave) {
        String deco = "";
        for (int i = 0; i < codigo.length(); i++) {
            if (codigo.charAt(i) != '-') {
                deco += codigo.charAt(i);
            }
        }
        return deco;
    }

}
