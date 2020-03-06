/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class HackerRank_Mini_MaxSum {
        public static void main(String[] args) {
            
       /** java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Ingrese N:");
        int n = entrada.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<arr.length; i++){
            System.out.print((i+1) + ". Digite elemento:");
            arr[i] = entrada.nextInt();
        }**/
       
       int[] arr = {1,2,3,4,5};
        
        miniMaxSum(arr);
        }
        
        static void miniMaxSum(int[] arr) {
           // int x=0, k=0, l=0, n=0, p=0, q=0, min=0, max=0;
            long maxNo = arr[0];
            long minNo = arr[0];
            long sum =0;
            
            System.out.println(maxNo + " - " + minNo);
            
            for(int i=0; i < arr.length; i++){
            /**
             0 = 1
             1 = 2
             2 = 3
             3 = 4
             4 = 5             
             **/   
             //System.out.println(" - "+i);
             
               if(arr[i] < minNo) {    
                   minNo = arr[i];
                   
                   /**
                    * caso 0:  1 < 1 then  X
                    * case 0:  1 > 1 then  X
                    */
               }
               if(arr[i] > maxNo) {
                   maxNo = arr[i];
                   
               }
               sum+=arr[i];
              // System.out.println(" * "+sum);
               
            }
            long min = sum - maxNo;
               long max = sum - minNo;
               System.out.print(min + " "+ max);
            //Arrays.sort(arr);

            
        }
}
