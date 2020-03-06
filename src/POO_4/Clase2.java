/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_4;

/**
 *
 * @author DELL
 */
public class Clase2 {
     public static void main(String [] args){
         Clase1 obj1 = new Clase1();
         
         obj1.setEdad(10);
         
         System.out.println("La edad es: " +obj1.getEdad());
         
         obj1.setNombre("Manuel Quinteros");
         System.out.println("El nombre es: "+ obj1.getNombre());
     }
}
