package Examen.ej1;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Gun extends Rectangle {

    private Color color;

    public Gun(Color color, int x) {
        super(x, 280, 20, 20);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }



    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
