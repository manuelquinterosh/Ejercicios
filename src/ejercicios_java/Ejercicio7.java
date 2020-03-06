/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio7 {
    
     public static void main(String[] args) {
         /**
          * Leer por teclado una serie de 10 numeros enteros. La aplicacion
          * debe indicarnos si los numeros estan ordenados de forma creciente, decreciente
          * o si estan desordenados
          */
         
         Scanner entrada = new Scanner(System.in);
         
         int arreglo[] = new int[10];
         
         boolean creciente=false, decreciente=false;
         
         System.out.println("Llenar el arreglo: ");
         for(int i =0; i<10; i++) {
             System.out.print((i+1)+ ". Digite un numero: ");
             arreglo[i] = entrada.nextInt();
         }
         
         for(int i=0; i<9; i++){
             if(arreglo[i] < arreglo[i+1]){
                 creciente = true;
             }if(arreglo[i] > arreglo[i+1]){
                 decreciente = true;
             }
         }
         
         if(creciente == true && decreciente==false){
             System.out.println("\nEl arreglo esta en forma creciente");
         }
         else if(creciente==false && decreciente==true){
              System.out.println("\nEl arreglo esta en forma decreciente");
         }
         else if(creciente == true && decreciente==true){
             System.out.println("\nEl arreglo esta desordenado");
         }
         else if(creciente==false && decreciente==false){
              System.out.println("\nTodos los numeros del arreglo son iguales");
         }
     }
    
}
