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
public class Ejercicio15 {
     public static void main(String[] args) {
         
         Scanner entrada = new Scanner(System.in);
     
         int arreglo[], numero;
         
         arreglo = new int[10];
         
         boolean creciente = false;
         
         do {
             System.out.println("Rellene el arreglo: ");
             for(int i=0; i<10; i++){
                 System.out.print(i+" .Digite un numero: ");
                 arreglo[i] = entrada.nextInt();
             }
             
             for(int i =0; i<10; i++){
                 if(arreglo[i] < arreglo[i+1]){
                     creciente = true;
                 }
                 if(arreglo[i] > arreglo[i+1]){
                     creciente = false;
                     break;
                 }
             }
             
             if(creciente == false) {
                 System.out.println("\nEl arreglo esta desordenado, digite nuevamente: \n");
             }
             
         } while(creciente == false);
         
         //pedimos el numero a buscar en el arreglo;
         System.out.print("\nDigite el numero a buscar en el arreglo: ");
         numero = entrada.nextInt();
         
         //Buscamos el numero en el arreglo
         int i=0; 
         while(i<10 && arreglo[i] < numero) {
             i++;
         }
         
         if(i==10) {
             System.out.println("\nNumero no encontrado");
         } else {
            if(arreglo[i] == numero){
                System.out.println("\nNumero encontrado, en la posicion: "+i);
            }
            else {
                System.out.println("\nNumero no encontrado");
            }
         }
     }
}