/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segunda.Ejercicio17;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable {

    int contador = 1000;
    int tiempo = 1000;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Personaje pj;
    ArrayList<Columna> columnas;
    boolean continua = false;

    public void init() {
        imagen = this.createImage(800, 300);
        noseve = imagen.getGraphics();
        pj = new Personaje();
        columnas = new ArrayList< Columna>();
        columnas.add(new Columna());

        this.setSize(800, 300);

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 800, 300);
        pj.paint(noseve);
        for (Columna x : columnas) {
            x.paint(noseve);
        }
        if (continua) {
            
            noseve.drawString("GAME OVER", 400, 150);

        }
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            try {
                continua = pj.update(columnas.get(0));
            } catch (IndexOutOfBoundsException e) {
                pj.update();
            }
            for (Columna x : columnas) {
                if (x.update()) {
                    columnas.remove(x);
                    break;
                }
            }

            if (tiempo <= contador) {
                columnas.add(new Columna());
                tiempo = (int) ((Math.random() * 30) + 100);
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
        if (tecla == 32) {
            pj.saltar();
        }

        return true;
    }
}
