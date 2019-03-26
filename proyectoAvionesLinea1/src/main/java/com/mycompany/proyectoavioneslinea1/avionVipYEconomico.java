
package com.mycompany.proyectoavioneslinea1;

/**
 *
 * @author johann alejandro torres soler 
 */
public class avionVipYEconomico extends padreAvion{
    /**
     * se crean las matricez  
     */
    private String asientosVip[][] ;
    private String asientosEconomicos[][];

    
   
    
    /**
     *constructor
     */
    public avionVipYEconomico() {
        this.asientosEconomicos = new String[6][6];
        this.asientosVip= new String[2][3];
    }

   
    public String[][] getasientosVip() {
        return asientosVip;
    }
    
    
    public void setasientosVip(String[][] asientosVip) {
        this.asientosVip = asientosVip;
    }

    
    public String[][] getasientosEconomicos() {
        return asientosEconomicos;
    }

   
    public void setasientosEconomicos(String[][] asientosEconomicos) {
        this.asientosEconomicos = asientosEconomicos;
    }
    
   
    public void asientosVip(){
        int contador=0;
        for (int x=0; x < asientosVip.length; x++) {
            for (int y=0; y < asientosVip[x].length; y++) {
                    asientosVip[x][y] = "A"+contador;
                    contador+=1;
            }
        }
    }
    
    /**
     * metodo que  imprime la matriz 
     */
    public void mostrarAsientosVip(){
        System.out.println("****************Zona Vip*************");
        for (int x=0; x < asientosVip.length; x++) {
            System.out.print("!ºº");
            for (int y=0; y < asientosVip[x].length; y++) {
                System.out.print (asientosVip[x][y]);
                if (y!=asientosVip[x].length-1) System.out.print("\t");
            }
            System.out.println("ºº!");
        }
        System.out.println("****************************************");
    }
    
    /**
     * metodo que genera los datos 
     */
    public void asientosEconomicos(){
        int contador=6;
        for (int x=0; x < asientosEconomicos.length; x++) {
            for (int y=0; y < asientosEconomicos[x].length; y++) {
                    asientosEconomicos[x][y] = "A"+contador;
                    contador+=1;
                    
            }
        }
    }
    
    /**
     *imprime
     */
    public void mostrarAsientosEconomicos(){
        System.out.println("**************zona Economica***************");
        for (int x=0; x < asientosEconomicos.length; x++) {
            System.out.print("!ºº");
            for (int y=0; y < asientosEconomicos[x].length; y++) {
                
                System.out.print (asientosEconomicos[x][y]);
                if (y!=asientosEconomicos[x].length-1) System.out.print("\t");
            }
            System.out.println("ºº!");
        }
        System.out.println("**********************************************");
    }
    
    /**
     * metodo que se encarga de buscar la silla que se quiere reservar y pasa su valor dentro de la matriz
     * por una x
     * @param valor 
     */
    public void marcarAsientoEconomico(String valor){
       for (int x=0; x < asientosEconomicos.length; x++) {
                for (int y=0; y < asientosEconomicos[x].length; y++) {
                        if(asientosEconomicos[x][y].equals(valor)){
                            asientosEconomicos[x][y] = "x"; 
                           
                        }
                }
            }
    }
    
  
    
   
    
    
    
    
   
   
    
  
    
    /**
    * despedir avion 
     */
    public int despedirAvionEconomicoyVIP(int estadoavion){
        
        if(estadoavion==1){
         
            System.out.println("El avion se ha ido ");
            estadoavion=-1;
            return estadoavion;
        }
        
        return estadoavion;
    }
}
