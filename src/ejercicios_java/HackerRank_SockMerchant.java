/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class HackerRank_SockMerchant {
     public static void main(String[] args) throws IOException {
         
        Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Numero de calcetines de la pila: ");
        int n = entrada.nextInt();
         
         int[] ar = new int[n];
         
         for(int i=0; i<n; i++){
             System.out.print((i+1)+ ". Color de cada calsetin: ");
             int arItem = entrada.nextInt();
            ar[i] = arItem;
         }
         
       int result =  sockMerchant(n, ar);
         System.out.println("Resultado: " + result);
     }
     
     static int sockMerchant(int n, int[] ar) {
         Arrays.sort(ar);
         int count=0;
         
         for(int i=0; i<n-1; i++){
            // System.out.println(i);
             if(ar[i] == ar[i+1]){
                 count=count+1;
                 i=i+1;
                System.out.println(count+ " * ");
                 System.out.println(i);
             }
         }
         return count;
     }
     
}
