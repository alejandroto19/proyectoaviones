
package com.mycompany.proyectoavioneslinea1;

/**
 *
 * @author johann alejandro torres soler 
 */
public class avionSoloEconomico extends padreAvion {
    /**
     * matriz 
     */
    private String listAvionEcono[][];
    
    
   
    
    /**
     * inicializcion
     */
    public avionSoloEconomico() {
        this.listAvionEcono = new String[5][3];
    }
 /**
     * constructor
     */
    
    public String[][] getListaAvion() {
        return listAvionEcono;
    }

    
    public void setListaAvion(String[][] listaAvion) {
        this.listAvionEcono = listaAvion;
    }
    
   
    public void crearavion(){
        int contador=0;
         for (int x=0; x < listAvionEcono.length; x++) {
            for (int y=0; y < listAvionEcono[x].length; y++) {
                    listAvionEcono[x][y] ="econo"+contador;
                    contador++;
            }
        }
    }
    
    /**
     * imprimir avion
     */
    public void mostrarAvionEconomico(){
        System.out.println("**********AVION SOLO ECONOMICO*************");
        for (int x=0; x < listAvionEcono.length; x++) {
            System.out.print("");
            for (int y=0; y < listAvionEcono[x].length; y++) {
               System.out.print (listAvionEcono[x][y]);
                if (y!=listAvionEcono[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
        System.out.println("****************************************");
    }
    
    
    
    public void marcarsillaEconomica(String valor){
       for (int x=0; x < listAvionEcono.length; x++) {
            for (int y=0; y < listAvionEcono[x].length; y++) {
                    if(listAvionEcono[x][y].equals(valor)){
                        listAvionEcono[x][y] = "x"; 
                    }
            }
        }
    }
    
   
    
    
    
    
    public int despergarAvionSoloEconomico(int estadoavionecono){
        
        if(estadoavionecono==1){
             System.out.println("El avion economico se ha ido");
            estadoavionecono=-1;
            }
          
          
            return estadoavionecono;
        }
        
   
    
}
