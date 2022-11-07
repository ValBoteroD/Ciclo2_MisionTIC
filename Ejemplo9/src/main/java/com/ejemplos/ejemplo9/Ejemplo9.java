
package com.ejemplos.ejemplo9;

import java.util.Scanner;



public class Ejemplo9 {

    public static void main(String[] args) {
        //creamos scanner
        Scanner lector= new Scanner(System.in);
        
        int f; 
        int c;
        System.out.println("ingrese cuantas filas desea");
        f=lector.nextInt();
        System.out.println("Ingrese cuantas columnas desea");
        c=lector.nextInt();
        

//Declarar
        String letras[][]=new String [f][c];
        
        
        
        
        // llenar la matriz
        for(int fila=0; fila<letras.length; fila++){
            for(int col=0; col<letras[0].length;col++){
                System.out.println("ingrese una letra: ");
                letras[fila][col]= lector.next();
            }
        }
        System.out.print("\nRespuesta\n");
        
        // mostrar la matriz
        for(int fila=0; fila<letras.length; fila++){
            for(int col=0; col<letras[0].length;col++){
                System.out.print(letras[fila][col]+"\t");
            }
            System.out.print("\n");
        }
        
        
        // como mostrar las letras de la diagonal principal de la matriz
        if (f==c){
            String diagonal[]= new String[f];

            for(int fila=0; fila<letras.length; fila++){
                for(int col=0; col<letras[0].length;col++){
                    if (fila==col){
                        diagonal[fila]=letras[fila][col];
                        System.out.println(diagonal[fila]);
                    }

                }
            }
        }else{
            System.out.println("la matriz no es cuadrada");
        }       
    }
}
