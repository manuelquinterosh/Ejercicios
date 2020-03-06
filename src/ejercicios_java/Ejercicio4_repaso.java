/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

/**
 *
 * @author DELL
 */
public class Ejercicio4_repaso {
     public static void main(String[] args) {
         
         java.util.Scanner entrada = new java.util.Scanner(System.in);
      
         int arr[] = new int[10];
         
         System.out.println("Arreglo:");
         for(int i=0; i<10; i++) {
             System.out.print("Digite un numero: ");
             arr[i] = entrada.nextInt();
         }
         
         int p=0, u=9;
         
         for(int j=0; j<5; j++) {
          
            
            
            System.out.println(arr[p]);
            p+=1;
            System.out.println(arr[u]);
            u-=1;
         }
         
     }
}
