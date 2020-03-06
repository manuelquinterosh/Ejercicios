/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 * Leer por teclado una tabla de 10 elementos numericos enteros y una posicion
 * (entre 0 y 9). Eliminar el elemento situado en la posicion dada sin dejar
 * huecos
 *
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arr[] = new int[10];
        int eliminar;
        
        boolean valida = false;

        System.out.println("Llenar arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite un numero: ");
            arr[i] = entrada.nextInt();
        }

        do {
            System.out.println("Digitar numero entre 0 y 9 a eliminar: ");
            eliminar = entrada.nextInt();

            if(eliminar > 0 && eliminar < 9) {
                valida = true;
            } 
            
            if(eliminar > 9) {
                valida = false;
            }
            
            if(valida == false) {
                 System.out.println("La posicion ingresada es incorrecta vuelva a ingresarla: ");
            }
            
     

        } while (valida == false);

                for (int i = eliminar; i < 9; i++) {
                    arr[eliminar] = 0;
                    
                }

                System.out.print("El nuevo numero es: ");
                for (int i : arr) {
                    System.out.println(i);
                }
        
    }
}
