package Segunda.Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coche extends Rectangle {

    int vel = (int) (int) Math.floor(Math.random() * 3) + 1;
    int carril = (int) (Math.random() * 2);
    boolean direccion = true;

    public Coche() {
        //235
        //108
        super(700, 108, 80, 60);
        if (carril == 1) {
            this.x = 0;
            this.y = 235;
            direccion = false;
        }

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public boolean update() {
        if (direccion) {
            x -= vel;
        } else {
            x += vel;
        }
        //y -= velY;
        // if(y+height < 0) return true;
        return false;
    }

}
