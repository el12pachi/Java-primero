package Tercera.Ejercicio1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Caminar extends Applet implements Runnable {

    public static final int TIEMPO = 50;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image img1;
    Image fotogramas[][];
    String lugares[] = {"Guerrillero/g", "Hampon/h", "Vaquero/v"};
    DibujoAnimado animado;

    public void init() {
        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        fotogramas = new Image[3][4];
        for (int i = 0; i < fotogramas.length; i++) {
            for (int j = 0; j < fotogramas[i].length; j++) {
                fotogramas[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio1/Sprites/" + lugares[i] + (j + 1) + ".gif");
            }
        }

        animado = new DibujoAnimado(fotogramas[0]);

        this.setSize(500, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 500, 500);

        animado.paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);

    }

    @Override
    public void run() {
        do {

            animado.update();
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {
                Logger.getLogger(Caminar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    public boolean keyDown(Event ev, int tecla) {
        switch (tecla) {
            case 103:
            case 71:
                animado.setImagenes(fotogramas[0]);
                break;

            case 72:
            case 104:
                animado.setImagenes(fotogramas[1]);
                break;
            case 86:
            case 118:
                animado.setImagenes(fotogramas[2]);
                break;
        }

        return true;
    }

}
