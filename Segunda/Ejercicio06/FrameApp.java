package Segunda.Ejercicio06;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Event;
import java.awt.Button;

public class FrameApp extends Frame {
    MenuBar normal, alternativo;
    String tituloInicial;

    public static void main(String[] args) {
        FrameApp app = new FrameApp();
    }

    public FrameApp() {
        super("Trabajando con Frames");
        tituloInicial = this.getTitle();
        setup();
        setupMenu();
        this.setSize(400, 400);
        this.setVisible(true);
    }

    private void setup() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(4, 1));
        principal.add(new Label("Cambia las careteristicas de este Frame", Label.CENTER));

        Panel botonera = new Panel();
        botonera.add(new Button("Titulo"));
        botonera.add(new Button("MenuBar"));
        botonera.add(new Button("Resizable"));
        principal.add(botonera);

        principal.add(new Label("Salidas en la ventana", Label.CENTER));

        Panel abajo = new Panel();
        abajo.add(new Button("Cursor"));
        abajo.add(new Button("Background"));
        abajo.add(new Button("Foreground"));
        abajo.add(new Button("Font"));
        principal.add(abajo);

        this.add("South", principal);
    }

    private void setupMenu() {
        normal = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("Exit"));
        normal.add(fileMenu);
        this.setMenuBar(normal);

        alternativo = new MenuBar();
        Menu archivoMenu = new Menu("Archivo");
        archivoMenu.add(new MenuItem("Salir"));
        alternativo.add(archivoMenu);

    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.target instanceof Button) {
            if (ev.arg.equals("Titulo")) {
                if (this.getTitle().equals(tituloInicial)) {
                    this.setTitle("Titulo cambiado");
                } else {
                    this.setTitle(tituloInicial);
                }
                return true;
            }
            if (ev.arg.equals("MenuBar")) {
                if (this.getMenuBar() == normal) {
                    this.setMenuBar(alternativo);
                } else {
                    this.setMenuBar(normal);
                }
            }

        }
        return false;
    }
}
