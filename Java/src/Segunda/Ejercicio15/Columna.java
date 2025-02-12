package Segunda.Ejercicio15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Columna {

    Rectangle top;
    Rectangle bottom;

    public Columna() {
        int alturaRandom = (int) ((Math.random() * 105) + 20);
        top = new Rectangle(300 - 30, 0, 30, alturaRandom);
        bottom = new Rectangle(300 - 30, alturaRandom + 75, 30, 300 - 75 - alturaRandom);
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(top.x, top.y, top.width, top.height);
        g.fillRect(bottom.x, bottom.y, bottom.width, bottom.height);

    }

    public boolean update() {
        top.x = top.x - 7;
        bottom.x = bottom.x - 7;


        return true;
    }

}
