package Examen.ej2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable {

    public static final int TIEMPO = 2000 / 30; //Agustin esto es para que se ponga en dos segundos
    int contador = 0;
    int contBolas = 0;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    ArrayList<Bola> bolas;
    boolean continua = true;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        bolas = new ArrayList<Bola>();
        bolas.add(new Bola());
        this.setSize(300, 300);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        noseve.setFont(new Font("Arial", Font.BOLD, 15));

        for (Bola bola : bolas) {
            bola.paint(noseve);
        }
        noseve.setColor(Color.WHITE);
        noseve.drawString("Pinchados: " + (contBolas), 120, 30);
        if (!continua) {
            noseve.drawString("GAME OVER", 120, 140);
        }
        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            for (Bola bola : bolas) {
                bola.update();
            }
            if (TIEMPO <= contador) {
                bolas.add(new Bola());
                contador = 0;
            }
            contador++;

            if (bolas.size() >= 10) {
                continua = false;
            }
            if (!continua) {
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

    public boolean mouseDown(Event ev, int x, int y) {
        for (Bola bola : bolas) {
            if (bola.contains(x, y)) {
                if (bola.updateContador()) {
                    bolas.remove(bola);
                    contBolas++;
                }

                return true;
            }
        }

        return false;
    }

}

// public boolean mouseMove(Event e, int x, int y) {
///
    //}
