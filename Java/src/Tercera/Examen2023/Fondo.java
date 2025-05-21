
package Tercera.Examen2023;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Fondo {
    Image fondo;
    int posX = 0;
    Applet applet;
            
    public Fondo(Image fondo,Applet a) {
        this.fondo = fondo;
        applet = a;
    }
    public void update(){
        posX -=5;
        if(posX <= -applet.getWidth()) posX = 0;
    }

    public void paint(Graphics g){
        g.drawImage(fondo, posX, 0,applet.getWidth(),applet.getHeight(), applet);
        g.drawImage(fondo, posX+applet.getWidth(), 0,applet.getWidth(),applet.getHeight(), applet);
    }      
}
