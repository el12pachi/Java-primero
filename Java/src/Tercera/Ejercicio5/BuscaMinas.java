package Tercera.Ejercicio5;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class BuscaMinas extends Applet {

    public static final int DIM = 10;

    Image imagen;
    Graphics noseve;
    Image mina;
    Image reverso;
    Casilla casillas[][] = new Casilla[DIM][DIM];

    public void init() {
        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();
        mina = getImage(getCodeBase(), "Tercera/Ejercicio5/Imagenes/mina.png");
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio5/Imagenes/casilla.png");
        for (int x = 0; x < DIM; x++) {
            for (int y = 0; y < DIM; y++) {
                casillas[x][y] = new Casilla(100 + (x * Casilla.TAM), 100 + (y * Casilla.TAM), reverso);
            }
        }
        this.setSize(500, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);
        for (int x = 0; x < DIM; x++) {
            for (int y = 0; y < DIM; y++) {
                casillas[x][y].paint(noseve, this);
            }
        }
        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {
        for (int j = 0; j < DIM; j++) {
            for (int z = 0; z < DIM; z++) {
                if (casillas[j][z].contains(x, y)) {
                    casillas[j][z].setTapada(false);
                }

            }
        }
        repaint();
        return true;
    }

    public boolean action(Event ev, Object obj) {

        return true;
    }
}
