package Tercera.Examen;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Conjunto {

    public static final int COL = 7;
    public static final int FILAS = 10;
    ArrayList<Pieza> piezas;
    int numberMax = 4;

    public Conjunto() {
        piezas = new ArrayList<Pieza>();
    }

    public void paint(Graphics g) {
        for (Pieza p : piezas) {
            p.paint(g);
        }

    }

    public void subirFila() {
        for (Pieza p : piezas) {
            p.subir();
        }
    }

    public void cargarFila() {
        for (int y = 0; y < COL; y++) {
            piezas.add(new Pieza(y * 40, (FILAS - 1) * 40, numberMax));
        }
    }

    public void update() {
        subirFila();
        cargarFila();
    }

    public Pieza selectPieza(int x, int y) {
        for (Pieza p : piezas) {
            if (p.contains(x, y)) {
                return p;
            };

        }
        return null;
    }

    public void comprobar(Pieza pieza) {
        for (Pieza p : piezas) {
            if (p != pieza && p.intersects(pieza) && pieza.getNumber() == p.getNumber() && pieza.getNumber() != 10) {
                p.setNumber(p.getNumber() + 1);
                if (p.getNumber() > numberMax) {
                    numberMax = p.getNumber();
                }
                piezas.remove(pieza);
                return;
            };
        }
        pieza.restPosicion();
    }

}
