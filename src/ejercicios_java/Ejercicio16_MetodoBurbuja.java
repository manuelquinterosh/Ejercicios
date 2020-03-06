/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ejercicio16_MetodoBurbuja {
      public static void main(String[] args) {
         
         Scanner entrada = new Scanner(System.in);
         int arreglo[], nElementos, aux;
         
         nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
         
         arreglo = new int[nElementos]; //Asignamos el numero de elementos al arreglo
         
         for(int i=0; i <nElementos; i++) {
             System.out.println((i+1) + ". Digite un numero: ");
             arreglo[i] = entrada.nextInt();
         }
         
         //Metodo burbuja
         for(int i=0; i<(nElementos-1);i++){
             for(int j=0; j<(nElementos-1); j++){
                 if(arreglo[j] > arreglo[j+1]) {
                     aux= arreglo[j];
                     arreglo[j] = arreglo[j+1];
                     arreglo[j+1] = aux;
                 }
             }
         }
         //Mostrando el arreglo ordenado en forma creciente
         System.out.print("\nArreglo ordenado en forma creciente: ");
         for(int i=0; i<nElementos; i++) {
             System.out.print(arreglo[i]+" - ");
         }
         System.out.print("\nArreglo ordenado en forma decreciente");
         for(int i=(nElementos-1); i>=0; i--) {
             System.out.print(arreglo[i]+" - ");
         }
         System.out.println("");
      }
}
 