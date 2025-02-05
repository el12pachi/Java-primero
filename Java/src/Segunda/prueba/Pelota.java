package Segunda.prueba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota extends Rectangle {

    int velX = 5;
    int velY = 5;

    public Pelota() {
        super(145, 265, 9, 9);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, width, height);
    }

    public void update() {
        if (x <= 0 || x >= (300 - this.width)) {
            velX = -velX;
        }

        if (y <= 0 || y >= (300 - this.height)) {
            velY = -velY;
        }

        x += velX;
        y += velY;
    }

    public void updateDirection(boolean xUpdate, boolean yUpdate) {
        if (xUpdate) {
            velX = -velX;
        }

        if (yUpdate) {
            velY = -velY;
        }
    }

}
