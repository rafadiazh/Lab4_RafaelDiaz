/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_rafaeldiaz;

import java.util.Date;

/**
 *
 * @author Josue Rodriguez
 */
public class eSeguridad extends Empleado{
    
    Date fecha;
    String contrasena;
    public eSeguridad() {
        super();
    }

    public eSeguridad(Date fecha, String contrasena, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(sueldo, nombre, id, edad, altura, peso, residencia);
        this.fecha = fecha;
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString()+"eSeguridad{" + "fecha=" + fecha + '}';
    }

    
    
    
    
    
    
}
