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
public class HackerRank_BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner entrada = new java.util.Scanner(System.in);

        System.out.println("Ingrese Edad N: ");
        int n = entrada.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Digite altura de las velas: ");
            arr[i] = entrada.nextInt();
        }

      int result =  birthdayCakeCandles(arr);
      System.out.println(result);
    }

    static int birthdayCakeCandles(int[] ar) {
       
        int salida=0;
        int height = ar[0];// en una muestra de datos de tamaño 1, el dato es mínimo y máximo
        
        for(int j=0; j<ar.length; j++){
            
            if(ar[j] > height){
                height=ar[j];
                //height =j;
               //salida = 10;
               //j=j+1;
            } else if(ar[j] == height){
                salida++;
            }
           
            //System.out.println(salida);
        }
      //  int h= ar[salida];
       return salida;
    }
}
