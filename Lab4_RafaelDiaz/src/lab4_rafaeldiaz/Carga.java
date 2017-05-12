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
public class Carga extends Empleado{
    
    String hora_entrada, hora_salida, fecha;

    public Carga() {
        super();
    }
    
    

    public Carga(String hora_entrada, String hora_salida, String fecha, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(sueldo, nombre, id, edad, altura, peso, residencia);
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.fecha = fecha;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Carga{" + "hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
