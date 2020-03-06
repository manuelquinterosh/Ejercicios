/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class veces {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};
        int position = 0;
        int ocurrencias = 0;
        int number[] = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            ocurrencias = myArray[i];
            for (int j = i; j < myArray.length; j++) {
                if (myArray[j] == ocurrencias) {
                    number[i]++;
                }
            }
        }
        ocurrencias = 0;
        for (int t = 0; t < number.length; t++) {
            if (ocurrencias < number[t]) {
                ocurrencias = number[t];
                position = t;
            }
        }
        System.out.println("Longest: " + number[position]);
        System.out.println("Number: " + myArray[position]);
    }

}
