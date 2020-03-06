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
import java.util.Scanner;

public class HackerRank_PlusMinus {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Ingrese tamaño del array: ");
         int n = entrada.nextInt();
         
         int[] arr = new int[n];
         
         for(int i=0; i<n; i++){
             System.out.print((i+1) + " .Digite un numero: ");
             arr[i] = entrada.nextInt();
         }
         
         plusMinus(arr);
     }
     
     static void plusMinus(int[] arr) {
         double neg =0, pos=0, zeros =0, t_num=0;
         
         double t_neg=0, t_pos=0, t_zero=0;
         
         for(int i=0; i<arr.length; i++){         
            if(arr[i] < 0) {
                neg++;               
            }            
            if(arr[i] >0){
                pos++;
            }           
            if(arr[i] ==0) {
               zeros++;
            }

         t_num++;
         //System.out.println(t_num);
         t_pos = pos/t_num;
         t_neg = neg/t_num;
         t_zero = zeros/t_num;
       
         }
       
        System.out.println(t_pos);
        System.out.println(t_neg);
        System.out.println(t_zero);
        
     }
}
