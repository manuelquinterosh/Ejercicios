/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_2;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String [] args){
        Persona p1 = new Persona("Manuel", 26);
        p1.correr();
        
        Persona p2 = new Persona("121212-3");
        p2.correr(100);
    }
}
