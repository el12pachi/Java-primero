package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bala extends Rectangle {

    int velY = 15;

    public Bala(int x, int y) {
        super(x, 260, 5, 10);

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public boolean update() {
        y -= velY;
        if(y+height < 0) return true;
        return false;
    }
   
}
