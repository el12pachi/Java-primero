package Examen.ej1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable {

    Thread animacion;
    Image imagen;
    Graphics noseve;
    ArrayList<Gun> pistolas;
    ArrayList<Nave> naves;
    ArrayList<Bala> balas;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        pistolas = new ArrayList<Gun>();
        naves = new ArrayList<Nave>();
        balas = new ArrayList<Bala>();
        pistolas.add(new Gun(Color.PINK, 250));
        pistolas.add(new Gun(Color.YELLOW, 175));
        pistolas.add(new Gun(Color.BLUE, 100));
        pistolas.add(new Gun(Color.ORANGE, 30));
        naves.add(new Nave(Color.ORANGE, 0));
        naves.add(new Nave(Color.BLUE, 60));
        naves.add(new Nave(Color.YELLOW, 120));
        naves.add(new Nave(Color.PINK, 180));

        this.setSize(300, 300);

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        for (Gun pistola : pistolas) {
            pistola.paint(noseve);
        }
        for (Nave x : naves) {
            x.paint(noseve);
        }
         for (Bala x : balas) {
            x.paint(noseve);
        }
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            for (Nave x : naves) {
                x.update(balas);
            }
            for (Bala x : balas) {
                if (x.update()) {
                    balas.remove(x);
                    break;
                }
            }
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }
        } while (true);

    }

    public boolean mouseDown(Event ev, int x, int y) {
        for (Gun pistola : pistolas) {
            if (pistola.contains(x, y)) {
                balas.add(new Bala(pistola.getColor(), pistola.x));
                return true;
            }
        }

        return false;
    }

}

// public boolean mouseMove(Event e, int x, int y) {
///
    //}
