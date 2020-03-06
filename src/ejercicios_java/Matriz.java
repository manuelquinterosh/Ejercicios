/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Matriz {
     public static void main(String[] args) {
        
          java.util.Scanner entrada = new java.util.Scanner(System.in);
         int matriz[][], nFilas, nCol;
         //int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
         
         nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas: "));
         nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas: "));
         
         matriz = new int[nFilas][nCol];
         
         System.out.println("Digite la matriz: ");
         for(int i=0; i<nFilas; i++){
             for(int j=0; j<nCol;j++){
                 System.out.print("Matriz ["+i+"]["+j+"]: ");
                 matriz[i][j] = entrada.nextInt();
             }
         }
         
         System.out.println("\nLa Matriz es: ");
         
         for(int i=0; i<nFilas;i++){ //Numero de filas
             for(int j=0; j<nCol; j++) {//Numero de columnas
               System.out.print(matriz[i][j]);
             }
             System.out.println("");
         }
     }
}
