
package com.ejemplos.ejemplo8;

// Matriz o veector bidimensional
public class Ejemplo8 {

    public static void main(String[] args) {
        // comienza a llenarse horizontalmente
        //declaracion
        int matriz[][]=new int [20][6];
        //modificador con contador
        int contador=0;
        
        //llenar la matriz
        for(int i=0; i<matriz.length;i++){ //recorre las filas
            for (int j=0; j<matriz[0].length;j++){ // recorre columnas
                //llenar la matriz
                matriz[i][j]=contador;
                contador++;
            }
        }
        
        // mostrar la matriz
        for(int i=0; i<matriz.length;i++){ //recorre las filas
            for (int j=0; j<matriz[0].length;j++){ // recorre columnas
                System.out.print(matriz[i][j]+"\t");
                
            }
            System.out.print("\n");
            // secuencias de escape: son comandos que permiten que mientras se muestra informacion en la consola, actuen como cpmandos del pc
            //ejemplo \n deja un reglon, \t aplica tabulacion 
        }
    }
}
