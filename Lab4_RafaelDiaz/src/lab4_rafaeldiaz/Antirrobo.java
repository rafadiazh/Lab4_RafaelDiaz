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
public class Antirrobo {

    public Antirrobo() {
    }

    public char[][] Riel(String codigo) {
        char[][] cripted = new char[3][codigo.length()];
        for (int i = 0; i < cripted.length; i++) {
            for (int j = 0; j < cripted[i].length; j++) {
                cripted[i][j] = '-';
            }

        }
        int auxiliar = 0, auxiiar2 = 0;
        int bandera = 1;
        for (int i = 0; i < cripted.length; i++) {
            for (int j = 0; j < cripted[i].length; j++) {
                cripted[i][j] = '-';
            }

        }

    }

}
