package Tercera.Ejercicio8;

import java.applet.Applet;
import java.awt.*;

public class Carta extends Rectangle {

    public static final int ANCHURA = 70;
    public static final int ALTURA = 120;

    public static final int ROJO = 1;
    public static final int NEGRO = 2;

    public static final int PICAS = 1;
    public static final int ROMBOS = 2;
    public static final int CORAAZONES = 3;
    public static final int TREBOLES = 4;

    Image imagen;
    private int valor;
    private int color;
    private int palo;

    public Carta(Image img, int v, int c, int p) {
        super(-200, -200, ANCHURA, ALTURA);
        imagen = img;
        valor = v;
        color = c;
        palo = p;
    }

    public void paint(Graphics g, Applet ap) {
        g.drawImage(imagen, x, y, ANCHURA, ALTURA, ap);
    }

    public int getValor() {
        return valor;
    }

    public int getColor() {
        return color;
    }

    public int getPalo() {
        return palo;
    }

  

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
