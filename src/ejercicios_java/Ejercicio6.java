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
public class Ejercicio6 {
    
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int a[], b[], c[];
         
         a = new int[12];
         b = new int[12];
         c = new int[24];
         
         System.out.println("PRIMER ARREGLO: ");
         for(int i=0; i<12; i++){
             System.out.print((i+1)+" .Digite un numero: ");
             a[i] = entrada.nextInt();
         }
         
         System.out.println("SEGUNDO ARREGLO: ");
         for(int i =0; i<12; i++){
             System.out.print((i+1) + " .Digite un numero: ");
             b[i] = entrada.nextInt();
         }
         
         int j=0;
         
         for(int i=0; i<12; i++){
             c[j] = a[i];
             j++;
             c[j] = a[(i+1)];
             j++;
             c[j] = a[(i+2)];
             j++;
             
             c[j] = b[i];
             j++;
             c[j] = b[(i+1)];
             j++;
             c[j] = b[(i+2)];
             j++;
             
         }
         
         for(int i =0; i<24; i++) {
             System.out.println(c[i]);
         }
     }
    
}
