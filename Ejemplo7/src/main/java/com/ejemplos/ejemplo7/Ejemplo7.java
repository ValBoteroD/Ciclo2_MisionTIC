

package com.ejemplos.ejemplo7;


public class Ejemplo7 {

    public static void main(String[] args) {
        // declaración de arreglo 
        int vector[]=new int[10];
        // llenar el vector 
        for (int i =0; i<vector.length; i++){
            vector[i]=i;
        }
        //mostrar el vector por pantalla
        for (int i=0; i <vector.length; i++){
            System.out.println(vector[i]); 
        }
    }
    
}
