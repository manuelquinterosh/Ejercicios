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
public class Ejercicio7i {
       public static void main(String[] args) {
               Scanner leer = new Scanner (System.in);
               
               int arr[] = new int[10];
               
               boolean creciente = false, decreciente=false;
               
               
               System.out.println("Llenar los arreglos: ");
               for(int i=0; i<10; i++){
                   System.out.print((i+1)+ ". Digite un numero: ");
                   arr[i] = leer.nextInt();

               }
               
               for(int i =0; i<9; i++) {
                   if(arr[i] < arr[(i+1)]) {
                       creciente = true;
                   } 
                   else if(arr[i] > arr[(i+1)]) {
                       decreciente = true;                
                  }
               }

               
                 if(creciente == false && decreciente == false) {
                       System.out.print("Desordenados: ");
                   } else if(creciente == true && decreciente ==false) {
                       System.out.print("Creciente: ");
                   } else if(decreciente == true && creciente == false) {
                       System.out.print("Decreciente: ");
                   } else {
                       System.out.print("El arreglo no se ha completado");
                   }
                   
       }
}
