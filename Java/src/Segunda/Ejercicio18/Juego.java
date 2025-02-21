/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segunda.Ejercicio18;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable {

    int contador = 1000;
    int tiempo = 1000;
    Thread animacion;
    Image imagen;
    Graphics noseve;

    public void init() {
        imagen = this.createImage(400, 400);
        noseve = imagen.getGraphics();

        this.setSize(400, 400);

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.GREEN);
        noseve.fillRect(0, 0, 400, 400);
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 75, 400, 250);
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 185, 400, 30);
        
        
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {

            repaint();

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }
        } while (true);

    }

    public boolean keyDown(Event ev, int tecla) {
        if (tecla == 32) {
            //pj.saltar();
        }

        return true;
    }
}
