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
public class Arrays_uso {
      public static void main(String[] args) {
      //Array de String
        String[] nombres = {"Pepe", "Juan", "Alex",
            "Julian", "Francisco", "Luis"};

        //Ordena el array
        Arrays.sort(nombres);

        //Mostramos el array ya ordenado
        for (String i : nombres) {
            System.out.print(i + ", ");
        }
      }
}
