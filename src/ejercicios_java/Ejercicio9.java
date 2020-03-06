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
public class Ejercicio9 {
     public static void main(String[] args) {
         /*
         Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace
         una posicion hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero
         y asi sucesivamente. El ultimo pasa a ser el primero.
         */
         
           Scanner entrada = new Scanner(System.in);
           
           int arreglo[] = new int[10]; //Creamos el arreglo de 10 elementos enteros
           int ultimo;
           
           System.out.println("Llenar el arreglo");
           for(int i=0; i<10; i++){
               System.out.print(i+". Digite un numero");
               arreglo[i] = entrada.nextInt();
           }
           
           ultimo = arreglo[9]; //guardamos el ultimo elemento
           
           for(int i=8; i>=0; i--){ //avanzar una posicion abajo en el arreglo
               arreglo[i+1] = arreglo[i];
           }
           
           arreglo[0] = ultimo; //Ponemos el ultimo elemento como primero
           
           System.out.println("\nEl nuevo arreglo es: ");
           
           for(int i=0; i<10; i++){
               System.out.println(i+" .Numero: "+ arreglo[i]);
           }
     }
}
