
package com.mycompany.proyectoavioneslinea1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Johann Alejandro Torres Soler 
 */
public class Principal {
    /**
     * llamado a clases
     */
    avionVipYEconomico AvionVipYEconomico = new avionVipYEconomico();
    avionSoloEconomico AvionSoloEconomico = new avionSoloEconomico();
    avionSoloVip AvionSoloVip = new avionSoloVip();
    /**
     *inciializacion de variables
     */
    int estadomixto=1,estadoecono=1,estadovip=1;
    
    Scanner scanner = new Scanner(System.in);
    
    /**
     *inicio de metodos 
     */
    public Principal() {
        
        AvionVipYEconomico.mostrarAsientosVip();
        AvionVipYEconomico.mostrarAsientosEconomicos();
        AvionSoloEconomico.mostrarAvionEconomico();
        AvionSoloVip.generarListaAvion();
        menu();
    }
    
    /**
     * inicio menu principal 
     */
    public void menu(){
            int op=0;
            System.out.println("\n********************************");
            System.out.println("**         MENU PRINCIPAL     ****");
            System.out.println("*________________________________* ");
            System.out.println("* 1. VISUALIZAR AVION ECONO Y VIP*");
            System.out.println("*        2.AVION ECONOMICO       * ");
            System.out.println("*          3.AVION VIP           *");
            System.out.println("*           4.SALIR              *");
            try {
                op= scanner.nextInt();

                if(op == 1){
                    Avioneconovip();
                }else if(op == 2){
                    avionecono();
                }else if(op == 3){
                    menuAvionvip();
                }else if(op == 4){
                    System.exit(0);
                }else{
                    System.out.println("******************************");
                    System.out.println("\n DIGITE OPCION VALIDA");
                    menu();
                }
            } catch (InputMismatchException e) {
                System.out.println("\n <<<-----No seleccionaste un Numero ingreaste un caracter no valido----->>>");
                op=0;
                scanner = new Scanner(System.in);
                menu();
            }
    }
    
    /**
     * metodo para avion economico y vip
     */
    public void Avioneconovip(){
        int variableSeleccion=0;
        System.out.println("\n---------------------------");
        System.out.println("Avion ECONOMICO Y VIP: ");
        System.out.println("1.pedir  un Asiento");
        System.out.println("2.Despedir avion");
        System.out.println("3.Volver");
        try{
            variableSeleccion = scanner.nextInt();
            if(variableSeleccion == 1){
                menuReservarAvioeconoyvip();
            }else if(variableSeleccion == 2){
                despegarMixto();
            }else if(variableSeleccion == 3){
                menu();
            }else{
                System.out.println("-------------------------------");
                System.out.println("\n digite una opcion valida");
                Avioneconovip();
            }
        }catch(InputMismatchException e){
             System.out.println("\n <<<-----digite un dato correcto ----->>>");
             variableSeleccion=0;
             scanner = new Scanner(System.in);
             Avioneconovip();
        }
        
    }
    
    /**
     
     * meotodo para despegar avion 
     */
    public void despegarMixto(){
        estadomixto=AvionVipYEconomico.despedirAvionEconomicoyVIP(estadomixto);
        menu();
    }
    
    /**
     * menu de rservas avion vip y mixto
     */
    public void menuReservarAvioeconoyvip(){
        if(estadomixto == 1){
            int variableSeleccion=0;
            System.out.println("\n---------------------------");
            System.out.println("Reservar asientos: ");
           
            System.out.println("\n---------------------------");
            System.out.println("1.Reserva vip");
            System.out.println("2.Reserva normal");
            System.out.println("3.Volver");
            try {
                variableSeleccion= scanner.nextInt();
                if(variableSeleccion == 1){
                    reservaVip();
                }else if(variableSeleccion == 2){
                    reservaNormalMixto();
                }else if(variableSeleccion == 3){
                    Avioneconovip();
                }else{
                    System.out.println("\n---------------------------");
                    System.out.println("ingresar un dato valido");
                    menuReservarAvioeconoyvip();
                }

            } catch (InputMismatchException e) {
                System.out.println("\n <<<-----No seleccionaste un Numero ingreaste un caracter no valido----->>>");
                 variableSeleccion=0;
                 scanner = new Scanner(System.in);
                 menuReservarAvioeconoyvip();
        }
    }else if(estadomixto != 1){
            System.out.println("\n<<<<---------El avion ya despego--------->>>>");
            menu();
    }
        
}
    
