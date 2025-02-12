/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segunda.sinTerminal;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Columna {

    final static int ESPACIO = 75;
    final static int[] RANGO = {20, 125};
    Rectangle rect1, rect2;

    public Columna() {
        int altura = (int) ((Math.random() * (RANGO[1] - RANGO[0])) + RANGO[0]);
        rect1 = new Rectangle(0, 0, 30, altura);
        rect2 = new Rectangle(0, altura + ESPACIO , 30, 300 + ESPACIO - altura);

    }
    
    public void paint(Graphics g){
        g.fillRect(rect1.x, rect1.y, rect1.width, rect1.height);
        g.fillRect(rect2.x, rect2.y, rect2.width, rect2.height);
    }

}
