package Tercera.Examen2024;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Granada extends Rectangle{
    public static final int TAM = 20;
    public static final int VELY = 5;
    boolean direccion = true;
    Image imagen;
    
    public Granada(Image img, int PosX, int PosY){
        super(PosX, PosY, TAM, TAM);
        this.imagen = img;
    }
    
    public void paint (Graphics g, Applet a){
        g.drawImage(imagen, x, y, TAM, TAM, a);
    }
    
    public void update(){
        mover();
    }
    
    public void mover(){
        this.y += VELY;
    }
}
