package Segunda.prueba;

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

    Raqueta raqueta;
    Pelota pelota;
    Thread animacion;
    Image imagen;
    Graphics noseve;

    List<Ladrillo> ladrillos;

    Color colores[] = {Color.RED, Color.YELLOW, Color.BLUE, Color.PINK, Color.ORANGE};

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();

        ladrillos = new ArrayList<Ladrillo>();

        raqueta = new Raqueta();
        pelota = new Pelota();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                ladrillos.add(new Ladrillo((j * (28 + 2)) + 1, ((Ladrillo.ALTURA + 2) * i) + 10, colores[i]));
            }
        }
    }

    public void paint(Graphics g) {

        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 300, 300);

        for (int i = 0; i < ladrillos.size(); i++) {
            ladrillos.get(i).paint(noseve);
        }

        raqueta.paint(noseve);
        pelota.paint(noseve);

        g.drawImage(imagen, 0, 0, this);

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean keyDown(Event e, int key) {
        if (key == 1006) {
            raqueta.update(false);
        } else if (key == 1007) {
            raqueta.update(true);
        }
        repaint();
        return true;
    }

    public void run() {
        do {

            if (raqueta.contains(pelota.x, pelota.y)) {
                pelota.updateDirection(false, true);
            }

            for (int i = 0; i < ladrillos.size(); i++) {
                if (ladrillos.get(i).contains(pelota.x, pelota.y)) {
                    pelota.updateDirection(false, true);
                    ladrillos.remove(ladrillos.get(i));
                }
            }

            pelota.update();
            repaint();

            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }

        } while (true);
    }

}
