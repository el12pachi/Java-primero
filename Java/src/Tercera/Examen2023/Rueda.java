
package Tercera.Examen2023;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class Rueda {
    Image ruedas[];
    int x, y;
    public final int TAM = 43;
    public int indice = 0;
    public int posY = 248;
    public Rueda(Image[] ruedas, int x) {
        this.ruedas = ruedas;
        this.x = x;
        this.y = posY;
    }
    public void update(){
        indice = (indice + 1) % ruedas.length;
    }
    public void paint(Graphics g,Applet a){
        g.drawImage(ruedas[indice], x, posY,TAM,TAM, a);
    }

    public Image[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Image[] ruedas) {
        this.ruedas = ruedas;
    }
    
}
