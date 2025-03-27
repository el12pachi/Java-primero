/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio3;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author el12p
 */
public class Carta {

    public static final int ANCHURA = 100;
    public static final int ALTURA = 150;
    private int posX, posY;
    Image imagen;
    int valor;

    public Carta(Image img, int valor) {
        imagen = img;
        this.valor = valor > 10 ? 10 : valor;
    }

    public void paint(Graphics g, Applet ap) {
        g.drawImage(imagen, posX, posY, ANCHURA, ALTURA, ap);
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}
