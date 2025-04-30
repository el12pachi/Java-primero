/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio8;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class MazoSecundario {

    public static final int POSICIONX = 110;
    public static final int POSICIONY = 20;
    ArrayList<Carta> cartas;

    public MazoSecundario() {
        cartas = new ArrayList<Carta>();
    }

    public void anadir(Carta c) {
        cartas.add(c);
    }

    public void paint(Graphics g, Applet a) {
        for (Carta carta : cartas) {
            carta.paint(g, a);
        }
        
    }

    public void recolocar() {
        cartas.get(cartas.size() - 1).setPosition(POSICIONX, POSICIONY);
    }

    public Carta extraer() {
        return cartas.get(cartas.size() - 1);
    }

    public void eliminar() {
        cartas.remove(cartas.size() - 1);
    }
}
