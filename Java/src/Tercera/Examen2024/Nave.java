package Tercera.Examen2024;

import static Tercera.Examen2024.Corredor.VELX;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Nave extends Rectangle{
    public static final int TAM = 50;
    public static final int VELX = 10;
    boolean direccion = true;
    Image imagen;
    
    public Nave(Image img, int PosX, int PosY){
        super(PosX, PosY, TAM, TAM);
        this.imagen = img;
    }
    
    public void paint (Graphics g, Applet a){
        g.drawImage(imagen, x, y, TAM, TAM, a);
    }
    
    public void update(){
        mover();
        if(this.x >= Espacio.ANCHURA - TAM){
            direccion = false;
        }else if(this.x <= TAM){
            direccion = true;
        }
    }
    
    public void mover(){
        if(direccion){
            this.x += VELX;
        }else{
           this.x -= VELX; 
        }
    }
}
