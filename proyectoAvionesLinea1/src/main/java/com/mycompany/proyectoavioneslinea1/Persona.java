
package com.mycompany.proyectoavioneslinea1;

import java.util.Date;

/**
 *
 * @author Johann Alejandro Torres Soler 
 */
public class Persona {
  
     private int cedula;
    
    private String nombre;
    
    private Date fechaNacimiento;

    public Persona(int cedula, String nombre, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdentifiacion() {
        return cedula;
    }

    public void setIdentifiacion(int identifiacion) {
        this.cedula = identifiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
