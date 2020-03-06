/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templ `ate file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class test {

    public static void main(String[] args) {
        /**
         * for(int i=8; i>=0; i--){ //avanzar una posicion abajo en el arreglo
         * System.out.println(i);
           }*
         */
        int myArray[] = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
        int numeroMayor = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > numeroMayor) {
                numeroMayor = myArray[i];
            }
           // myArray[i]++;
        }
        System.out.println(numeroMayor);

        /**
         * int arreglo[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 }; String salida
         * = "Elemento\tValor\tHistograma"; // para cada elemento del arreglo,
         * mostrar una barra en el histograma for ( int contador = 0; contador <
         * arreglo.length; contador++ ) { salida += "\n" + contador + "\t" +
         * arreglo[ contador ] + "\t"; // imprimir barra de asteriscos for ( int
         * estrellas = 0; estrellas < arreglo[ contador ]; estrellas++ ){ salida
         * += "*"; } } // fin de instrucción for externa
         * System.out.println(salida); } // fin de main*
         */
    }

}
