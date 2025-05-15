package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Fondo {

    Image img;
    int posX;
    Applet applet;

    public Fondo(Image imagen, Applet a) {
        this.img = imagen;
        this.applet = a;
        posX = 0;
    }

    public void paint(Graphics g) {
        g.drawImage(img, posX, 0, applet.getWidth(), applet.getHeight(), applet);
        g.drawImage(img, (posX + applet.getWidth()), 0, applet.getWidth(), applet.getHeight(), applet);
    }

    public void update() {
        posX -= 5;
        if (posX <= -applet.getWidth()) {
            posX = 0;
        }
    }
}
