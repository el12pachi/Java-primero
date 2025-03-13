package Tercera.Ejercicio2;

import java.awt.Rectangle;
import java.awt.Image;
import java.awt.Graphics;
import java.applet.Applet;

public class Pieza extends Rectangle {

    public static final int DIMENSION = 60;
    Image imagen;
    int pos;
    boolean bloqueado = false;
    int random = (int) ((Math.random() * 10) - 5);

    public Pieza(Image imagen, int posicion) {
        super((int) (Math.random() * 300 + 350), (int) (Math.random() * 400), DIMENSION, DIMENSION);
        this.imagen = imagen;
        this.pos = posicion;
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, x, y, a);
    }

    public void mover(int posx, int posy) {
        if (bloqueado) {
            return;
        }
        x = posx - (DIMENSION / 2);
        y = posy - (DIMENSION / 2);

    }

}
