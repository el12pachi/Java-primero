package Tercera.Ejercicio01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Caminar extends Applet implements Runnable {

    public static final int TIEMPO = 50;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image img1;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();

        img1 = getImage(getCodeBase(), "Tercera/Ejercicio01/Sprites/Guerrillero/g1.gif");//

        this.setSize(300, 300);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);

        noseve.drawImage(img1, 0, 0, 200, 250, this);

        g.drawImage(imagen, 0, 0, this);

    }

    @Override
    public void run() {
        do {

            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {
            }
        } while (true);
    }

}