package Tercera.Ejercicio6;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Ficha extends Rectangle {

    public static final int DIM = 60;
    private int valor;
    Image imagen;
    java.util.ArrayList<Integer> numerosApostados;

    public Ficha(int posX, int posY, int v, Image img) {
        super(posX, posY, DIM, DIM);
        imagen = img;
        valor = v;
        numerosApostados = new java.util.ArrayList<Integer>();
    }

    public void paint(Graphics g, Applet ap) {
        g.drawImage(imagen, x, y, width, height, ap);
    }

    public void update(int posX, int posY) {
        x = posX - (DIM / 2);
        y = posY - (DIM / 2);
    }

    public int getValor() {
        return valor;
    }

    
    
    public void cargarApostados(Casilla casillas[][]) {
        numerosApostados.clear(); //vacia la lista antes de volverla a cargar
        for(int i = 0; i < casillas.length; i++){
            for(int j = 0; j < casillas[i].length; j++){
                if(casillas[i][j].intersects(this)){
                    numerosApostados.add(new Integer(casillas[i][j].getValor()));
                }
            }
        }
    }

}