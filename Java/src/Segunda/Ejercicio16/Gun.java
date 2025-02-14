package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Gun extends Rectangle {

    int velX;

    public Gun() {
        super(110, 270, 10, 30);
        velX = 15;
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, width, height);
    }

    public void update(int postX) {
        postX -= width / 2;
        this.x = postX;
        if (this.x >= (300 - this.width)) {
            this.x = (300 - this.width);
        } else if (this.x <= 0) {
            this.x = 0;
        }

    }

}
