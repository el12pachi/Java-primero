package Tercera.Ejercicio5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Casilla extends Rectangle {

    public static final int TAM = 30;
    private Image mina;
    Image reverso;
    private boolean tapada;
    private int alrededor;

    public int getAlrededor() {
        return alrededor;
    }

    public void setAlrededor(int alrededor) {
        this.alrededor = alrededor;
    }

    public Casilla(int posX, int posY, Image rev) {
        super(posX, posY, TAM, TAM);
        reverso = rev;
        tapada = true;
        alrededor = 0;
    }

    public Image getMina() {
        return mina;
    }

    public void setMina(Image mina) {
        this.mina = mina;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void setTapada(boolean tapada) {
        this.tapada = tapada;
    }

    public void paint(Graphics g, Applet ap) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
        if (tapada) {
            g.drawImage(reverso, x, y, width, height, ap);
        } else if (mina != null) {
            g.drawImage(mina, x, y, width, height, ap);
        } else {

            g.drawString("" + alrededor, x + 4, y + 13);
        }

    }

}
