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
public class Ejercicio4 {
      public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          
          int myArray[] = new int[10];
          
          System.out.println("Ingrese 10 numeros enteros: ");
          for(int i =0; i<10; i++) {
              System.out.print("Digite un numero: ");
              myArray[i] = entrada.nextInt();
          }
          
          int ultimo = myArray[9];
          
          for(int i=8; i>=0; i--) {
              myArray[i+1] = myArray[i];
          }
          
          myArray[0] = ultimo;
          
          System.out.println("Su nuevo arreglo es: ");
          for(int i = 0; i<10; i++) {
              System.out.println("Arreglo: " + myArray[i]);
          }
      }
}
