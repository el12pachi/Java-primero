
package Tercera.Examen2023;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Pedal extends Rectangle {
    Image pedal;
    public static final int ALTURA = 120;
    public static final int ANCHURA = 50;

    public Pedal(Image pedal, int x, int y) {
        super(x, y, ANCHURA, ALTURA);
        this.pedal = pedal;
    }
    
    public void paint(Graphics g, Applet a){
        g.drawImage(pedal, x, y,ANCHURA,ALTURA, a);
    }
    
}
