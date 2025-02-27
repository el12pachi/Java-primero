package Examen.ej2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bola extends Rectangle {

    Color color[] = {Color.YELLOW, Color.BLUE, Color.ORANGE, Color.CYAN, Color.RED, Color.GRAY};
    private int velY = (int) ((Math.random() * 10) - 5);
    private int velX = (int) ((Math.random() * 10) - 5);
    private int contador = 0;

    public Bola() {
        super(130, 130, 40, 40);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void paint(Graphics g) {
        g.setColor(color[contador]);
        g.fillOval(x, y, width, height);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 16));

        g.drawString("" + (contador + 1), x + (17), y + (25));

    }

    public void update() {
        this.y += velY;
        this.x += velX;
    }

    public boolean updateContador() {
        if (++contador >= 5) {
            return true;
        }
        return false;
    }
}
