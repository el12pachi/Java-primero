package Segunda.Ejercicio12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Mondrian2 extends Applet implements Runnable {

    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    int direccion;
    Thread animacion;
    int posX, posY;
    Graphics noseve;
    Image imagen; //no se peude pintar en un objeto imagen, por eso se introduce la variable Graphics.

    public void init() {
        posX = 80;
        posY = 100;
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        direccion = DERECHA;
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        noseve.setColor(Color.yellow);
        noseve.fillRect(0, 0, 90, 90);
        noseve.fillRect(250, 0, 40, 190);
        noseve.fillRect(80, 160, 100, 120);
        noseve.setColor(Color.BLUE);
        noseve.fillRect(80, 220, 220, 90);
        noseve.fillRect(100, 10, 90, 80);
        noseve.setColor(Color.LIGHT_GRAY);
        noseve.fillRect(posX, posY, 110, 90);
        noseve.setColor(Color.RED);
        noseve.fillRect(200, 0, 45, 45);
        noseve.fillRect(0, 110, 70, 200);
        noseve.setColor(Color.MAGENTA);
        noseve.fillRect(200, 55, 60, 135);
        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);

    }

    @Override
    public void run() {
        do {
            ActualizarGiros();
            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        } while (true);

    }

    public void ActualizarGiros() {
        switch (direccion) { //con este switch se produce el giro del bloque en sentido de las agujas del reloj.
            case ARRIBA:
                posY--;
                if (posY <= 100) {
                    direccion = DERECHA;
                }
                break;

            case ABAJO:
                posY++;
                if (posY >= 120) {
                    direccion = IZQUIERDA;
                }
                break;

            case DERECHA:
                posX++;
                if (posX >= 100) {
                    direccion = ABAJO;
                }
                break;

            case IZQUIERDA:
                posX--;
                if (posX <= 80) {
                    direccion = ARRIBA;
                }
                break;
        }
    }
}