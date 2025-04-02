package Tercera.Ejercicio5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

public class BuscaMinas extends Applet {

    public static final int DIM = 10;
    public static final int CANT = 10;
    Image imagen;
    Graphics noseve;
    Image mina;
    Image reverso;
    Casilla casillas[][] = new Casilla[DIM][DIM];
    ArrayList<Integer> minas = new ArrayList<>();

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
        for (int x = 0; x < (DIM * DIM); x++) {
            minas.add(x);
        }

        Collections.shuffle(minas);
        for (int x = 0; x < CANT; x++) {
            casillas[minas.get(x) / DIM][minas.get(x) % DIM].setMina(mina);
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
        mina(x, y);
        repaint();
        return true;
    }

    private void mina(int x, int y) {
        for (int j = 0; j < DIM; j++) {
            for (int z = 0; z < DIM; z++) {
                if (casillas[j][z].contains(x, y)) {
                    viewAlrededor(j, z);
                    casillas[j][z].setTapada(false);
                }

            }
        }
    }

    public void viewAlrededor(int col, int fil) {
        int cont = 0;
        for (int x = col - 1; x <= col + 1; x++) {
            for (int y = fil - 1; y <= fil + 1; y++) {
                try {
                    if (casillas[x][y].getMina() != null) {
                        cont++;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                }

            }
        }
        casillas[col][fil].setAlrededor(cont);
    }
}
