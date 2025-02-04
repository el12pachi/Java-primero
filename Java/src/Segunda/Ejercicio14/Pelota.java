package Segunda.Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota extends Rectangle {

    int velX, velY, radio;

    public Pelota() {
        super(150,150, 0, 0); //parsear (convertir) -> (int)
        radio = 10;
        this.setSize(radio, radio);
        velX = (int) ((Math.random() * 11) - 5);
        velY = (int) ((Math.random() * 11) - 5);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
    }

    public void update() {
        if (this.x >= (300 - this.radio) || this.x <= 0) {
            velX *= -1;
        }
        if (this.y >= (300 - this.radio) || this.y <= 0) {
            velY *= -1;
        }
        this.x += velX;
        this.y += velY;

    }
}
