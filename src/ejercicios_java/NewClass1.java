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
public class NewClass1 {
       public static void main(String[] args) {
            int arreglo[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
      String salida = "Elemento\tValor\tHistograma";
       // para cada elemento del arreglo, mostrar una barra en el histograma
      for ( int contador = 0; contador < arreglo.length; contador++ ) {
         salida += "\n" + contador + "\t" + arreglo[ contador ] + "\t";
         // imprimir barra de asteriscos
         for ( int estrellas = 0; estrellas < arreglo[ contador ]; estrellas++ ){
            salida += "*";
         }
      } // fin de instrucción for externa
     System.out.println(salida);
       }
}
