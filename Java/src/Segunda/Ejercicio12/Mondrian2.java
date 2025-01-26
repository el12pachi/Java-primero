package Segunda.Ejercicio12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Mondrian2 extends Applet implements Runnable {

    Thread animacion;
    Graphics noseve;
    Image imagen; //no se peude pintar en un objeto imagen, por eso se introduce la variable Graphics.
    int[][] rectanguloVector = {
        {0, 0, 300, 300},
        {0, 0, 90, 90},
        {250, 0, 40, 190},
        {80, 160, 100, 120},
        {80, 220, 220, 90},
        {100, 10, 90, 80},
        {80, 100, 110, 90},
        {200, 0, 45, 45},
        {0, 110, 70, 200},
        {200, 55, 60, 135}
    };

    Color[] colores = {
        Color.BLACK,
        Color.YELLOW,
        Color.YELLOW,
        Color.YELLOW,
        Color.BLUE,
        Color.BLUE,
        Color.LIGHT_GRAY,
        Color.RED,
        Color.RED,
        Color.MAGENTA
    };

    Rectangulo rect[] = new Rectangulo[10];

    public void init() {
        for (int x = 0; x < rectanguloVector.length; x++) {
            rect[x]= new Rectangulo(rectanguloVector[x][0], rectanguloVector[x][1], rectanguloVector[x][2], rectanguloVector[x][3], colores[x]);
        }
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
                g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 400);
        for(Rectangulo x:rect){
            x.update();
            x.paint(g);
        }

       // g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);

    }

    @Override
    public void run() {
        do {
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        } while (true);

    }

}
