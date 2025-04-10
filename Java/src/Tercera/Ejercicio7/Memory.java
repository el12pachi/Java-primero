/*
 
 */
package Tercera.Ejercicio7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Memory extends Applet {

    public final int TAM = 8;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Image reverso;
    Casilla casillas[];

    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio7/donutsMatch/reverso.png");
        imagenes = new Image[TAM];
        casillas = new Casilla[TAM * 2];
        for (int x = 0; x < TAM; x++) {
            imagenes[x] = getImage(getCodeBase(), "Tercera/Ejercicio7/donutsMatch/img" + (x + 1) + ".png");
        }
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla(Casilla.DIM * (i % 4), Casilla.DIM * (i / 4), imagenes[i % 8], reverso);
        }

        this.setSize(700, 800);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 700, 800);
        for (Casilla x : casillas) {
            x.paint(noseve, this);
        }
        g.drawImage(imagen, 0, 0, this);
    }

    public boolean mouseDown(Event e, int x, int y) {
        for (Casilla i : casillas) {
            if (i.contains(x, y)) {
                i.setDestapado(true);
            }
            repaint();
        }
        return true;
    }

}
