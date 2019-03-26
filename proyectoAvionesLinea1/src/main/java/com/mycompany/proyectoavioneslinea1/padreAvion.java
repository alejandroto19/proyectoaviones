
package com.mycompany.proyectoavioneslinea1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johann alejandro torres soler 
 */
public abstract  class padreAvion {
 
    /**
     * lista de asientos  
     */
    protected List<claseAsientos> asientos;

    /**
     * constructor 
     */
    public padreAvion() {
        this.asientos = new ArrayList<>();
    }

   

    
    public List<claseAsientos> getSillaAvion() {
        return asientos;
    }

    
    public void setSillaAvion(List<claseAsientos> sillaAvion) {
        this.asientos = asientos;
    }
    
    
    
}
