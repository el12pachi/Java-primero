package Examen.ej1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bala extends Rectangle {

    Color color;
    int velY = -2;

    public Bala(Color color, int x) {
        super(x, 260, 20, 20);
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }


    public boolean update() {
        this.y += velY;
        if (y <= (0 - height)) {
            return true;
        }
        return false;

    }

}
