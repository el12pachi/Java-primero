package Segunda.sinTerminal;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class FlappyBird extends Applet implements Runnable {

    Pajaro pajaro;
    Image imagen;
    Graphics noseve;
    Thread animacion;
    Columna pintar;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        this.setSize(300, 300);
        pintar = new Columna();
        pajaro = new Pajaro();

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        pajaro.paint(noseve);
        pintar.paint(noseve);
        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            pajaro.update();
            repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }

    public boolean keyDown(Event ev, int tecla) {
        if (tecla == Event.UP) {
            pajaro.saltar();
        }
        return true;
    }
}
