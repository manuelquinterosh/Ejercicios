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
public class NewClass {
      public static void main(String[] args) {
           int[] ar = {1, 2, 2, 1, 1, 3, 5,1, 2};

    int contador=0;
    int aux=ar[0];
    for (int i = 0; i < ar.length; i++) {
      if(aux==ar[i]){
        contador++;
      }else{
        System.out.print(contador + ",");
        contador=1;
        aux=ar[i];
      }
    }
    System.out.print(contador );};
      
}

   /** for(int asterisco=0; asterisco < myArray[i]; asterisco++) {
                         
	                 salida +=  "*";
                     
                    }**/               
