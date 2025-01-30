package Segunda.Ejercicio13;

import static Segunda.Ejercicio09.Restaurante.updateList;
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Rebote extends Applet implements Runnable {

    Thread animacion;
    Graphics noseve;
    Image imagen;
    List<Pelota> pelotas = new ArrayList<Pelota>();

    public void init() {

        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        for (int x = 0; x < (int) (Math.random() * 10) + 1; x++) {
            pelotas.add(new Pelota());
        }
        this.setSize(300, 300);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 300, 300);
        for (Pelota x : pelotas) {
            x.update();
            x.paint(noseve);
        }
        g.drawImage(imagen, 0, 0, this);

    }

    @Override
    public void run() {
        do {

            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        } while (true);

    }

    public boolean handleEvent(Event ev) {

        if (ev.id == Event.MOUSE_DOWN) {
            for (Pelota x : pelotas) {
                if (x.contains(ev.x, ev.y))
                        pelotas.remove(x);               
            }
        }

        return false;
    }

}
