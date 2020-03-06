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
public class Pregunta7 {
     public static void main(String[] args) {
         int [] myArray = {1,3,4,2,7,0};
         
         int data=0;
         int t=0;
         for(int i =0; i<myArray.length; i++){
             //data = myArray[i];
             
             /**if(data + myArray[i] == 10) {
                t = myArray[i];
             }**/
          // data = data + myArray[i];
          for(int j=0; j<myArray.length; j++){
              if(i != j && (myArray[i] + myArray[j]) == 10) {
                   System.out.println(myArray[j]);
              }
          }
           
            
         }
       
     }
}
