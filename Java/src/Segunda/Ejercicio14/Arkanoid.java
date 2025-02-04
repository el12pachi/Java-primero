package Segunda.Ejercicio14;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

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
        for (int i = 1; i <= FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                ladrillos.add(new Ladrillo(j * 30, i * 12, colores[i - 1]));
            }
        }
        this.setSize(300, 300);
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

    @Override
    public void run() {
        do {
            repaint();

            try {
                System.out.println("asd");

                Thread.sleep(10);
            } catch (InterruptedException e) {
                                System.out.println("asd");

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
