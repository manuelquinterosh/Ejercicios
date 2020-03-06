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
public class array_3_en_3_Example {
       public static void main(String[] args) {
    
        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};

        int MaxValue = 0;
         
        for (int i = 0; i < myArray.length; i++) {
            if (MaxValue < myArray[i]) {
                MaxValue = myArray[i];
               //  System.out.println(MaxValue);   
            }
        }
        
        for(int a=1; a<=MaxValue; a++){
            String cantidad = a+":";
            
            for(int i=0; i<myArray.length; i++) {
                if(a == myArray[i]) {
                    cantidad+="&";
                }
            }
                 System.out.println(cantidad);
        }
           
        
       }
           
           
}
