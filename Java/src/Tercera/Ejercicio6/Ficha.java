/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio6;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Ficha extends Rectangle {

    public static final int DIM = 100;
    int valor;
    Image src;

    public Ficha(int x, int y, Image scr, int valor) {
        super(x, y, DIM, DIM);
        this.valor = valor;
        this.src = scr;
    }

    public void paint(Graphics g, Applet ap) {
        g.drawImage(src, x, y, DIM, DIM, ap);
    }

    public void mover(int posx, int posy) {
        x = posx - (DIM / 2);
        y = posy - (DIM / 2);

    }
}
