/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejemplos.ejemplo3;
// las importaciones de librerias se ponen despues de los paquetes
// esta libreria me permite ingresar datos por consola
import java.util.Scanner;

/**
 *
 * @author 57304
 */
// ingresar datos por consola
// operaciones matematicas
public class Ejemplo3 {

    public static void main(String[] args) {
        // tipo de variable <objeto> que se llama scanner
        //scanner sirve para ingresar datos por consola
        Scanner lector=new Scanner (System.in); //crea el objeto e instanciarlo
        System.out.println("ingrese un numero ");//envio un mensaje
        int num1=lector.nextInt();
        //System.out.println("el numero que ingreso es "+ num);
        System.out.println("ingrese otro numero ");
        int num2=lector.nextInt();
        System.out.println("los numeros que ingresaron fueron "+ num1+"y "+num2);
        
        //operaciones
        int suma;
        int resta;
        int multi;
        double div;
        
        suma=num1 + num2;
        resta=num1- num2;
        multi=num1*num2;
        
        
        div=(double)num1/num2;
        
        //mostrar resultados
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(div);
    }
}
