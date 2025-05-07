package Tercera.Ejercicio8;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoJuego extends Rectangle {

    public static final int POSICIONY = 200;
    ArrayList<Carta> cartas;

    public MazoJuego(int posX) {
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
        if (cartas.isEmpty() || (carta.getColor() != cartas.get(cartas.size() - 1).getColor() && (carta.getValor() + 1 == cartas.get(cartas.size() - 1).getValor()))) {
            recolocar(carta);
            cartas.add(carta);
            return true;
        }
        return false;
    }

    public boolean anadirPrincipio(Carta carta, int PosY) {
        cartas.add(carta);
        cartas.get(cartas.size() - 1).setPosition(x, POSICIONY + PosY);
        return true;
    }

    public Carta extraer() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.get(cartas.size() - 1);
    }

    public void eliminar() {
        cartas.remove(cartas.size() - 1);
    }

    public void recolocar(Carta carta) {
        if (cartas.isEmpty()) {
            carta.setPosition(x, y);
        } else {
            carta.setPosition(x, y + (25 * (cartas.size() - 1)));
        }
    }
}
