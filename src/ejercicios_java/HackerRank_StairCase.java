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
public class HackerRank_StairCase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese N:");
        int n = entrada.nextInt();

        staircase(n);
    }

    static void staircase(int n) {

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
           
            String cantidad = " ";
          
            
            for (int j = 0; j < arr.length; j++) {
                
               if(j < arr[n-1-i]) {
                    cantidad += " ";
               } else{
                   cantidad+="#";
               }
               
                System.out.println(cantidad);
           }
             System.out.println();  // To move to the next line.
        }

    }
}
