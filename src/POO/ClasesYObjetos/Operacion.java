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
public class Operacion {
    //Atributos
  /** int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;**/
    
    //Metodos
    
    //Metodo para pedirle al usuario que nos digite dos numeros
    //public void leerNumeros() {
     //   numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    //    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
   // }
    
    public int sumar(int numero1, int numero2){
       // suma = numero1+numero2; 
      int suma = numero1+numero2;
       return suma;
    }
    public int resta(int numero1, int numero2){
       // resta = numero1-numero2;   
      int resta = numero1-numero2;
       return resta;
    }
    public double multiplicar(int numero1, int numero2){
       double multiplicacion = numero1*numero2;
        return multiplicacion;
    }
    public double dividir(int numero1, int numero2) {
       double division = numero1/numero2;
        return division;
    }
    
    public void mostrarResultados(int suma, int resta,double mult, double div){
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+ mult);
        System.out.println("La division es: "+ div);
        
    }
}
