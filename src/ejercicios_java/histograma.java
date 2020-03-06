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
public class histograma {
     public static void main(String[] args) {
         
      
         int[] myArray = {1,2,1,3,3,1,2,1,5,1};
         
         int[] contador = new int[myArray.length];
  
            for(int i=0; i< myArray.length; i++) {
             
                     
               contador[myArray[i]]+=1;
             
              
               }
               int c=0;
            for(int j=0; j<contador.length; j++){
                
              c++;
                /**   System.out.print((j+1)+"\t"+myArray[j]+"\t");
               //String salida = j+":";
               //salida += "*";
               for(int r =0; r<=contador[j]; r++) {
                    System.out.print("*");
               }
                System.out.println();
                **/
                System.out.println(c);
            }
          
          }
     
     //
      
}
