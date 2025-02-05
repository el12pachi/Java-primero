package Segunda.Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Raqueta extends Rectangle {

    int velX;

    public Raqueta() {
        super(110, 250, 80, 10); //parsear (convertir) -> (int)
        velX = 15;
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, width, height);
    }

    public void update(int dr) {
        if (this.x <= (300 - 75) && dr == 1007) {
            this.x += velX;
        }
        if (dr == 1006 && this.x >= 0) {
            this.x -= velX;
        }
    }
  
}
