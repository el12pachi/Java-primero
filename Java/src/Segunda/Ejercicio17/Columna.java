package Segunda.Ejercicio17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Columna extends Rectangle {

    public Columna() {
        super(800, 260, 40, 40); //parsear (convertir) -> (int)
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);

    }

    public boolean update() {
        this.x = this.x - 7;
        return this.x < 0;
    }

}
