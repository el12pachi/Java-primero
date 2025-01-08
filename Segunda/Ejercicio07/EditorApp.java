package Segunda.Ejercicio07;

import java.awt.Frame;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.io.File;
import java.awt.Event;

public class EditorApp extends Frame {
    MenuBar normal;
    TextArea text;
    File archivo;
    public static void main(String[] args) {
        EditorApp app = new EditorApp();
    }

    public EditorApp() {
        super("Editor de texto");
        
        setup();

        this.pack();
        this.setSize(text.getMinimumSize());
        this.setVisible(true);
    }

    private void setup() {
        setupMenu();
        text = new TextArea(25,50);
        this.add("Center",text);
    }

    private void setupMenu() {
        normal = new MenuBar();
        Menu fileMenu = new Menu("Archivo");
        fileMenu.add(new MenuItem("Nuevo"));
        fileMenu.add(new MenuItem("Abrir"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Guardar"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Salir"));
        normal.add(fileMenu);
        this.setMenuBar(normal);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof MenuItem) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                }
                if (ev.arg.equals("Nuevo")) {
                    text.setText(" ");
                    return true;
                }
            }
        }
        return false;
    }
}
