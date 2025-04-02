/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ficha extends Rectangle {

    public static final int DIM = 30;

    public Ficha(int x, int y) {
        super(x, y, DIM, DIM);
    }

    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, width, height);
    }
      public void mover(int posx, int posy) {
      
        x = posx - (DIM / 2);
        y = posy - (DIM / 2);

    }
}
