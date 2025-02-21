package Segunda.Ejercicio17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Personaje extends Rectangle {

    public static int VELY = 0;
    public static final int TOPE = 150;
    boolean salto = true;
    int gravedad = 15;
//300 - height + SALTO)

    public Personaje() {
        super(20, 280, 20, 30);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
    }

    public void update() {
        if (!salto && this.y == 300 - height) {
            VELY = -1;
            gravedad = -15;
        }
        if (this.y < TOPE) {
            VELY = 1;
            gravedad = 0;
            salto = true;
        }

        gravedad += 1;
        this.y += VELY + gravedad;
        if (this.y >= 300 - height) {
            salto = true;
            this.y = 300 - height;
        }

    }

    public boolean update(Columna obs) {
        update();

        return this.intersects(obs);
    }

    public void saltar() {
        if (salto) {
            salto = false;
        }
    }
}
