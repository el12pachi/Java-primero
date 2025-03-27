/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio3;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author el12p
 */
public class Mano {

    ArrayList<Carta> cartas;
    int posY;
    int valorTotal;
    boolean as = false;

    public Mano(int pY) {
        cartas = new ArrayList<Carta>();
        posY = pY;
        valorTotal = 0;
    }

    public void paint(Graphics g, Applet ap) {
        int aux = 300;
        for (Carta x : cartas) {
            x.setPosY(posY);
            x.setPosX(aux);
            x.paint(g, ap);
            aux += 30;
        }
    }

    public void anadir(Carta n) {
        cartas.add(n);
        if (n.valor == 1) {
            as = true;
        }
        valorTotal += n.valor;
    }

    public int valor() {
        return as && valorTotal <= 11 ? valorTotal + 10 : valorTotal;
    }
    public boolean seHaPasado() {
        return valorTotal > 21;
    }
}
