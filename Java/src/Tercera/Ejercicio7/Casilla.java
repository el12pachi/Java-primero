/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio7;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Casilla extends Rectangle {

    public static final int DIM = 100;
    private Image casilla;
    Image reverso;
    private boolean destapado;

    public Casilla(int x, int y, Image casilla, Image reverso) {
        super(x, y, DIM, DIM);
        this.casilla = casilla;
        this.reverso = reverso;
        this.destapado = false;
    }

    public Image getCasilla() {
        return casilla;
    }

    public void setCasilla(Image casilla) {
        this.casilla = casilla;
    }

    public boolean isDestapado() {
        return destapado;
    }

    public void setDestapado(boolean destapado) {
        this.destapado = destapado;
    }

    public void paint(Graphics g, Applet ap) {
        if (destapado) {
            g.drawImage(casilla, x, y, width, height, ap);
        } else {
            g.drawImage(reverso, x, y, width, height, ap);
        }
    }
}
