package Segunda.Ejercicio13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Rebote extends Applet implements Runnable {

    Thread animacion;
    Graphics noseve;
    Image imagen;
    Pelota pelotas[] = new Pelota[(int) (Math.random() * 10)+1];

    public void init() {
        imagen = this.createImage(250, 250);
        noseve = imagen.getGraphics();
        for (int x = 0; x < pelotas.length; x++) {
            pelotas[x] = new Pelota();
        }
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

}
