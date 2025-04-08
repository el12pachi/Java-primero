package Tercera.Ejercicio6;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Casilla extends Rectangle {

    public static final int DIM = 60;
    private int valor;
    Color color;

    public Casilla(int posX, int posY, int valor, Color color) {
        super(posX, posY, DIM, DIM);
        this.valor = valor;
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.setFont(new Font("TimesRoman", Font.BOLD, 24));
        g.setColor(Color.WHITE);
        g.drawRect(x, y, width, height);
        g.drawString("" + valor, x + 20, y + 20);
    }

}
