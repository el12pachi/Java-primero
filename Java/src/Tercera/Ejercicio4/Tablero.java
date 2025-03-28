package Tercera.Ejercicio4;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
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
    Button boton1;

    public void init() {
        imagen = this.createImage(400, 500);
        noseve = imagen.getGraphics();
        this.setLayout(new BorderLayout());
        Panel segundoPane2 = new Panel();
        boton1 = new Button("Desordenar");
        segundoPane2.add(boton1);
        this.add("South", segundoPane2);

        try {
            error = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio4/sonidos/error.wav"));
            acierto = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio4/sonidos/correct.wav"));
            exito = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio4/sonidos/exito.wav"));
        } catch (MalformedURLException e) {
        };

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

    public boolean mouseDown(Event ev, int x, int y) {
        Point click;
        click = new Point(y / Lugar.DIM, x / Lugar.DIM);

        if (!mover(click)) {
            error.play();
        } else {
            acierto.play();
            repaint();
        }

        return true;
    }

    public boolean mover(Point click) {
        Point desplazamiento, hasta;
        desplazamiento = new Point(delta(click.x, blanco.x), delta(click.y, blanco.y));

        if ((desplazamiento.x == 0) && (desplazamiento.y == 0)) {
            return false;
        }

        if ((desplazamiento.x != 0) && (desplazamiento.y != 0)) {
            return false;
        }

        hasta = new Point(click.x + desplazamiento.x, click.y + desplazamiento.y);

        if (!((blanco.x == hasta.x) && (blanco.y == hasta.y))) {
            mover(hasta);
        }

        lugares[blanco.x][blanco.y].setImagen(lugares[click.x][click.y].getImagen());
        lugares[blanco.x][blanco.y].valor = lugares[click.x][click.y].valor;
        lugares[click.x][click.y].setImagen(null);
        lugares[click.x][click.y].valor = 24;
        blanco = click;

        return true;
    }

    public int delta(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            return ((b - a) / Math.abs(b - a));
        }

    }

    public boolean action(Event ev, Object obj) {
        if (ev.target instanceof Button) {
            for (int i = 0; i < 100; i++) {
                mover(new Point((int) (Math.random() * 5), (int) (Math.random() * 5)));
                repaint();
            }

        }
        return true;
    }
}
