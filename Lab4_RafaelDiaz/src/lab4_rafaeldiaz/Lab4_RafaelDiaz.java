/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

import java.util.ArrayList;
import java.util.Date;
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

    static String nombre;
    static String id;
    static int edad;
    static double alturapersona, peso;
    static String residencia;

    static double dinero;
    static String fecha_compra;
    static String hora_entrada, hora_salida, fechai;

    static Date fecha;
    static String contrasena;
static double sueldo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A_dePlanta ap = new A_dePlanta();
        A_regionales ar = new A_regionales();
        A_plataforma aplat = new A_plataforma();
        A_temporales at = new A_temporales();
        ArrayList<Almacen> almacenes = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
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
                            int opal = sc.nextInt();
                            switch (opal) {
                                case 1:
                                    System.out.println("Ingrese el numero de plantas");
                                    numplantas = sc.nextInt();
                                    almacenes.add(new A_dePlanta(numplantas, tamanometros, altura));
                                    break;
                                case 2:
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre del departamento");
                                    nombredepart = sc.nextLine();
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
                            for (int i = 0; i < almacenes.size(); i++) {
                                System.out.println(i + " " + almacenes.get(i));
                            }
                            System.out.println("\nQue almacen desea modificar? 0,1,2...");
                            int pos = sc.nextInt();

                            if (almacenes.get(pos) instanceof A_dePlanta) {
                                System.out.println("Que desea modificar?(empezando en 1)");
                                int posmod = sc.nextInt();
                                if (posmod == 1) {
                                    System.out.println("Ingrese un nuevo numero de plantas");
                                    numplantas = sc.nextInt();
                                    ((A_dePlanta) almacenes.get(pos)).setNumplantas(numplantas);
                                } else if (posmod == 2) {
                                    System.out.println("Ingrese un nuevo tamaño en metros");
                                    tamanometros = sc.nextDouble();
                                    almacenes.get(pos).setTamanometros(tamanometros);

                                } else if (posmod == 3) {
                                    System.out.println("Ingrese una nueva altura");
                                    altura = sc.nextDouble();
                                    almacenes.get(pos).setAltura(altura);
                                } else {
                                    System.out.println("No existe esa posicion");
                                }

                            } else if (almacenes.get(pos) instanceof A_regionales) {
                                System.out.println("Que desea modificar?(empezando en 1)");
                                int posmod = sc.nextInt();
                                if (posmod == 1) {
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese un nuevo nombre de departamento");
                                    nombredepart = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    ((A_dePlanta) almacenes.get(pos)).setNumplantas(numplantas);
                                    ((A_regionales) almacenes.get(pos)).setNombredepartamento(nombredepart);
                                } else if (posmod == 2) {
                                    System.out.println("Ingrese un nuevo tamaño en metros");
                                    tamanometros = sc.nextDouble();
                                    almacenes.get(pos).setTamanometros(tamanometros);

                                } else if (posmod == 3) {
                                    System.out.println("Ingrese una nueva altura");
                                    altura = sc.nextDouble();
                                    almacenes.get(pos).setAltura(altura);
                                } else {
                                    System.out.println("No existe esa posicion");
                                }
                            } else if (almacenes.get(pos) instanceof A_plataforma) {
                                System.out.println("Que desea modificar?(empezando en 1)");
                                int posmod = sc.nextInt();
                                if (posmod == 1) {
                                    System.out.println("Ingrese un nuevo tamaño en metros");
                                    tamanometros = sc.nextDouble();
                                    almacenes.get(pos).setTamanometros(tamanometros);
                                } else if (posmod == 2) {
                                    System.out.println("Ingrese una nueva altura");
                                    altura = sc.nextDouble();
                                    almacenes.get(pos).setAltura(altura);

                                } else {
                                    System.out.println("No existe esa posicion");
                                }

                            } else if (almacenes.get(pos) instanceof A_temporales) {
                                System.out.println("Que desea modificar?(empezando en 1)");
                                int posmod = sc.nextInt();
                                if (posmod == 1) {
                                    System.out.println("Ingrese un nuevo tamaño en metros");
                                    tamanometros = sc.nextDouble();
                                    almacenes.get(pos).setTamanometros(tamanometros);
                                } else if (posmod == 2) {
                                    System.out.println("Ingrese una nueva altura");
                                    altura = sc.nextDouble();
                                    almacenes.get(pos).setAltura(altura);

                                } else {
                                    System.out.println("No existe esa posicion");
                                }
                            }
                            break;
                        case 3:
                            for (int i = 0; i < almacenes.size(); i++) {
                                System.out.println(i + " " + almacenes.get(i));
                            }
                            System.out.println("\nQue almacen desea eliminar? 0,1,2...");
                            int poseliminar = sc.nextInt();
                            almacenes.remove(poseliminar);

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
                            sc = new Scanner(System.in);
                            System.out.println("Ingrese el nombre");
                            nombre = sc.nextLine();
                            sc = new Scanner(System.in);
                            System.out.println("Ingrese el id");
                            id = sc.next();
                            System.out.println("Ingrese la edad");
                            edad = sc.nextInt();
                            System.out.println("Ingrese la altura");
                            alturapersona = sc.nextDouble();
                            System.out.println("Ingrese el peso");
                            peso = sc.nextDouble();
                            sc = new Scanner(System.in);
                            System.out.println("Ingrese la residencia");
                            residencia = sc.nextLine();
                            sc = new Scanner(System.in);
                            System.out.println("\n1. Empleado\n2. Cliente");
                            int quees = sc.nextInt();
                            if (quees == 1) {
                                System.out.println("Ingrese sueldo");
                                double sueldo = sc.nextDouble();
                                System.out.println("1. De Carga\n2. De seguridad");
                                int trab = sc.nextInt();
                                if (trab == 1) {
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese hora de entrada");
                                    hora_entrada = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese hora de salida");
                                    hora_salida = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese la fecha de inicio");
                                    fechai = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    personas.add(new Carga(hora_entrada, hora_salida, fechai, sueldo, nombre, id, edad, altura, peso, residencia));
                                } else {
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese una contraseña");
                                    contrasena = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    personas.add(new eSeguridad(fecha, contrasena, sueldo, nombre, id, edad, altura, peso, residencia));
                                }

                            } else if (quees == 2) {
                                System.out.println("Ingrese cantidad de dinero");
                                dinero = sc.nextDouble();
                                sc = new Scanner(System.in);
                                System.out.println("Ingrese la fecha de compra");
                                fecha_compra = sc.nextLine();
                                sc = new Scanner(System.in);
                                personas.add(new Cliente(dinero, fecha_compra, nombre, id, edad, altura, peso, residencia));
                            } else {
                                System.out.println("Esa no es una opcion");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < personas.size(); i++) {
                                System.out.println(i + " " + personas.get(i));
                            }
                            System.out.println("\nQue persona desea modificar? 0,1,2...");
                            int permod = sc.nextInt();
                            if (personas.get(permod) instanceof Empleado) {
                                if (personas.get(permod) instanceof Carga) {
                                
                                    System.out.println("Que desea modificar? 0,1,2...");
                                int modper = sc.nextInt();
                                switch (modper) {
                                    case 1:
                                        sc = new Scanner(System.in);
                                        System.out.println("Ingrese nueva hora de entrada");
                                        hora_entrada = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        ((Carga)personas.get(permod)).setHora_entrada(hora_entrada);
                                        break;
                                    case 2:
                                        sc = new Scanner(System.in);
                                         System.out.println("Ingrese nueva hora de salida");
                                        hora_salida = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        ((Carga)personas.get(permod)).setHora_salida(hora_salida);
                                        break;
                                    case 3:
                                        sc = new Scanner(System.in);
                                        System.out.println("Ingrese nueva fecha");
                                        fechai = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        ((Carga)personas.get(permod)).setFecha(fechai);
                                        break;
                                    case 4:
                                         System.out.println("Ingrese nuevo sueldo");
                                        sueldo= sc.nextDouble();
                                        ((Carga)personas.get(permod)).setSueldo(sueldo);
                                    case 5:
                                        sc = new Scanner(System.in);
                                         System.out.println("Ingrese nuevo nombre");
                                        nombre = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        ((Carga)personas.get(permod)).setNombre(nombre);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese nuevo id");
                                        id = sc.next();
                                        ((Carga)personas.get(permod)).setId(id);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese nueva edad");
                                        edad = sc.nextInt();
                                        ((Carga)personas.get(permod)).setEdad(edad);
                                        break;
                                    case 8:
                                        System.out.println("Ingrese nueva altura");
                                        altura = sc.nextDouble();
                                        ((Carga)personas.get(permod)).setAltura(altura);
                                        break;
                                    case 9:
                                        System.out.println("Ingrese nuevo peso");
                                        peso = sc.nextDouble();
                                        ((Carga)personas.get(permod)).setPeso(peso);
                                        break;
                                    case 10:
                                        sc = new Scanner(System.in);
                                        System.out.println("Ingrese nueva residencia");
                                        residencia = sc.nextLine();
                                        ((Carga)personas.get(permod)).setResidencia(residencia);
                                        sc = new Scanner(System.in);
                                        break;
                                }
                                    
                                } else {
    //eSeguridad(Date fecha, String contrasena, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia)
                                System.out.println("Que desea modificar? 0,1,2...");
                                int modper = sc.nextInt();
                                switch (modper) {
                                    
                                    case 1:
                                    case 2:
                                        System.out.println("Ingrese nueva contraseña");
                                        contrasena = sc.next();
                                        ((eSeguridad)personas.get(permod)).setContrasena(contrasena);
                                        break;
                                    case 3:
                                         System.out.println("Ingrese nuevo sueldo");
                                        sueldo= sc.nextDouble();
                                        ((eSeguridad)personas.get(permod)).setSueldo(sueldo);
                                    case 4:
                                        sc = new Scanner(System.in);
                                         System.out.println("Ingrese nuevo nombre");
                                        nombre = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        ((eSeguridad)personas.get(permod)).setNombre(nombre);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese nuevo id");
                                        id = sc.next();
                                        ((eSeguridad)personas.get(permod)).setId(id);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese nueva edad");
                                        edad = sc.nextInt();
                                        ((eSeguridad)personas.get(permod)).setEdad(edad);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese nueva altura");
                                        altura = sc.nextDouble();
                                        ((eSeguridad)personas.get(permod)).setAltura(altura);
                                        break;
                                    case 8:
                                        System.out.println("Ingrese nuevo peso");
                                        peso = sc.nextDouble();
                                        ((eSeguridad)personas.get(permod)).setPeso(peso);
                                        break;
                                    case 9:
                                        sc = new Scanner(System.in);
                                        System.out.println("Ingrese nueva residencia");
                                        residencia = sc.nextLine();
                                        ((eSeguridad)personas.get(permod)).setResidencia(residencia);
                                        sc = new Scanner(System.in);
                                        break;
                                    default:
                                        System.out.println("No es una opcion");
                                        break;
                                }
                                    
                                }

                            } else if (personas.get(permod) instanceof Cliente) {
                                
                                System.out.println("Que desea modificar? 0,1,2...");
                                int modper = sc.nextInt();
                                switch (modper) {
                                    case 1:
                                        System.out.println("Ingrese nuevo monto de dinero");
                                        dinero = sc.nextDouble();
                                        ((Cliente)personas.get(permod)).setDinero(dinero);
                                        break;
                                    case 2:
                                        sc = new Scanner(System.in);
                                        System.out.println("Ingrese nueva fecha de compra");
                                        fecha_compra = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        ((Cliente)personas.get(permod)).setFecha_compra(fecha_compra);
                                        break;
                                    case 3:
                                       
                                        sc = new Scanner(System.in);
                                         System.out.println("Ingrese nuevo nombre");
                                        nombre = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        ((Cliente)personas.get(permod)).setNombre(nombre);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese nuevo id");
                                        id = sc.next();
                                        ((Cliente)personas.get(permod)).setId(id);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese nueva edad");
                                        edad = sc.nextInt();
                                        ((Cliente)personas.get(permod)).setEdad(edad);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese nueva altura");
                                        altura = sc.nextDouble();
                                        ((Cliente)personas.get(permod)).setAltura(altura);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese nuevo peso");
                                        peso = sc.nextDouble();
                                        ((Cliente)personas.get(permod)).setPeso(peso);
                                        break;
                                    case 8:
                                        sc = new Scanner(System.in);
                                        System.out.println("Ingrese nueva residencia");
                                        residencia = sc.nextLine();
                                        ((Cliente)personas.get(permod)).setResidencia(residencia);
                                        sc = new Scanner(System.in);
                                        break;
                                }

                            }

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
