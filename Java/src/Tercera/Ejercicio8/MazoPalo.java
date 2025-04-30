package Tercera.Ejercicio8;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoPalo extends Rectangle {

    public static final int POSICIONY = 20;
    ArrayList<Carta> cartas;

    public MazoPalo(int posX) {
        super(posX, POSICIONY, Carta.ANCHURA, Carta.ALTURA);
        cartas = new ArrayList<Carta>();
    }

    public void paint(Graphics g, Applet a) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
        for (Carta carta : cartas) {
            carta.paint(g, a);
        }

    }

    public boolean anadir(Carta carta) {
        if (carta.intersects(this)) {
            cartas.add(carta);
            return true;
        }
         return false;
    }
}
