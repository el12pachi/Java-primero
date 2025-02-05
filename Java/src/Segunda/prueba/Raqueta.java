package Segunda.prueba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Raqueta extends Rectangle {

    int velX;

    public Raqueta() {
        super(120, 260, 60, 10);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

    public void update(boolean direction) {
        if (direction && x < 300-65) {
            this.setLocation(x + 15, y);
        } else if (!direction && x > 0+5) {
            this.setLocation(x - 15, y);
        }
    }

}
