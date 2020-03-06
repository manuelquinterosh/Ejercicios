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
public class numeroVeces {
     public static void main(String[] args) {
         int[] myArray = {1,2,2,4,5,6,7,8,8,8};
         
         int num =0, c=0;
         int veces=0;
  
         for(int i=0; i<=9; i++) {           
             for(int k=0; k < 10; k++) {                
                 if(i==myArray[k]) {
                     c=c+1;
                 }
             }             
             if(i==0){
                 veces=c;
                 num=i;
             } else {
                 if(veces < c) {
                     veces=c;
                     num=i;
                 }
             }
         }
         System.out.println("Mayor="+num+" Veces "+c);
     }
   
}
 