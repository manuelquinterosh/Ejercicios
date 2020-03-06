/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_6;

/**
 *
 * @author DELL
 */
public class Estatico {
    private static String frase = "sfsfsfsa fasfasf";
    
    public static int sumar(int n1, int n2) {
        int suma = n1+n2;
        return suma;
    }
    
    public static void main(String [] args){
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        System.out.println("La suma es: " + Estatico.sumar(3, 4));
     }
}
