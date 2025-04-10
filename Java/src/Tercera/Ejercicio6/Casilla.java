/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio6;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Casilla extends Rectangle {

    public static final int DIM = 60;
    int valor;
    Color color;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    public Casilla(int x, int y, int valor, Color color) {
        super(x, y, DIM, DIM);
        this.valor = valor;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.setFont(new Font("TimesRoman", Font.BOLD, 24));
        g.setColor(Color.WHITE);
        g.drawRect(x, y, width, height);
        g.drawString((valor + ""), x + ((DIM / 2)), y + ((DIM / 2)));
    }
}