    /**
     * menu sillas vip del avion econo y vip
     */
    public void reservaVip(){
                
            try{
                
                System.out.println("\n-----Reserva vip----- ");
                System.out.println("\nDigite El id de la silla: ");
                String numeroSilla = scanner.next();
                
                System.out.println("Digite la su Identificacion: ");
                int id = scanner.nextInt();
                System.out.println("Digite la su nombre: ");
                String nomb = scanner.next();
                System.out.println("Digite su Fecha de nacimiento(YYYY-MM-DD): ");
                String fech = scanner.next();
               
                
            }catch(InputMismatchException e){
                System.out.println("\n <<<-----Profavor ingrese un Dato valido, venta cancelada----->>>");
                scanner = new Scanner(System.in);
                reservaVip();
            }
    }
    
    /**
     * validar reservas  
     */
    public void validacionReservaMixtoVip(int valor){
           if(valor == 1){
                System.out.println("**********reserva exitosa **********");
          
            }
           
    }
    
   
    
    /**
     * menu sillas economics avion econo y mixto
     */
    public void reservaNormalMixto(){
         try{
                System.out.println("-----sillas economicas ----- ");
                System.out.println("\nDigite el numero del asirnto: ");
                String numeroSilla = scanner.next();
            
                System.out.println("Dijite la su cedula: ");
                int id = scanner.nextInt();
                System.out.println("Dijite la su nombre: ");
                String nomb = scanner.next();
                System.out.println("Dijite su Fecha de nacimiento: ");
                String fech = scanner.next();
              
                    continuareconovip();
                
                
            }catch(InputMismatchException e){
                System.out.println("\n *****dato erroneo ***");
                scanner = new Scanner(System.in);
                reservaNormalMixto();
            }
    }
    
  
    
    /**
     *metodo validar reserva econo
     
     */
    public void validacionReservaMixtoecono(int valor){
            if(valor == 1){
                System.out.println("------Reserva exitosa--------");
            }
            }
    
    
    
    
    /**
     * metido continuar reservando
     */
    public void continuareconovip(){
        System.out.println("\n----------------");
        System.out.println("Desea Continar?(S/N): ");
        String conti = scanner.next();
        if(conti.charAt(0) == 'S'){
            menuReservarAvioeconoyvip();
        }else if(conti.charAt(0) == 'N'){
            Avioneconovip();
        }else if(conti.charAt(0) != 'S' || conti.charAt(0) != 'N' ){
             System.out.println("dato erroneo");
             continuareconovip();
        }
    }
    
    /**
     * metodo avion solo economico 
     */
    public void avionecono(){
        if(estadoecono == 1){
            int variableSeleccion=0;
            System.out.println("\n------Avion economico------");
            
            System.out.println("1.pedir un Asiento");
            System.out.println("2.Despedir avion");
            System.out.println("3.volver");
            try{
                    variableSeleccion = scanner.nextInt();
                    if(variableSeleccion == 1){
                        menuReservarAvionecono();
                    }else if(variableSeleccion == 2){
                        despedirecono();
                    }else if(variableSeleccion == 3){
                        menu();
                    }else{
                        System.out.println("-------------------------------");
                        System.out.println("\n digite una opcion valida");
                        avionecono();
                    }
            }catch(InputMismatchException e){
                 System.out.println("\n **----caracter no valido---**");
                 variableSeleccion=0;
                 scanner = new Scanner(System.in);
                 avionecono();
            }
        }else if(estadoecono != 1){
            System.out.println("\n<<<<---------El avion ya se ha ido --------->>>>");
            menu();
        }
        
    }
    
    /**
     *despedir avion economico 
     */
    public void despedirecono(){
        estadoecono=AvionSoloEconomico.despergarAvionSoloEconomico(estadoecono);
        menu();
    }
    
    /**
     * reservar sillas avion economico 
     */
    public void menuReservarAvionecono(){
        int variableSeleccion=0;
        System.out.println("\n---------------------------");
        System.out.println("Reservar avion economico: ");
        AvionSoloEconomico.mostrarAvionEconomico();
        System.out.println("\n---------------------------");
        System.out.println("1.Reservar Asiento");
        System.out.println("2.Volver");
        try {
            variableSeleccion= scanner.nextInt();
            if(variableSeleccion == 1){
                reservaecono();
            }else if(variableSeleccion == 2){
                menuReservarAvionecono();
            }else{
                System.out.println("\n---------------------------");
                System.out.println("Ingrese un valor valido");
                menuReservarAvionecono();
            }
            
        } catch (InputMismatchException e) {
            System.out.println("\n **---  datos no  validos-----**");
             variableSeleccion=0;
             scanner = new Scanner(System.in);
             menuReservarAvioeconoyvip();
        }
    }
    
