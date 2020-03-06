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
public class Test6 {
       public static void main(String[] args) {
    
                 Scanner leer = new Scanner (System.in);
        int numero1[], numero2[], contador1, contador2; 
        numero1 = new int [12];
        numero2 = new int [12];
        contador1 = 0;
        contador2 = 0;
        boolean verdad = false;
        
        
        System.out.println("PRIMERA TABLA");
        for(int i=0; i<12; i++){
            System.out.println((i+1)+" DIGITE UN NUMERO");
            numero1[i] = leer.nextInt();
        } 
        System.out.println("SEGUNDA TABLA");
        for(int i=0; i<12; i++){
            System.out.println((i+1)+" DIGITE UN NUMERO");
            numero2[i] = leer.nextInt();
        }
       
            while(verdad == false){
            do{
                System.out.print(numero1[contador1]+",");
                contador1++;
            }while(contador1%3!=0);
                System.out.print(" ");
            do{
                System.out.print(numero2[contador2]+",");
                contador2++;
            }while(contador2%3!=0);
                System.out.print(" ");
            if(contador2==12){
            verdad=true;
            }
        }
       }
}
