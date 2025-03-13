package Tercera.Ejercicio2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Puzle extends Applet {

    public static final int PIEZAS = 25;
    public static final int FILAS = 5;
    Image imagenes[];
    Pieza piezas[];
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pieza actual;
    Tablero tablero;

    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        tablero = new Tablero(60, 5, 5);
        imagenes = new Image[PIEZAS];
        piezas = new Pieza[PIEZAS];
        for (int i = 0; i < imagenes.length; i++) {
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio2/directorioImagenes/" + (i + 1) + ".png");
        }
        for (int i = 0; i < imagenes.length; i++) {
            piezas[i] = new Pieza(imagenes[i], i);
        }
        this.setSize(700, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 700, 500);
        tablero.paint(noseve);
        for (Pieza x : piezas) {
            x.paint(noseve, this);
        }
        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {
        for (Pieza i : piezas) {
            if (i.contains(x, y) && !i.bloqueado) {
                i.mover(x, y);
                actual = i;
                repaint();
                break;
            }
        }
        return true;
    }

    public boolean mouseUp(Event ev, int x, int y) {
        tablero.comprobar(actual);
        actual = null;
        repaint();
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        if(actual == null)
            return false;
        actual.mover(x, y);
        repaint();
        return true;
    }

}
