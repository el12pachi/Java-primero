package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Marciano extends Rectangle {

    Color color;
    static final int ALTURA = 20;
    static final int ANCHURA = 10;

    public Marciano() {
        super((int) ((Math.random() * 300)), 0, ANCHURA, ALTURA);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, ANCHURA, ALTURA);
    }

    public void update() {
        this.y += 1;
     
    }

    public boolean over() {
        if (y + height > 300) {
            return true;
        }
        return false;
    }
}
