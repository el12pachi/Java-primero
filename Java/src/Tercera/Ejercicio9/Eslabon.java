package Tercera.Ejercicio9;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Eslabon extends Rectangle {

    public static final int TAM = 15;
    public static final int IZQUIERDA = Event.LEFT;
    public static final int DERECHA = Event.RIGHT;
    public static final int ARRIBA = Event.UP;
    public static final int ABAJO = Event.DOWN;
    private int direccion;
    private Image imagen;

    public Eslabon(Image imagen, int x, int y, int direccion) {
        super(x, y, TAM, TAM);
        this.direccion = direccion;
        this.imagen = imagen;
    }

    public int getDireccion() {
        return direccion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, x, y, width, height, a);
    }

    public void update() {
        switch (direccion) {
            case ARRIBA:
                y -= TAM;
                break;
            case ABAJO:
                y += TAM;
                break;
            case DERECHA:
                x += TAM;
                break;
            case IZQUIERDA:
                x -= TAM;
                break;
        }
    }

}
