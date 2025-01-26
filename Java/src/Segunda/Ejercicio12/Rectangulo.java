package Segunda.Ejercicio12;

import static Segunda.Ejercicio12.Mondrian.ABAJO;
import static Segunda.Ejercicio12.Mondrian.ARRIBA;
import static Segunda.Ejercicio12.Mondrian.DERECHA;
import static Segunda.Ejercicio12.Mondrian.IZQUIERDA;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo {

    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    int direccion;
    int x,inicialX, y,inicialY, ancho, largo;
    Color color;

    public Rectangulo(int x, int y, int ancho, int largo, Color color) {
        this.x = x;
        this.y = y;
        this.inicialY = y;
        this.inicialX = x;
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, ancho, largo);
    }

    public void update() {
        switch (direccion) { //con este switch se produce el giro del bloque en sentido de las agujas del reloj.
            case ARRIBA:
                y--;
                if (y <= inicialY ) {
                    direccion = DERECHA;
                }
                break;

            case ABAJO:
                y++;
                if (y >= inicialY +20) {
                    direccion = IZQUIERDA;
                }
                break;

            case DERECHA:
                x++;
                if (x >= inicialX) {
                    direccion = ABAJO;
                }
                break;

            case IZQUIERDA:
                x--;
                if (x <= inicialX -20) {
                    direccion = ARRIBA;
                }
                break;
        }
    }
}


