package Tercera.Ejercicio9;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Snake extends Applet implements Runnable {

    public static final int TIEMPO = 300;
    final int tiempoManzana = 5000 / 300;
    int contadorManzana = 0;
    Thread animacion;
    Image imagen;
    Graphics noseve;

    Image imgCasilla;
    Image imgManzana;
    ArrayList<Eslabon> manzanas;
    Serpiente serpiente;

    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();

        imgCasilla = getImage(getCodeBase(), "Tercera/Ejercicio9/casilla.png");
        imgManzana = getImage(getCodeBase(), "Tercera/Ejercicio9/manzana.png");

        manzanas = new ArrayList<Eslabon>();
        serpiente = new Serpiente(imgCasilla);
        manzanas.add(new Eslabon(imgManzana, (int) (Math.floor(Math.random() * (700))), (int) (Math.floor(Math.random() * (800))), Eslabon.DERECHA));
        this.setSize(700, 800);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 700, 800);
        serpiente.paint(noseve, this);
        for (Eslabon m : manzanas) {
            m.paint(noseve, this);
        }
        g.drawImage(imagen, 0, 0, this);
    }

    public void run() {
        do {
            serpiente.update();
            if (tiempoManzana < contadorManzana++) {
                contadorManzana = 0;
                manzanas.add(new Eslabon(imgManzana, (int) (Math.floor(Math.random() * (700))), (int) (Math.floor(Math.random() * (800))), Eslabon.DERECHA));
            }
            for (Eslabon m : manzanas) {
                if (m.intersects(serpiente.primero())) {
                    manzanas.remove(m);
                    serpiente.add();
                    break;
                }
            }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException e) {
            }
        } while (true);
    }

    public boolean keyDown(Event e, int tecla) {
        serpiente.cambiarDireccion(tecla);
        repaint();
        return true;
    }
}
