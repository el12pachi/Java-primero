/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segunda.Ejercicio18;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable {

    int contador = 1000;
    int tiempo = 50;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rana pj;
    ArrayList<Coche> coches;
    boolean continua = false;

    public void init() {
        imagen = this.createImage(700, 400);
        noseve = imagen.getGraphics();
        pj = new Rana();
        coches = new ArrayList<Coche>();
        this.setSize(700, 400);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.PINK);
        noseve.fillRect(0, 0, 700, 400);
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 75, 700, 250);
        noseve.setColor(Color.WHITE);
        noseve.drawLine(0, 200, 700, 200);
        for (Coche x : coches) {
            x.paint(noseve);
        }
        pj.paint(noseve);
        if (continua) {
            noseve.drawString("GAME OVER", 350, 200);
        }
        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            for (Coche x : coches) {
                if (x.intersects(pj)) {
                    continua = true;
                }
                if (x.update()) {
                    coches.remove(x);
                    break;
                }
            }
            if (tiempo <= contador) {
                coches.add(new Coche());
                contador = 0;
            }
            contador++;
            if (continua) {
                repaint();
                animacion.stop();
            }

            repaint();

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }
        } while (true);

    }

    public boolean keyDown(Event ev, int tecla) {
        pj.update(tecla);
        return true;
    }
}
