package Tercera.Examen2024;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Corredor extends Rectangle{
    public static final int ALTURA = 100;
    public static final int ANCHURA = 50;
    public static final int VELX = 10;
    public boolean muerte = false;
    Image imagen;
    Image imagenMuerte;
    
    public Corredor(Image img, int PosX, int PosY, Image img2){
        super(PosX, PosY, ANCHURA, ALTURA);
        this.imagen = img;
        this.imagenMuerte = img2;
    }
    
    public void paint (Graphics g, Applet a){
        g.drawImage(imagen, x, y, ANCHURA, ALTURA, a);
    }
    
    public void update(ArrayList<Granada> g){
        for(Granada granada:g){
            if(granada.intersects(this)){
                muerte = true;
                imagen = imagenMuerte;
                morir();
            }
        }
    }
    
    public void mover(int t){
        switch(t){
            case 1006:
                this.x -= VELX;
                break;
            case 1007:
                this.x += VELX;
                break;
        }
    }
    
    public void morir(){
        if(muerte && this.y <= Espacio.ALTURA - ALTURA/2){
            this.y += VELX;
        }else{
            Espacio.activo = false;
        }
    }
}
