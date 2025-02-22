package Segunda.Ejercicio18;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Rana extends Rectangle {

    public static final int VEL = 3;

    public Rana() {
        super(335, 360, 30, 40);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }

    public void update(int dir) {
        switch (dir) {
            case 1004:
                y -= VEL;
                break;
            case 1005:
                y += VEL;
                break;
            case 1006:
                x -= VEL;
                break;
            case 1007:
                x += VEL;
                break;
        }
    }
}
