package Tercera.Ejercicio3;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;



public class BlackJack extends Applet {

    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    String palos[] = {"clubs","diamonds","hearts","spades"};
    Image imagenes[];  
    Image imagen;
    Graphics noseve;
 
    Rectangle tablero[][];

    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        imagenes = new Image[NUMCARTAS];

        for (int i = 0; i < imagenes.length; i++) {
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio3/Cartas/" + ((i % CPP) +1)+"_of_" + palos[i / CPP] + ".png");
        }
    
        this.setSize(700, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 700, 500);
                noseve.drawImage(imagenes[1], 0, 0, 100,200,this);

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {
      
        return true;
    }

   

}
