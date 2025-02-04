package Segunda.Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;



public class Ladrillo extends Rectangle{
    Color color; 
    static final int ALTURA = 10;
    static final int ANCHURA = 28;
    int x, y ;
    public Ladrillo(int x, int y, Color color) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, ANCHURA, ALTURA);
    }
}
