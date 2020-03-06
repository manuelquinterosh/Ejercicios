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
public class contar_un_contador {

    public static void main(String[] args) {
        int c = 0;

        int[] arr = {1,2,3,4};

        for (int i = 0; i < arr.length-1; i++) {
           
                //c = c + 1;
                i++;
                
                System.out.println(c+" --------- "+i );
            
        }

    }
}
