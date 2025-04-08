package Tercera.Ejercicio6;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Ficha extends Rectangle {

    public static final int DIMENSION = 60;
    int valor;
    Image imagen;
    java.util.ArrayList<Integer> numerosApostados;

    public Ficha(int posX, int posY, int v, Image img) {
        super(posX, posY, DIMENSION, DIMENSION);
        imagen = img;
        valor = v;
        numerosApostados = new java.util.ArrayList<Integer>();
    }

    public void paint(Graphics g, Applet ap) {
        g.drawImage(imagen, x, y, width, height, ap);
    }

    public void update(int posX, int posY) {
        x = posX - (DIMENSION / 2);
        y = posY - (DIMENSION / 2);
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