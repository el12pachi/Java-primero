package Tercera.Ejercicio3;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextField;

public class BlackJack extends Applet {

    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    String palos[] = {"clubs", "diamonds", "hearts", "spades"};
    Image imagenes[];
    Image imagen;
    Graphics noseve;
    Baraja baraja;
    Mano mano1, mano2;
    TextField apuesta;
    Rectangle tablero[][];
    Button boton1, boton2;

    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        imagenes = new Image[NUMCARTAS];
        for (int i = 0; i < imagenes.length; i++) {
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio3/Cartas/" + ((i % CPP) + 1) + "_of_" + palos[i / CPP] + ".png");
        }
        baraja = new Baraja(imagenes);
        mano1 = new Mano(50);
        mano2 = new Mano(300);

        this.setLayout(new BorderLayout());
        Panel primerPanel = new Panel();
        Label etiqueta = new Label("Introduce tu apuesta: ", Label.RIGHT);
        apuesta = new TextField("", 10);
        primerPanel.add(etiqueta);
        primerPanel.add(apuesta);
        this.add("North", primerPanel);

        Panel segundoPane2 = new Panel();
        boton1 = new Button("Carta !");
        boton2 = new Button("Me planto !");
        segundoPane2.add(boton1);
        segundoPane2.add(boton2);
        this.add("South", segundoPane2);

        this.setSize(700, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.GREEN);
        noseve.fillRect(0, 0, 700, 500);
        mano1.paint(noseve, this);
        mano2.paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {

        return true;
    }

    public void otro() {
        boton1.disable();
        while (mano1.valor() < 17) {
            mano1.anadir(baraja.sacarCarta());
            repaint();
        }
        if ((mano2.seHaPasado() && mano1.seHaPasado()) || mano2.valor() == mano1.valor()) {
            System.out.print("Empate" + " Crouppier:" + mano1.valor()+ " Jugador:"+mano2.valor());
        } else if ((!mano2.seHaPasado() && mano2.valor() > mano1.valor()) || mano1.seHaPasado()) {
            System.out.print("Ganastes" + " Crouppier:" + mano1.valor()+ " Jugador:"+mano2.valor());
        } else if ((!mano1.seHaPasado() && mano1.valor() > mano2.valor()) || mano2.seHaPasado()) {
            System.out.print("Perdistes" + " Crouppier:" + mano1.valor()+ " Jugador:"+mano2.valor());
        }
    }

    public boolean action(Event ev, Object obj) {
        if (ev.target instanceof TextField) {
            apuesta.setEditable(false);
            mano1.anadir(baraja.sacarCarta());
            mano2.anadir(baraja.sacarCarta());
            mano2.anadir(baraja.sacarCarta());
        } else if (ev.target instanceof Button) {
            if (ev.arg.equals("Carta !")) {
                mano2.anadir(baraja.sacarCarta());
                if (mano2.seHaPasado()) {
                    otro();
                }
            } else if (ev.arg.equals("Me planto !")) {
                otro();
            }
        }
        repaint();
        return true;
    }

}
