package Tercera.Ejercicio1;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class DibujoAnimado {
    private Image imagenes[];
    private int actual = 0;
    
    
    public DibujoAnimado(Image imgs[]){
        imagenes = imgs;
    }
    
    public void paint(Graphics g, Applet ap){
        g.drawImage(imagenes[actual], 0, 0, 200, 250, ap);
    }
    
    public void update(){
        actual = (actual + 1) % imagenes.length;
    }

    public Image[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(Image[] imagenes) {
        this.imagenes = imagenes;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    
}