    /**
     * metodo reserva silla econo  
     */
    public void reservaecono(){
            try{
                System.out.println("-----Reserva Avion economico----- ");
                System.out.println("\nDigite El  codigo del asiento ");
                String numeroSilla = scanner.next();
               
                System.out.println("Digite la su Identificacion: ");
                int id = scanner.nextInt();
                System.out.println("Digite la su nombre: ");
                String nomb = scanner.next();
                System.out.println("Digite su Fecha de nacimiento: ");
                String fech = scanner.next();
               
            }catch(InputMismatchException e){
                System.out.println("\n **-----dato erroneo-----**");
                scanner = new Scanner(System.in);
                reservaecono();
            }
    }
    
   
    /**
     * validar economico 
     */
    public void validarAvionSoloEconomico(int valor){
           if(valor == 1){
                System.out.println("------Reserva con exito--------");
            }
            }
           
    
    
    /**
     *metodo coninuar en economico ??
     */
    public void continuarsoloecono(){
        System.out.println("\n----------------");
        System.out.println("Desea Continuar en economico ?(S/N): ");
        String conti = scanner.next();
        if(conti.charAt(0) == 'S'){
           reservaecono  ();
        }else if(conti.charAt(0) == 'N'){
            menuReservarAvionecono();
        }else if(conti.charAt(0) != 'S' || conti.charAt(0) != 'N' ){
             System.out.println("dato erroneo ");
             continuarsoloecono();
        }
    }
    
    
    
  
   
    /**
     * metodo menu avion vip 
     */
    public void menuAvionvip(){
        if( estadoecono== 1){
            System.out.println("\n------------Avion vip---------------");
            
            System.out.println("1.Reservar un Asiento");
            System.out.println("2.Despedir avion");
            System.out.println("3.Volver");
            try {
                int variableSeleccion = scanner.nextInt();
                if(variableSeleccion == 1){
                    menuReservarAvionExclusivo();
                }else if(variableSeleccion == 2){
                    despegarExclusivo();
                }else if(variableSeleccion == 3){
                    menu();
                }else{
                    System.out.println("-------------------------------");
                    System.out.println("\n digite opcion ");
                    menuAvionvip();
                }
            }catch (InputMismatchException e) {
                System.out.println("\n ****-----dato erroneo ----***");
                scanner = new Scanner(System.in);
                menuAvionvip();
            }
        }else if (estadoecono != 1){
            System.out.println("\n<<<<---------El avion ya se ha ido --------->>>>");
            menu();
        }
    }
    
    /**
     * metodo despedir aviongo
     */
    public void despegarExclusivo(){
        estadoecono=AvionSoloEconomico.despergarAvionSoloEconomico(estadoecono);
        menu();
    }
    
    /**
     * reserva avion vip
     */
    public void menuReservarAvionExclusivo(){
        int variableSeleccion=0;
        System.out.println("\n---------------------------");
        System.out.println("Reservar asientos avion vip: ");
        AvionSoloVip.imprimirListaAvion();
        System.out.println("\n---------------------------");
        System.out.println("1.Reservar Asiento");
        System.out.println("2.Volver");
        try {
            variableSeleccion= scanner.nextInt();
            if(variableSeleccion == 1){
                reservavip();
            }else if(variableSeleccion == 2){
                menuAvionvip();
            }else{
                System.out.println("\n---------------------------");
                System.out.println("Ingrese un valor valido");
                menuAvionvip();
            }
            
        } catch (InputMismatchException e) {
            System.out.println("\n ***----daro erroneo -----***");
             variableSeleccion=0;
             scanner = new Scanner(System.in);
             menuReservarAvionExclusivo();
        }
    }
    
    
    /**
     * guarar reserva vip
     */
    public void reservavip(){
            try{
                System.out.println("-----Reserva Avion Exclusivo----- ");
                System.out.println("\nDigite El id de la silla: ");
                String numeroSilla = scanner.next();
               // int valor = AvionSoloVip.buscarSillasExclusivas(numeroSilla);
                System.out.println("Digite la su Identificacion: ");
                int id = scanner.nextInt();
                System.out.println("Digite la su nombre: ");
                String nomb = scanner.next();
                System.out.println("Digite su Fecha de nacimiento(YYYY-MM-DD): ");
                String fech = scanner.next();
               
                
            }catch(InputMismatchException e){
                System.out.println("\n <<<-----Profavor ingrese un numero, venta cancelada----->>>");
                scanner = new Scanner(System.in);
                reservavip();
            }
    }
    
   
    
   
    
    /**
     *continuar en vip?
     */
     public void continuarvip(){
        System.out.println("\n----------------");
        System.out.println("Desea Continuar Reservando?(s/n): ");
        String conti = scanner.next();
        if(conti.charAt(0) == 's'){
            menuReservarAvionExclusivo();
        }else if(conti.charAt(0) == 'n'){
            menuAvionvip();
        }else if(conti.charAt(0) != 's' || conti.charAt(0) != 'n' ){
             System.out.println("ingrese un caracter valido");
             continuarvip();
        }
    }
    
}
