/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2p1_luismendoza;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;



public class Lab2P1_LuisMendoza {

    public static void Menu(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido al Lab #1");
        
        do{
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. Ejercicio #1");
        System.out.println("2. Ejercicio #2");
        System.out.println("3. Ejercicio #3");
        System.out.println("4. Salir");
        int opcionUsuario = entrada.nextInt();
        
        if(opcionUsuario == 1){
            
            System.out.println("Ingrese el numero de discos");
            int n = entrada.nextInt();
            
            Ejercicio1(n,1,2,3);
            
            
            
        } else if(opcionUsuario == 2) {
            
            System.out.println("Ingrese una cadena de la siguiente: ");
            System.out.println("Ejemplo:");
            System.out.println("04/08/2001,Luis,Carlo,9/9/2021,Mendoza");
            
            String cadena = entrada.next();
            
            Ejercicio2(cadena);
            
            
        } else if (opcionUsuario == 3){
            
            System.out.println("Ingrese un valor de k");
            double k = entrada.nextDouble();
            double n = 0;
            
            
            
                    
            System.out.println(Ejercicio3(k,n));
            
            
            
        } else if(opcionUsuario == 4){
            System.out.println("Bye Bye");
            break;
            
        }else{
            
            System.out.println("Opción no valida");
        }
        
        
        } while(true);
        
       
    }
    
    public static void Ejercicio1 (int n, int origen, int auxiliar, int destino){
        if (n == 1){
            System.out.println("Mover disco 1" + " de " + origen + " a " + destino);
        } else {
            
            
            Ejercicio1(n-1,origen,destino,auxiliar);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            Ejercicio1(n-1,auxiliar,origen,destino);
            
        }
    }
    
    
    public static void Ejercicio2(String cadena){
        
        String cadena2;
        Date fecha;
        SimpleDateFormat dateM = new SimpleDateFormat("dd/MM/yyyy");
      
        String t[]=cadena.split(",");
       
        for (int i = 0; i < t.length; i++) {
            
            if(t[i].contains("1") || t[i].contains("2")||t[i].contains("3")||t[i].contains("4")||t[i].contains("5")||t[i].contains("6")||t[i].contains("7")||t[i].contains("8")||t[i].contains("9")||t[i].contains("0") && t[i].contains("/") ){
                fecha = new Date(t[i]);
                cadena2 = dateM.format(fecha);
            
                fecha = new Date(cadena2);
                
                if((fecha.getMonth() == 2) && (fecha.getDay()>= 28)){
                    System.out.println(fecha);
                    
                } else if((fecha.getMonth()<= 12) && (fecha.getDay()<=31)){
                    System.out.println(fecha);
                }
            
                
            } else{
                System.out.println("");
            }
  
            
        }
        
    }
    
    public static double Ejercicio3(double k,double n){

        if(k == n) {
            
            return 0;
            
        } else  {
            
            double div = (Math.pow(-1, n));
            
            double den = (2*n) + 1;
            
            double sum = 4 * (div/den);
            
            return sum + Ejercicio3(k,n+1);
            
        }
            
        
        
    }
    
    
    
      public static double Exponent(double numero1 , double numero2){
        
        if (numero1 == 1){
            
            return numero2;
            
        } else if (numero1 == 0){
            
            return 1;
            
        } else {
            
            numero1 = numero1 - 1;
            
            return numero2 * Exponent(numero1 , numero2);
            
        } 
            
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Menu();
        
        
    }
    
}
