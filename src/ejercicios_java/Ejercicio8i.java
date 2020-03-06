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
public class Ejercicio8i {
       public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           
           int arr[] = new int[10];
           int num, pos;
           System.out.println("Llenar arreglo: ");
           for(int i=0; i<arr.length-1;i++) {
               System.out.print((i+1) +" .Digite un numero: ");
               arr[i] = entrada.nextInt();
           }

           System.out.println("Ingrese numero: ");
           num = entrada.nextInt();
           
           System.out.println("Ingrese una posicion: ");
           pos = entrada.nextInt();
           
           for(int i =arr.length-1; i>pos; i--){
               arr[i] = arr[i-1]; 
           }
           
           arr[pos] =  num;
           
           for(int i:arr){
               System.out.println(i);
           }
       }
}
