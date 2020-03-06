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
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int arr1[] = new int[10];

        int arr2[] = new int[10];

        boolean creciente = false;

        do {

            System.out.println("Llenar arreglo uno: ");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " .Digite un numero: ");
                arr1[i] = entrada.nextInt();
            }

            System.out.println("Llenar arreglo dos: ");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " .Digite un numero: ");
                arr2[i] = entrada.nextInt();
            }
            
            for(int i=0; i<9; i++){
                if(arr1[i] < arr1[i+1]){
                    creciente = true;
                }
                if(arr1[i] > arr1[i+1]) {
                    creciente = false;
                } 
                
                if(arr2[i] < arr2[i+1]){
                    creciente = true;
                }
                if(arr2[i] > arr2[i+1]) {
                    creciente = false;
                }
            }
            
            if(creciente ==false) {
                System.out.print("Vuelva a digitar los arreglos...");
            }

        } while (creciente == false);
        
        
        int arr3[] = new int[20];
        
        int j=0;
        for(int i=0; i<10; i++) {
            arr3[j] = arr1[i];
            j++;
            
            arr3[j] = arr2[i];
            j++;
        }
        
        System.out.print("El arreglo final es: ");
        for(int i=0; i<20; i++) {
            System.out.print(" * " + arr3[i]);
        }
    }
}
