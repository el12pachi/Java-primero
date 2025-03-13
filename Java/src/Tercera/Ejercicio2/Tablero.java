package Tercera.Ejercicio2;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;

public class Tablero {

    int dimension;
    int filas;
    int columnas;
    Rectangle casillas[];

    public Tablero(int dimension, int filas, int columnas) {
        this.dimension = dimension;
        this.filas = filas;
        this.columnas = columnas;
        casillas = new Rectangle[filas * columnas];

        for (int x = 0, contador = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {
                casillas[contador++] = new Rectangle(y * dimension, x * dimension, dimension, dimension);
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        for (Rectangle z : casillas) {
            g.fillRect(z.x, z.y, z.width, z.height);
        }
    }

    public void comprobar(Pieza pieza) {
        if (pieza.intersects(casillas[pieza.pos])) {
            pieza.x = casillas[pieza.pos].x;
            pieza.y = casillas[pieza.pos].y;
            pieza.bloqueado = true;
        }

    }
}
