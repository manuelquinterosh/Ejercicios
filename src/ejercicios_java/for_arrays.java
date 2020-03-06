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
public class for_arrays {
     public static void main(String[] args) {
         int[] array = {2,3,5,7,1,4,7,3,0,5};
         
         
         
         System.out.println("Incrementamos en uno");
         
         for(int i=0; i<array.length; i++){
             array[i]++;
               System.out.println(array[i] + ",");
         }
    
           
         
     }
}
