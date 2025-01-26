package Segunda.Ejercicio10;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Dibujar extends Frame {
    MiCanvas canvas;

    public static void main(String[] args) {
        new Dibujar();
    }

    public Dibujar() {
        super("Dibujar");

        setUp();

        this.pack(); // Meter dentro del frame
        this.setSize(400, 400); // Pone el tamaño del objeto
        this.setVisible(true);

    }

    public void setUp() {
        setupMenuBar();
        canvas = new MiCanvas(DosPuntos.LINEA);
        this.add(canvas);
    }

    public void setupMenuBar() {
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("Fichero");
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        menuBar.add(menu1);

        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("Linea"));
        menu2.add(new MenuItem("Óvalo"));
        menu2.add(new MenuItem("Rectango"));
        menuBar.add(menu2);

        this.setMenuBar(menuBar);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.target instanceof MenuItem) {
            if (ev.arg.equals("Salir")) {
                System.exit(0);
                return true;
            } else if (ev.arg.equals("Linea")) {
                canvas.setTipo(DosPuntos.LINEA);
                return true;
            } else if (ev.arg.equals("Óvalo")) {
                canvas.setTipo(DosPuntos.OVALO);
                return true;
            } else if (ev.arg.equals("Rectango")) {
                canvas.setTipo(DosPuntos.RECTANGULO);
                return true;
            } else if (ev.arg.equals("Nuevo")) {
                canvas.getGraphics().clearRect(0, 0, 400, 400);
                canvas.getLista().clear();
                return true;
            }
        }

        return false;
    }

}
