package Segunda.Ejercicio16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable {

    ArrayList<Bala> balas;
    ArrayList<Marciano> marcianos;
    int contador = 250;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Gun pistola;
    boolean continua = false;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        balas = new ArrayList<Bala>();
        marcianos = new ArrayList<Marciano>();
        pistola = new Gun();
        this.setSize(300, 300);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        for (Bala x : balas) {
            x.paint(noseve);
        }
        for (Marciano x : marcianos) {
            x.paint(noseve);
        }
        if (continua) {
            noseve.drawString("GAME OVER", 120, 140);
        }
        pistola.paint(noseve);
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            for (Bala x : balas) {
                if (x.update()) {
                    balas.remove(x);
                    break;
                }
                for (Marciano y : marcianos) {
                    if (x.intersects(y)) {
                        marcianos.remove(y);
                        break;
                    }
                }
            }
            
            for (Marciano x : marcianos) {
                x.update();
                if (!continua && x.over()) {
                    continua = true;
                }
            }

            if (continua) {
                repaint();
                animacion.stop();
            }
            if (contador >= 50) {
                marcianos.add(new Marciano());
                contador = 0;
            }
            contador++;
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }
        } while (true);

    }

    public boolean mouseDown(Event ev, int x,int y) {

        balas.add(new Bala(pistola.x, pistola.y));

        return true;
    }

    public boolean mouseMove(Event e, int x, int y) {
        pistola.update(x);
        return true;
    }

}
