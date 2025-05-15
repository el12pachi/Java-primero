package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Rueda {

    Image ruedas[];
    int posX, posY;
    int actual = 0;

    public Rueda(Image[] ruedas, int posX, int posY) {
        this.ruedas = ruedas;
        this.posX = posX;
        this.posY = posY;
    }

    public void paint(Graphics g, Applet ap) {
        g.drawImage(ruedas[actual], posX, posY, 50, 50, ap);
    }

    public void update() {
        actual = (actual + 1) % ruedas.length;
    }
}
