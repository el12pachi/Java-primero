package Tercera.Ejercicio8;

import java.awt.*;
import java.util.*;

public class Baraja {

    private ArrayList<Carta> cartas;

    public Baraja(Image[] imgs) {
        cartas = new ArrayList<Carta>();
        for (int i = 0; i < Principal.NUMCARTAS; i++) {
            cartas.add(new Carta(imgs[i], (i % Principal.CPP) + 1, ((i / Principal.CPP == 0) || (i / Principal.CPP == 0)) ? Carta.NEGRO : Carta.ROJO, (i / Principal.CPP) + 1));
        }
        Collections.shuffle(cartas);
    }

    public Carta sacarcarta() {
        return cartas.remove(0);
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
