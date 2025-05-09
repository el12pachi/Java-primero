package Tercera.Ejercicio9;

import java.awt.Image;
import java.awt.Rectangle;

public class Eslabon extends Rectangle {

    public static final int TAM = 15;
    public static final int IQZQUIERDA = 0;
    public static final int DERECHA = 1;
    public static final int ARRIBA = 2;
    public static final int ABAJO = 3;
    int direccion;
    Image imagen;

    public Eslabon(int direccion, Image imagen, int x, int y) {
        super(x, y, TAM, TAM);
        this.direccion = direccion;
        this.imagen = imagen;
    }

}
