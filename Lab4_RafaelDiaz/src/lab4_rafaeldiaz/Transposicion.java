/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

import java.util.ArrayList;

/**
 *
 * @author Josue Rodriguez
 */
public class Transposicion extends Antirrobo {

    @Override
    public String codificacion(String x, String clave) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String abc2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = "", usar = "";
        for (int i = 0; i < x.length(); i++) {
            if ((int) x.charAt(i) >= 97) {
                usar = abc;
            } else {
                usar = abc2;
            }
            for (int j = 0; j < abc.length(); j++) {
                if (x.charAt(i) == usar.charAt(j)) {
                    int ayuda = (int) clave.charAt(i);
                    int bandera = 1;
                    if (ayuda >= 97 && ayuda <= 122) {
                        bandera = 1;
                    } else {
                        bandera = 2;
                    }
                    for (int k = 0; k < j; k++) {
                        if (bandera == 1) {
                            ayuda++;
                            if (ayuda == 123) {
                                ayuda = 97;
                            }
                        } else {
                            ayuda++;
                            if (ayuda == 91) {
                                ayuda = 65;
                            }
                        }

                    }
                    code += (char) ayuda;
                }
            }
        }
        return code;
    }

    @Override
    public String decodificacion(String y, String clave) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String abc2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = "", usar = "";
        ArrayList<Integer> numeros = new ArrayList();
        for (int i = 0; i < y.length(); i++) {
            if ((int) y.charAt(i) >= 97) {
                usar = abc;
            } else {
                usar = abc2;
            }
            for (int j = 0; j < abc.length(); j++) {
                if (y.charAt(i) == usar.charAt(j)) {
                    numeros.add(j);
                    int ayuda = (int) clave.charAt(i);
                    int bandera = 1;
                    if (ayuda >= 97 && ayuda <= 122) {
                        bandera = 1;
                    } else {
                        bandera = 2;
                    }
                    for (int k = 0; k < j; k++) {
                        if (bandera == 1) {
                            ayuda++;
                            if (ayuda == 123) {
                                ayuda = 97;
                            }
                        } else {
                            ayuda++;
                            if (ayuda == 91) {
                                ayuda = 65;
                            }
                        }

                    }
                    code += (char) ayuda;
                }
            }
        }
        System.out.println("PRUEBA del CODIGO: "+code);
        String devolver = "";
        for (int i = 0; i < code.length(); i++) {
            if ((int) code.charAt(i) >= 97) {
                usar = abc;
            } else {
                usar = abc2;
            }
            //CUANDO USEMOS ESTE METODO HAY QUE USAR LA CLAVE QUE ESTA GUARDADA
            for (int j = 0; j < abc.length(); j++) {
                if (code.charAt(i) == usar.charAt(j)) {
                    int ayuda = (int) code.charAt(i);
                    int bandera = 1;
                    if (ayuda >= 97 && ayuda <= 122) {
                        bandera = 1;
                    } else {
                        bandera = 2;
                    }
                    for (int k = 0; k < numeros.get(i); k++) {
                        if (bandera == 1) {
                            ayuda--;
                            if (ayuda == 96) {
                                ayuda = 122;
                            }
                        } else {
                            ayuda--;
                            if (ayuda == 64) {
                                ayuda = 90;
                            }
                        }

                    }
                    devolver += (char) ayuda;
                }
            }
        }
        return devolver;
    }

}
