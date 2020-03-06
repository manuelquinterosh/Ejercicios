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
public class Example_endsWith {
     public static void main(String[] args) {

         String str_Sample = "manuel antonio quinteros hernandez";       
 
        // Comprobar si termina con una secuencia particular  
        System.out.println("EndsWith character 'z':" + str_Sample.endsWith("z"));       
        System.out.println("EndsWith character 'dez':" + str_Sample.endsWith("dez"));       
        System.out.println("EndsWith character 'nuel':" + str_Sample.endsWith("nuel"));   
        
       
     }
}
