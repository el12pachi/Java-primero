
package Tercera.Examen2023;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;



public class Coche extends Rectangle{
    Image coche;
    Image luz;
    Boolean encendida = false;
    public final int TAMX = 300;
    public final int TAMY = 250;

    public Coche(Image coche, Image luz) {
        super(0, 115, 300, 250);
        this.coche = coche;
        this.luz = luz;
    }
    public void paint(Graphics g, Applet a){
        g.drawImage(coche, 0, 115,TAMX,TAMY, a);
        if(encendida)
            g.drawImage(luz, 260, 200,130,100, a);
    }

    public void setEncendida(Boolean encendida) {
        this.encendida = encendida;
    }
    public void encendida(){
        if(this.encendida){
            this.setEncendida(false);
        }else
            this.setEncendida(true);
    }
    
}
