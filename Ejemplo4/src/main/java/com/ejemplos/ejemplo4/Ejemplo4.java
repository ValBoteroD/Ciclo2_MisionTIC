/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejemplos.ejemplo4;
import java.util.Scanner;

/**
 *
 * @author 57304
 */

//TRABAJO CON CONDICIONALES
// Cual nuemro es mayor?
public class Ejemplo4 {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner lector=new Scanner(System.in);
        
        System.out.println("ingrese un numero:");
        num1=lector.nextInt();
        
        System.out.println("ingrese un numero:");
        num2=lector.nextInt();
        
        /*
        if (hoy es domingo) {
            hay clase de java
        }
        else if (hoy es sabado){
            hay clase de web
        }
        */
        if (num1>num2){
            System.out.println("El numero mayor es "+num1);
  
        }
        else if (num2>num1){
            System.out.println("El numero mayor es "+num2);
        }
        else {
            System.out.println("Los numeros son iguales");
        }
        //analogia con la moneda
        String opcion ="cara";
        if (opcion=="cara"){
            System.out.println("La moneda esta en cara");
            
        }
        else{
            System.out.println("La moneda esta en sello");
        }
        
    }
}
