package Segunda.Ejercicio15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pajaro extends Rectangle {

    public static final int VELY = 5;
    public static final int SALTO = -40;

    public Pajaro() {
        super(50, 100, 30, 30);
    }

    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(x, y, width, height);
    }
    
    public void update(){
        this.y += VELY;
    }
    
    public void saltar(){
        this.y += SALTO;
    }
    
}
