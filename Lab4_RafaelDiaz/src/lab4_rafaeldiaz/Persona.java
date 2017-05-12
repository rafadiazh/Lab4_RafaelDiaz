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
public class Persona {
    String nombre;
    String id;
    int edad;
    double altura, peso;
    String residencia;
    
    public Persona() {
    }

    public Persona(String nombre, String id, int edad, double altura, double peso, String residencia) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.residencia = residencia;
    }
    
    
    
}
