/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO1_Perimetro_area_cuadrilatero;

/**
 *
 * @author DELL
 */
public class Cuadrilatero {
    //Atributo
    private float lado1;
    private float lado2;
    
    //Metodos

    //Metodo constructor 1(Siempre y cuando sea un cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Como es un cuadrado, todos sos numeros son iguales
    //entonces para que le voy a pasar dos lados si ambos son iguales
    //Metodo constructor 2 (Solo cuando sea un cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1; //Igualamos el lado1 a ambos lados
    }
    
    public float getPerimetro() {
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
    
    public float getArea() {
        float area = (lado1*lado2);
        return area;
    }
    
    
    
}
