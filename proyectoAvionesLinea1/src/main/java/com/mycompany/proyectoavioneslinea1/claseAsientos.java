
package com.mycompany.proyectoavioneslinea1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johann alejandro torres soler 
 */
public class claseAsientos {
    

    
     private String idAsiento;
     
     /**
      * lista de la persona 
      */
     private List<Persona> listaPersona ;

    public claseAsientos(String idAsiento) {
        this.idAsiento = idAsiento;
        this.listaPersona =  new ArrayList<Persona>();
    }

  

    
    

    public List<Persona> getListaCliente() {
        return listaPersona;
    }

    /**
     *asignacion datos a persona 
     */
    public void setListaCliente(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
     
     
    
}
