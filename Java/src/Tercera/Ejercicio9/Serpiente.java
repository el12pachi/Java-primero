package Tercera.Ejercicio9;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Serpiente {

    ArrayList<Eslabon> eslabones;
    Image img;

    public Serpiente(Image img) {
        eslabones = new ArrayList<Eslabon>();
        for (int i = 0; i < 10; i++) {
            eslabones.add(new Eslabon(img, 200 - (Eslabon.TAM * i), 100, Eslabon.DERECHA));
        }
        this.img = img;
    }

    public void paint(Graphics g, Applet a) {
        for (Eslabon eslabon : eslabones) {
            eslabon.paint(g, a);
        }
    }

    public void add() {
        switch (ultimo().getDireccion()) {
            case Eslabon.ARRIBA:
                eslabones.add(new Eslabon(img, ultimo().x, ultimo().y+ Eslabon.TAM, ultimo().getDireccion()));
                break;
            case Eslabon.ABAJO:
                eslabones.add(new Eslabon(img, ultimo().x, ultimo().y -Eslabon.TAM, ultimo().getDireccion()));
                break;
            case Eslabon.DERECHA:
                eslabones.add(new Eslabon(img, ultimo().x -Eslabon.TAM, ultimo().y, ultimo().getDireccion()));
                break;
            case Eslabon.IZQUIERDA:
                eslabones.add(new Eslabon(img, ultimo().x +Eslabon.TAM, ultimo().y, ultimo().getDireccion()));
                break;
        }
    }

    public Eslabon ultimo() {
        return eslabones.get(eslabones.size() - 1);
    }

    public Eslabon primero() {
        return eslabones.get(0);
    }

    public void cambiarDireccion(int nuevaDireccion) {
        primero().setDireccion(nuevaDireccion);
    }

    public void update() {

        for (Eslabon eslabon : eslabones) {
            eslabon.update();
        }
        for (int i = eslabones.size() - 1; i > 0; i--) {
            eslabones.get(i).setDireccion(eslabones.get(i - 1).getDireccion());
        }
    }
}
