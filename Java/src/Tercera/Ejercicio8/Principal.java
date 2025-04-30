package Tercera.Ejercicio8;

import java.applet.Applet;
import java.awt.*;

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
        this.setSize(700, 800);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.green.darker());
        noseve.fillRect(0, 0, 700, 800);
        noseve.drawImage(reverso, 20, 20, Carta.ANCHURA, Carta.ALTURA, this);
        //oseve.drawImage(baraja.sacarcarta().imagen, 20, 20, Carta.ANCHURA, Carta.ALTURA, this);
        for (MazoPalo i : mazoPalos) {
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
            mazoSecundario.anadir(baraja.sacarcarta());
            mazoSecundario.recolocar();
        }
        if (mazoSecundario.extraer().contains(x, y)) {
            activa = mazoSecundario.extraer();
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
            mazoSecundario.recolocar();
            for (MazoPalo i : mazoPalos) {
                i.anadir(activa);
            }

            activa = null;
        }
        repaint();
        return true;
    }
}
