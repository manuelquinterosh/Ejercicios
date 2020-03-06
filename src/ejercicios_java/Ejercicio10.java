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
public class Ejercicio10 {
        public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
        
            int arr[] = new int[10];
            int pos;
            int mov;
            System.out.println("Llenar arreglo: ");
            for(int i=0; i<10; i++){
                System.out.print((i+1)+" .Digite un numero: ");
                arr[i] = entrada.nextInt();
            }
            
            System.out.print("Digite posiciones en el arr: ");
            pos = entrada.nextInt();
            
            
            
            
            for(int j=1; j<=pos; j++){
                
                mov = arr[9];
                
               // System.out.println(" * "+mov);
               // System.out.println(" - "+j);
                
               for(int i=8; i>=0; i--){
                 
                   arr[i+1] = arr[i];
                    // System.out.print(" - "+arr[i]);
               }
               arr[0] = mov; 
               //System.out.print(arr[0] = mov);
            }

           for(int i= 0; i<arr.length; i++){
               System.out.print(" * "+arr[i]);
          }
        }
         
}
