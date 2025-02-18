package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Marciano extends Rectangle {
    static final Color colores[] = {Color.BLUE, Color.CYAN, Color.GRAY, Color.MAGENTA, Color.ORANGE, Color.WHITE};
    Color color;
    static final int ALTURA = 20;
    static final int ANCHURA = 10;
    int velX;  
    public Marciano() {
        super((int) ((Math.random() * 250)), (int) ((Math.random() * 100)), ANCHURA, ALTURA);
        color = colores[(int) ((Math.random() * colores.length))];
        velX = (int) (Math.random() * 5) + 1;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, ANCHURA, ALTURA);
    }

    public void update() {
        this.y += velX;
        if((x<=0)||(x>=(300-width)))
    }

    public boolean over() {
        if (y + height > 300) {
            return true;
        }
        return false;
    }
}
