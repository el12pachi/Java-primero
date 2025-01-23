package Segunda.Ejercicio11;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

public class Animacion1 extends Frame implements Runnable {
    Thread animacion;
    String frames[] = {"*","**","***","****","*****","******","*****","****","***","**","*"};
    int actual = 0;
    public static void main(String[] args) {
        Animacion1 app = new Animacion1();
    }

    public Animacion1() {
        super("Animacion Sencilla");

        this.pack();
        this.setSize(200, 200);
        this.setVisible(true);
        animacion = new Thread(this);
        animacion.start();
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {

        }

        return false;

    }

    public void paint (Graphics g){
        g.drawString(frames[actual],80,100);
    }

    @Override
    public void run() {
        do {
            actual = (actual + 1) % frames.length;
            repaint();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {

            }
        } while (true);
    }

}