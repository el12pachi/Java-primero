
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

    public void update(int dr) {
        if (this.x <= (300 - this.width) && dr == 1007) {
            this.x += velX;
        }
        if (dr == 1006 && this.x >= 0) {
            this.x -= velX;
        }
    }
  
}
