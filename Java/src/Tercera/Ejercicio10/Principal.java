package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Principal extends Applet implements Runnable {

    Thread animacion;
    Image imagen;
    Graphics noseve;
    int velocidad = 100;
    Image imgFondo;
    Image imgManzana;
    Fondo fondo;
    Image ruedas[];
    Rueda delantera, trasera;

    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();

        imgFondo = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/fondo.jpg");
        fondo = new Fondo(imgFondo, this);
        ruedas = new Image[5];
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/rueda" + (i + 1) + ".gif");
        }
        delantera = new Rueda(ruedas, 50, 240);
        trasera = new Rueda(ruedas, 150, 240);
        this.setSize(700, 300);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 400, 300);

        fondo.paint(noseve);
        delantera.paint(noseve, this);
        trasera.paint(noseve, this);
        g.drawImage(imagen, 0, 0, this);
    }

    public void run() {
        do {
            fondo.update();
            delantera.update();
            trasera.update();
            repaint();
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
            }
        } while (true);
    }

}
