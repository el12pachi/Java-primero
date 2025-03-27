package Tercera.Ejercicio4;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Tablero extends Applet {

    public static final int TAM = 5;

    Image imagen;
    Graphics noseve;
    Image[][] imagenes = new Image[TAM][TAM];
    Lugar lugares[][] = new Lugar[TAM][TAM];
    Point blanco;
    AudioClip error, acierto, exito;

    public void init() {
        imagen = this.createImage(400, 500);
        noseve = imagen.getGraphics();
        try {
            error = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio4/sonidos/error.wav"));
            acierto = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio4/sonidos/correct.wav"));
            exito = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio4/sonidos/exito.wav"));
        } catch (MalformedURLException e) {

        }
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                imagenes[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio4/botones/" + ((i * TAM) + j + 1) + ".gif");
                lugares[i][j] = new Lugar(imagenes[i][j], (i * TAM) + j);
            }
        }
        blanco = new Point(TAM - 1, TAM - 1);
        this.setSize(400, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY);
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                lugares[i][j].paint(noseve, this, j, i);
            }
        }

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mover(Point click) {
        Point desplazamiento, hasta;
        desplazamiento = new Point(delta(click.x, blanco.x), delta(click.y, blanco.y));
        int deltaX = delta(click.x, blanco.x);
        int deltaY = delta(click.y, blanco.y);

        if ((desplazamiento.x == 0 && desplazamiento.y == 0) || (desplazamiento.x != 0 && desplazamiento.y != 0)) {
            return false;
        }
        
        hasta = new Point( click.x + desplazamiento.x, click.y + desplazamiento.y);
        return true;

    }

    public int delta(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            return ((b - a) / Math.abs(b - a));
        }

    }

    public boolean mouseDown(Event ev, int x, int y) {
        Point click = new Point(x / Lugar.DIM, y / Lugar.DIM);

        if (!mover(click)) {
            error.play();
        } else {
            acierto.play();
        }
        return true;
    }

    public boolean action(Event ev, Object obj) {

        return true;
    }

}
