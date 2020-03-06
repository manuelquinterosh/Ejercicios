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
public class Ejercicio9i {
      public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
      
           int arr[] = new int[10];
           
           System.out.println("Llenar arreglos: ");
           for(int i=0; i<10; i++) {
               System.out.print((i+1) + " .Digite un numero: ");
               arr[i] = entrada.nextInt();
           }
           
           int ultimo = arr[9];
           
           
           for(int i=arr.length-2; i>=0; i--) {
              arr[i+1] = arr[i];    
           }
           
           arr[0] = ultimo;
           
           for(int i:arr){
               System.out.print(i);
           }
      }
     
    

}
