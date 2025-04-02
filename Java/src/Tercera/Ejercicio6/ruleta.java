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
import java.util.Collections;

/**
 *
 * @author el12p
 */
public class ruleta extends Applet {

    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
    Image imagen;
    Graphics noseve;
    Casilla casillas[][];
    public int rojo[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

    public void init() {
        imagen = this.createImage(900, 900);
        noseve = imagen.getGraphics();
        casillas = new Casilla[FILAS][COLUMNAS];
        for (int x = 0, n = 1; x < FILAS; x++) {
            for (int y = 0; y < COLUMNAS; y++) {
                Color color = Color.BLACK;
                for (int number : rojo) {
                    if (number == n) {
                        color = Color.red;
                    }
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
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);
        for (int x = 0, n = 1; x < FILAS; x++) {
            for (int y = 0; y < COLUMNAS; y++) {
              casillas[x][y].paint(noseve);
            }
        }
        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {

        return true;
    }

}
