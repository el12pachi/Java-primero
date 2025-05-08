package Tercera.Ejercicio8;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

public class Principal extends Applet {

    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    public static final int NUM_PALOS = 4;
    Image imagen; // Imagen del tablero
    Graphics noseve; // Gráficos para la imagen
    Image imagenes[]; // Imágenes de las fichas
    Image reverso; // Imagen del reverso de las fichas
    Baraja baraja;
    MazoSecundario mazoSecundario;
    Rectangle rectangulo;
    Carta activa;
    MazoPalo mazoPalos[];
    MazoJuego mazoJuegos[];
    boolean secunadario;

    public void init() {
        imagen = this.createImage(700, 800); // Crea una imagen para el tablero
        noseve = imagen.getGraphics(); // Obtiene los gráficos de la imagen
        String palos[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
        imagenes = new Image[NUMCARTAS];
        for (int i = 0; i < NUMCARTAS; i++) {
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio8/Cartas/" + ((i % CPP) + 1) + palos[i / CPP]);
        }
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio8/Cartas/reverso.png");
        rectangulo = new Rectangle(20, 20, Carta.ANCHURA, Carta.ALTURA);
        baraja = new Baraja(imagenes);
        mazoSecundario = new MazoSecundario();
        mazoPalos = new MazoPalo[NUM_PALOS];
        for (int i = 0; i < NUM_PALOS; i++) {
            mazoPalos[i] = new MazoPalo((i * (Carta.ANCHURA + 25) + 250));
        }
        mazoJuegos = new MazoJuego[7];

        for (int i = 0; i < mazoJuegos.length; i++) {
            mazoJuegos[i] = new MazoJuego((i * (Carta.ANCHURA + 25) + 25));
            for (int x = 0; x < (i + 1); x++) {
                mazoJuegos[i].anadirPrincipio(baraja.sacarcarta(), x * 25);
            }
        }
        this.setSize(700, 800);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.green.darker());
        noseve.fillRect(0, 0, 7000, 8000);
        noseve.drawImage(reverso, 20, 20, Carta.ANCHURA, Carta.ALTURA, this);
        for (MazoPalo i : mazoPalos) {
            i.paint(noseve, this);
        }

        for (MazoJuego i : mazoJuegos) {
            i.paint(noseve, this);
        }

        mazoSecundario.paint(noseve, this);
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);

    }

    public boolean mouseDown(Event e, int x, int y) {
        if (rectangulo.contains(x, y)) {
            if (!baraja.getCartas().isEmpty()) {
                mazoSecundario.anadir(baraja.sacarcarta());
                mazoSecundario.recolocar();
            } else {
                baraja.setCartas(mazoSecundario.getCartas());
                mazoSecundario.setCartas(new ArrayList<Carta>());
                mazoSecundario.anadir(baraja.sacarcarta());
            }
        }
        for (MazoJuego i : mazoJuegos) {
            Carta carta = i.extraer();
            if (carta != null && carta.contains(x, y)) {
                activa = carta;
                secunadario = false;
            }
        }

        Carta cartaSecundaria = mazoSecundario.extraer();
        if (cartaSecundaria != null && cartaSecundaria.contains(x, y)) {
            activa = cartaSecundaria;
            secunadario = true;
        }

        repaint();
        return true;
    }

    public boolean mouseDrag(Event e, int x, int y) {
        if (activa != null) {
            activa.setPosition(x - (Carta.ANCHURA / 2), y - (Carta.ANCHURA / 2));
            repaint();
        }
        return true;
    }

    public boolean mouseUp(Event e, int x, int y) {
        if (activa != null) {
            for (MazoPalo i : mazoPalos) {
                if (activa.intersects(i)) {
                    if (i.anadir(activa)) {
                        eliminarCartaDeOrigen();
                        break;
                    }
                }
            }
            for (MazoJuego i : mazoJuegos) {
                if (i.getCartas().isEmpty()) {
                    if (activa.intersects(i)) {
                        i.anadir(activa);
                        eliminarCartaDeOrigen();
                        break;
                    }
                } else if (activa.intersects(i.extraer())) {
                    if (i.anadir(activa)) {
                        eliminarCartaDeOrigen();
                        break;
                    }
                }
                i.recolocar();
            }
            if (!mazoSecundario.getCartas().isEmpty()) {
                mazoSecundario.recolocar();
            }

            activa = null;
        }
        repaint();
        return true;
    }

    private void eliminarCartaDeOrigen() {
        if (secunadario) {
            mazoSecundario.eliminar();
        } else {
            for (MazoJuego j : mazoJuegos) {
                if (j.getCartas().contains(activa)) {
                    j.eliminar();
                    break;
                }
            }
        }
    }

}
