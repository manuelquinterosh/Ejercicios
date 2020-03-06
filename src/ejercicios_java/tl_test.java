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
public class tl_test {
     public static void main(String[] args) {
      
         	Scanner s = new Scanner(System.in);
		
		// Reading integer from input
                System.out.print("Ingrese C: ");
		int N = s.nextInt();
		
		int[] numArrayA = new int[N];
		int[] numArrayB = new int[N];
		int[] sumArray = new int[N];
				
		// Read numArray1
		for(int i=0; i<N; i++) {
                    System.out.print("Ingrese ArrayA: ");
			numArrayA[i] = s.nextInt();
		}
		// Read numArray2
		for(int i=0; i<N; i++) {
                    System.out.print("Ingrese ArrayB: ");
			numArrayB[i] = s.nextInt();
		}
		
		// Write your logic here:
		
		// Print the sumArray
		for(int i=0; i<N; i++) {
                    sumArray[i]=numArrayA[i]+numArrayB[i];
			System.out.print(sumArray[i] + " ");
		}
        
        System.out.println();
		s.close();
     }
         
      /**   Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
                System.out.print("Ingrese 5: ");
		int L = s.nextInt();
                System.out.print("Ingrese 10: ");
		int R = s.nextInt();
    
        // Write here the logic to print all integers between L and R
        for(int i =L; i<R; i++) {
            System.out.print(i+" ");
            System.out.println();
        }

        

		s.close();
     }
         **/
      
      
    /**
		
                System.out.println("Ingrese tamano: ");
		int N = s.nextInt();
		
		// Define an array of integers of size N. 
		int[] numArray = new int[N];		
		
		int sum = 0;
		for(int i=0; i<N; i++){
                    System.out.print("Ingrese entrada");
		    numArray[i] = s.nextInt(); // Get the input
                    sum+=numArray[i]*numArray[i];
		}
	    
	    // Write the logic to add these numbers here:
	    
	    
	    
	    
		// Print the sum
		System.out.print(sum);
		s.close();
	}**/
    
  /**  float numeros[] = new float[5];
    
    System.out.println("Ingrese los numeros");
    for(int i=0; i<5; i++){
         System.out.println("Digite un numero: ");
         numeros[i] = entrada.nextFloat();
       }
    
    System.out.println("Los elementos del arreglo son: ");
    for(int i= 4; i >= 0; i--){
        System.out.println(numeros[i]);
    }**/
  
     /** for(int i =8; i>=0; i--) {
          System.out.println(i);
      }**/
    
}
