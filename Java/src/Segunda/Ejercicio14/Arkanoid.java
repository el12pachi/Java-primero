package Segunda.Ejercicio14;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Arkanoid extends Applet implements Runnable {

    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;
    ArrayList<Ladrillo> ladrillos;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pelota pelota;
    Raqueta raqueta;

    public void init() {
        Color colores[] = {Color.CYAN, Color.YELLOW, Color.ORANGE, Color.GREEN, Color.RED};
        ladrillos = new ArrayList<Ladrillo>();
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        pelota = new Pelota();
        raqueta = new Raqueta();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                ladrillos.add(new Ladrillo((j * (28 + 2)) + 1, ((Ladrillo.ALTURA + 2) * i) + 10, colores[i]));
            }
        }
        this.setSize(300, 300);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);

        for (int i = 0; i < ladrillos.size(); i++) {
            ladrillos.get(i).paint(noseve);
        }

        pelota.paint(noseve);
        raqueta.paint(noseve);

        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            pelota.update(raqueta, ladrillos);
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        } while (true);

    }

    public boolean handleEvent(Event ev) {
        if (Event.KEY_ACTION == ev.id) {
            raqueta.update(ev.key);
        }
        return false;
    }
}
