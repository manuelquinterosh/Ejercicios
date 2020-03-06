/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2_JuegoTablero;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        char mov = ' ';
        int ar, ab, iz, de;

        Movimiento movimiento = new Movimiento(0, 0, 0, 0);

        do {
            JOptionPane.showMessageDialog(null, "Su posicion actual es: " + "Arriba: " + movimiento.getArriba() + " " + "Abajo: " + movimiento.getAbajo() + " " + "Izquierda: " + movimiento.getIzquierda() + " " + "Derecha: " + movimiento.getDerecha());
            mov = JOptionPane.showInputDialog("" + "Digite la letra que corresponda para realizar un movimiento en el tablero \n"
                    + "\nA - Izquierda,  D - Derecha,  W - Arriba,  S - Abajo,  Q - Salir").charAt(0);

            if (movimiento.getArriba() >= 10 && mov == 'w') {
                JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"
                        + "verifique su posición y elija otra opción");
            } else if (movimiento.getAbajo() <= 0 && mov == 's') {
                JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"
                        + "verifique su posición y elija otra opción");
            } else if (movimiento.getDerecha() >= 10 && mov == 'd') {
                JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"
                        + "verifique su posición y elija otra opción");
            } else if (movimiento.getIzquierda() <= 0 && mov == 'a') {
                JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"
                        + "verifique su posición y elija otra opción");
            } else {

                //int arrib=0;
                switch (mov) {
                    case 'w':
                        ar = movimiento.getArriba() + 1;
                        movimiento.setArriba(ar);
                        break;
                    case 's':
                        ab = movimiento.getAbajo() - 1;
                        movimiento.setAbajo(ab);
                        break;
                    case 'a':
                        iz = movimiento.getIzquierda() - 1;
                        movimiento.setIzquierda(iz);
                        break;
                    case 'd':
                        de = movimiento.getDerecha() + 1;
                        movimiento.setDerecha(de);
                        break;
                    case 'q':
                        JOptionPane.showMessageDialog(null, "Juego finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Caracter inválido!!, digite nuevamente");
                        break;
                }
            }
        } while ((mov != 'q') || (mov == 'w') || (mov == 's') || (mov == 'a') || (mov == 'd'));

    }
 
}
