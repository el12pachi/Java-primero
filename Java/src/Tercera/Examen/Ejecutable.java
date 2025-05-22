package Tercera.Examen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Ejecutable extends Applet implements Runnable {

    public static final int COL = 7;
    public static final int FILAS = 10;
    public static final int INICIO = 3;

    Image imagenes[];
    Pieza piezas[];
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pieza actual;
    Rectangle casillas[][];
    Conjunto allPiezas;

    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();

        casillas = new Rectangle[FILAS][COL];
        allPiezas = new Conjunto();
        for (int x = 0; x < 2; x++) {
            allPiezas.update();
        }

        for (int x = 0; x < FILAS; x++) {
            for (int y = 0; y < COL; y++) {
                casillas[x][y] = new Rectangle(y * 40, x * 40, 40, 40);
            }
        }

        this.setSize(700, 500);

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 700, 500);
        noseve.setColor(Color.BLACK);
        if (actual != null) {
            actual.paint(noseve);

        }
        for (int j = 0; j < casillas.length; j++) {
            for (int n = 0; n < casillas[0].length; n++) {
                noseve.drawRect(casillas[j][n].x, casillas[j][n].y, casillas[j][n].width, casillas[j][n].height);
            }
        }

        allPiezas.paint(noseve);
        g.drawImage(imagen, 0, 0, this);

    }

    public void run() {
        do {
            allPiezas.update();
            repaint();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
        } while (true);
    }

    public boolean mouseDown(Event ev, int x, int y) {
        actual = allPiezas.selectPieza(x, y);
        return true;
    }

    public boolean mouseUp(Event ev, int x, int y) {
        allPiezas.comprobar(actual);
        actual = null;
        repaint();
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        if (actual == null) {
            return false;
        }
        actual.mover(x, y);
        repaint();
        return true;
    }

}
