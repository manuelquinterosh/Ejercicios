/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2_JuegoTablero;

/**
 *
 * @author DELL
 */
public class Movimiento {
        
    private int arriba;
    private int abajo;
    private int izquierda;
    private int derecha;

    public Movimiento(int arriba, int abajo, int izquierda, int derecha) {
        this.arriba = arriba;
        this.abajo = abajo;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public int getArriba() {
        return arriba;
    }

    public void setArriba(int arriba) {
        this.arriba = arriba;
    }

    public int getAbajo() {
        return abajo;
    }

    public void setAbajo(int abajo) {
        this.abajo = abajo;
    }

    public int getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(int izquierda) {
        this.izquierda = izquierda;
    }

    public int getDerecha() {
        return derecha;
    }

    public void setDerecha(int derecha) {
        this.derecha = derecha;
    }

   
    
}
