/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Lab4_RafaelDiaz {

    static Scanner sc = new Scanner(System.in);
    static double tamanometros, altura;
    static int numplantas;
    static String nombredepart;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RAFA ESTO SOLO ES PRUEBA SE PUEDE BORRAR
        Antirrobo a = new Transposicion();
        System.out.println("CONTRA: ");
        String x = sc.next();
        System.out.println(a.codificacion(x, "HOLA"));
        String y = a.codificacion(x, "HOLA");
        System.out.println(a.decodificacion(y, "HOLA"));
        //HASTA AQUI
        A_dePlanta ap = new A_dePlanta();
        A_regionales ar = new A_regionales();
        A_plataforma aplat = new A_plataforma();
        A_temporales at = new A_temporales();
        ArrayList<Almacen> almacenes = new ArrayList();
        int opcion;
        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Almacen\n2. Persona\n3. Producto\n4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1. Agregar\n2. Modificar\n3. Eliminar\n4. Transferir");
                    int op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Tamaño en metros");
                            tamanometros = sc.nextDouble();
                            System.out.println("Altura del Almacen");
                            altura = sc.nextDouble();
                            System.out.println("Que tipo de Almacen desea crear?\n 1. De planta\n 2. Regioinales\n 3. Plataforma\n 4. Temporales");
                            int opal= sc.nextInt();
                            switch(opal){
                                case 1:
                                    System.out.println("Ingrese el numero de plantas");
                                    numplantas = sc.nextInt();
                                    almacenes.add(new A_dePlanta(numplantas, tamanometros, altura));
                                    break;
                                case 2:
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre del departamento");
                                    nombredepart =sc.next();
                                    sc = new Scanner(System.in);
                                    almacenes.add(new A_regionales(nombredepart, tamanometros, altura));
                                    break;
                                case 3:
                                    almacenes.add(new A_plataforma(tamanometros, altura));
                                    break;
                                case 4:
                                    almacenes.add(new A_temporales(tamanometros, altura));
                                    break;
                                default:
                                    System.out.println("Esa opcion no es valida");
                                    break;
                            }
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            System.out.println("Esa no es una opcion :D");
                            break;
                    }

                    break;
                case 2:
                    System.out.println("1. Agregar\n2. Modificar\n3. Eliminar");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:
                            System.out.println("Esa no es una opcion :D");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Agregar\n2. Modificar\n3. Eliminar");
                    int op3 = sc.nextInt();
                    switch (op3) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:
                            System.out.println("Esa no es una opcion :D");
                            break;
                    }
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Esa no es una opcion :D");
                    break;
            }
        } while (opcion != 4);
    }

}
