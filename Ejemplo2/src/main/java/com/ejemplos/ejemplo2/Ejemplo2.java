/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejemplos.ejemplo2;

/**
 *
 * @author 57304
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        System.out.println("Ejemplo 2");
        // comentario 1 linea
        /* comentario de 
        varias lineas
        */
        // TIPOS DE VARIABLES
        String nombre= "David";
        // tipo [variable] = valor;
        System.out.println("hola,"+ nombre);
        //si escribo sout y tab aparece solo el comando para imprimir por consola
        //para concatenar uso +
        // int, string, float, double, bool
        int telefono =123;
        System.out.println(nombre+" su numero de telefono es "+ telefono);
        double estatura=1.70;
        System.out.println("La estura de "+nombre+"es "+estatura+" metros");
        
        boolean ok=true;
        System.out.println(ok);
    }
}
