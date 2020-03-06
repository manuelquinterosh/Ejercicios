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
public class Ejercicio5 {
      public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int a[], b[], c[];
         
         a = new int[10];
         b = new int[10];
         c = new int[20];
         
         System.out.println("Llenar primer arreglo: ");
         for(int i =0; i<10; i++){
             System.out.print("Digite un numero: ");
             a[i] = entrada.nextInt();
         }
         
         System.out.println("Llenar segundo arreglo: ");
         for(int i =0; i<10; i++){
             System.out.print("Digite un numero: ");
             b[i] = entrada.nextInt();
         }
         
         int j=0;
         for(int i=0; i<10; i++){
             c[j] = a[i];
             j++;
             c[j] = b[i];
             j++;
         }
         
         System.out.println("La mezcla de su arreglo es: ");
         for(int i=0; i<20; i++) {
             System.out.print(c[i] + " ");
         }
      }
}
