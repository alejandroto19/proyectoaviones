
package com.mycompany.proyectoavioneslinea1;

/**
 *
 * @author johann alejandro torres soler 
 */
public class avionSoloVip extends padreAvion{
    
    private String AvionSoloVip[][];


    
    /**
     * constructor 
     */
    public avionSoloVip() {
        this.AvionSoloVip=new String[3][2];
    }

   
    public String[][] getListaAcionC() {
        return AvionSoloVip;
    }

    
    public void setListaAcionC(String[][] listaAcionC) {
        this.AvionSoloVip = listaAcionC;
    }
    
    /**
     * llenado de matriz 
     */
    public void generarListaAvion(){
        int cont=0;
         for (int x=0; x < AvionSoloVip.length; x++) {
            for (int y=0; y < AvionSoloVip[x].length; y++) {
                    AvionSoloVip[x][y] = "Ex"+cont;
                    cont++;
            }
        }
        
        
    
    }
    
    /**
     * imprimir avion
     */
    public void imprimirListaAvion(){
        for (int x=0; x < AvionSoloVip.length; x++) {
            System.out.print("°°!");
            for (int y=0; y < AvionSoloVip[x].length; y++) {
                System.out.print (AvionSoloVip[x][y]);
                if (y!=AvionSoloVip[x].length-1) System.out.print("\t");
            }
            System.out.println("!°°");
        }
    }
    
   
   
    
    
    
    
    
   
     
    
    
    
}
