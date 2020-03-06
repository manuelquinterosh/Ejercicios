/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String [] args){
          int numero1;
          int numero2;
          
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    
        Operacion op = new Operacion();
        //op.leerNumeros();
       int suma = op.sumar(numero1, numero2);
       int resta = op.resta(numero1, numero2);
       double mult = op.multiplicar(numero1, numero2);
       double div = op.dividir(numero1, numero2);
        op.mostrarResultados(suma, resta, mult, div);
    }
}
