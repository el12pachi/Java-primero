/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio6;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Ruleta extends Applet {

    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
    Image imagen;
    Graphics noseve;
    Casilla casillas[][];
    public int rojo[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    public int valores[] = {1, 5, 10, 25, 50, 100, 500, 1000, 5000, 10000};
    Ficha fichas[];
    Ficha activa;
    ArrayList<Ficha> jugada;

    public void init() {
        imagen = this.createImage(900, 900);
        noseve = imagen.getGraphics();
        casillas = new Casilla[FILAS][COLUMNAS];
        ArrayList<Integer> lRojos = new ArrayList<Integer>();
        ArrayList<Ficha> jugada = new ArrayList<Ficha>();

        for (int number : rojo) {
            lRojos.add(number);
        }

        fichas = new Ficha[10];
        for (int x = 0; x < valores.length; x++) {
            fichas[x] = new Ficha(x * 100, 300, getImage(getCodeBase(), "Tercera/Ejercicio6/Fichas/ficha" + (x + 1) + ".png"), valores[x]);
        }

        for (int x = 0, n = 1; x < FILAS; x++) {
            for (int y = 0; y < COLUMNAS; y++) {
                Color color = Color.BLACK;
                if (lRojos.contains(n)) {
                    color = Color.RED;
                }
                casillas[x][y] = new Casilla(Casilla.DIM * x, Casilla.DIM * y, n++, color);
            }
        }
        this.setSize(900, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 900, 900);
        noseve.setColor(Color.GRAY);
        for (int x = 0, n = 1; x < FILAS; x++) {
            for (int y = 0; y < COLUMNAS; y++) {
                casillas[x][y].paint(noseve);
            }
        }

        for (Ficha x : fichas) {
            x.paint(noseve, this);
        }
        g.drawImage(imagen, 0, 0, this);
    }

    public boolean mouseUp(Event ev, int x, int y) {
        for (int j = 0; j < casillas.length; j++) {
            for (int i = 0; i < casillas[0].length; i++) {
                //if (casillas[j][i].intersects(ficha)) {
                //  System.out.println(casillas[j][i].valor);
                //  };
            }
        }
        activa = null;
        repaint();
        return true;
    }

    public boolean mouseDown(Event ev, int x, int y) {
        for (Ficha f : fichas) {
            if (f.contains(x, y)) {
                jugada.add(new Ficha(f.x, f.y, f.src, f.valor));
                activa = jugada.get(jugada.size() - 1);
            }
        }
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        if (activa == null) {
            return false;
        }
        activa.mover(x, y);
        repaint();
        return true;
    }
}
