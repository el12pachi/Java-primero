package Examen.ej1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Nave extends Rectangle {

    Color color;
    int velX = 2;

    public Nave(Color color, int y) {
        super(130, y, 30, 30);
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void sum() {
        width += 1;
        height += 1;
    }

    public void update(ArrayList<Bala> balas) {
        this.x += velX;
        if ((x <= 0) || (x >= (300 - width))) {
            velX *= -1;
        }

        for (Bala bala : balas) {
            if (bala.intersects(this) && this.color == bala.color) {
                sum();
            }
        }
    }
}
