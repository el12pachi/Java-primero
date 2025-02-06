package Segunda.Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Pelota extends Rectangle {

    int velX, velY, radio;

    public Pelota() {
        super(150, 150, 9, 9); //parsear (convertir) -> (int)
        velX = (int) -3;
        velY = (int) -2;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
    }

    public boolean update(Raqueta raqueta, ArrayList<Ladrillo> ladrillos) {
        if (this.x >= (300 - width) || this.x <= 0) {
            velX *= -1;
        }
        if (this.y <= 0) {
            velY *= -1;
        }
        if (this.y >= (300 - height)) {
            return false;
        }
        
        this.x += velX;
        this.y += velY;
        if (raqueta.intersects(this)) {
            this.velY = -this.velY;
        };

        for (Ladrillo x : ladrillos) {
            if (x.intersects(this)) {
                ladrillos.remove(x);
                velY = -velY;
                break;
            }
        }
        
        return true;
    }
}
