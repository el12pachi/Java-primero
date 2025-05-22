package Tercera.Examen;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;

public class Pieza extends Rectangle {

    public static final int DIMENSION = 40;
    private int number;
    Color colores[] = {Color.MAGENTA, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW};
    int posX;
    int posY;

    public Pieza(int posX, int posY, int max) {
        super(posX, posY, DIMENSION, DIMENSION);
        this.number = (int) (Math.random() * max) + 1;
        this.posX = posX;
        this.posY = posY;
    }

    public void paint(Graphics g) {
        g.setColor(colores[number - 1]);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
        g.drawString((number + ""), x + 20, y + 20);
    }

    public void mover(int posx, int posy) {
        x = posx - (DIMENSION / 2);
        y = posy - (DIMENSION / 2);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void restPosicion() {
        x = posX;
        y = posY;
    }
    
    public void subir(){
        this.y -= DIMENSION;
        posY = y;
    }
}
