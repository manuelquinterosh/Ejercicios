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
public class Ejercicios_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /**
     * Leer por teclado dos tablas de 10 numeros enteros y mezclarlas
     * en una tercera de la forma: 
     * el 1ro de A, el 1ro de B, el 2do de A, el 2do de B, etc
     */
    Scanner entrada = new Scanner(System.in); 
    int a[], b[], c[];

     a = new int[10];
     b = new int[10];
     c = new int[20];
     
     System.out.println("Digite el primer arreglo: ");
     for(int i =0; i<10; i++){
         System.out.print((i+1) + " .Digite un numero: ");
         a[i] = entrada.nextInt();
     }
     
     System.out.println("Digite el segundo arreglo: ");
     for(int i = 0; i<10; i++){
         System.out.print((i+1)+" .Digite un numero: ");
         b[i] = entrada.nextInt();
     }
     
     int j=0;
     for(int i=0; i<10; i++){
         c[j] = a[i];
         j++;
         c[j] = b[i];
         j++;
     }
    
     System.out.println("TERCER ARREGLO:");
     for(int i:c){
         System.out.println(i);
     }
    }
    
}
