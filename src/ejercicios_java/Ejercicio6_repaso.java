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
public class Ejercicio6_repaso {
    public static void main(String[] args) {
        
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        int a[], b[], c[];
        
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        System.out.println("Ingrese arreglo A: ");
        for(int i=0; i<12; i++) {
            System.out.print(i+". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Ingrese arreglo B: ");
        for(int i=0; i<12; i++) {
            System.out.print(i+". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        //Enlazar arreglos:
        int q=0;
        
        for(int j=0; j<12; j+=3) {
          
            c[q] = a[j];
            q++;
            c[q] = a[(j+1)];
            q++;
            c[q] = a[(j+2)];
            q++;
            
            c[q] = b[j];
            q++;
            c[q] = b[(j+1)];
            q++;
            c[q] = b[(j+2)];
            q++;
            
        }
        for(int x=0; x<24; x++) {
            System.out.print(c[x] + " ");
        }
        System.out.println();
        //
    }
}
