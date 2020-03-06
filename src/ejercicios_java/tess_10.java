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
public class tess_10 {

    public static void main(String[] args) {
        int[] arreglo10 = new int[10];
        int numeroposi;
        int guard1;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese el numero." + (i + 1) + ": ");
            arreglo10[i] = entrada.nextInt();

        }
        System.out.println("ingrese el numnero de posiciones que quiere que se dezplazen los numeros: ");
        numeroposi = entrada.nextInt();

        for (int i = 1; i <= numeroposi; i++) {
            guard1 = arreglo10[9];
            for (int e = 8; e >= 0; e--) {
                arreglo10[e + 1] = arreglo10[e];
            }
            arreglo10[0] = guard1;
        }
        for (int e : arreglo10) {
            System.out.println("respuesta es: " + e);
        }

    }
}
