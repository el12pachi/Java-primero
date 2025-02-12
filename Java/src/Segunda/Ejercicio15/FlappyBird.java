package Segunda.Ejercicio15;

import Segunda.Ejercicio14.Ladrillo;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class FlappyBird extends Applet implements Runnable {

    Pajaro pajaro;
    Image imagen;
    Graphics noseve;
    Thread animacion;
    boolean continua;
    public static final int FILAS = 5;

    int contColumnas = 10;

    List<Columna> columnas;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        this.setSize(300, 300);
        columnas = new ArrayList<Columna>();
        //columnas.add(new Columna());
        continua = true;
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
        for (Columna columna : columnas) {
            columna.paint(noseve);
        }
        if (!continua) {
            noseve.drawString("GAME OVER", 120, 140);
        }

        g.drawImage(imagen, 0, 0, this);

    }

    public void reapint(Graphics g){
        paint(g);
    }
    
    
    public boolean keyDown(Event ev, int tecla) {
        if (tecla == Event.UP) {
            pajaro.saltar();
        }
        return true;
    }

    @Override
    public void run() {
        do {

            if (!continua) {
                repaint();
                animacion.stop();
            }

            for (Columna columna : columnas) {
                columna.update();
            }
            pajaro.update();
            repaint();

            if (contColumnas >= 20) {
                contColumnas = 0;
                columnas.add(new Columna());

            } else {
                contColumnas++;
            }

            if (columnas.size() > 0) {

                if (columnas.get(0).bottom.x < -30 || columnas.get(0).top.x < -30) {
                    columnas.remove(0);
                }

                continua = !pajaro.detectar(columnas.get(0).top, columnas.get(0).bottom);

            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }
}
