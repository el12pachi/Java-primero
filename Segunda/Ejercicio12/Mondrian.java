package Segunda.Ejercicio12;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Mondrian extends Applet implements Runnable {
    Thread animacion;
    int posX, posY;
    Image imagen;
    Graphics noseve;
    
    public void init() {
        posX = 80;
        posY = 100;
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 300, 300);
        noseve.setColor(Color.yellow);
        noseve.fillRect(0, 0, 90, 90);
        noseve.fillRect(250, 0, 40, 190);
        noseve.fillRect(80, 160, 100, 120);
        noseve.setColor(Color.blue);
        noseve.fillRect(80, 220, 220, 90);
        noseve.fillRect(100, 10, 90, 80);
        noseve.setColor(Color.gray);
        noseve.fillRect(posX, posY, 110, 90);
        noseve.setColor(Color.red);
        noseve.fillRect(200, 0, 45, 45);
        noseve.fillRect(0, 110, 70, 200);
        noseve.setColor(Color.magenta);
        noseve.fillRect(200, 55, 60, 135);
        g.drawImage(imagen, 0, 0, this);
    }


    public void update(Graphics g) {
       paint(g);;
    }

    @Override
    public void run() {
        do {
            posX++;
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        } while (true);
    }
}
