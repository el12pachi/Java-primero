package Segunda.Ejercicio05;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ovalo {
    int x, y, anchura, altura;
    Color color;
    Random r;

    public Ovalo() {
        r = new Random();
        x = r.nextInt(200);
        y = r.nextInt(200);
        anchura = r.nextInt(100);
        altura = r.nextInt(100);
        color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    public void inicializar() {
        x = r.nextInt(200);
        y = r.nextInt(200);
        anchura = r.nextInt(100);
        altura = r.nextInt(100);
        color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, anchura, altura);
    }

}
