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
public class Example_substring {
     public static void main(String[] args) {
         double horaEntrada, horaSalida;
        String entrada="",salida="";

        System.out.println("Ingrese hora militar: ");
         java.util.Scanner hora = new java.util.Scanner(System.in);

        String horaMilitar=hora.nextLine();
        entrada=horaMilitar.substring(0,2);
        salida=horaMilitar.substring(3,5);

        short hour = Short.valueOf(horaMilitar.substring(0, 2));
        horaMilitar = horaMilitar.substring(0, horaMilitar.length() - 2);

        System.out.println("entrada: "+entrada+" salida: "+salida+ " Tamano: " + horaMilitar + " hour: " + hour);
     }
}
