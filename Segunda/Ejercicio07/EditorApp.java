package Segunda.Ejercicio07;

import java.awt.Frame;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Event;
import java.awt.FileDialog;

public class EditorApp extends Frame {
    MenuBar normal;
    TextArea text;
    File archivo;
    FileDialog abrirFichero, guardarFichero;

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
        text = new TextArea(25, 50);
        this.add("Center", text);
        abrirFichero = new FileDialog(this, "Abrir fichero", FileDialog.LOAD);
        guardarFichero = new FileDialog(this, "Abrir fichero", FileDialog.SAVE);
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
                if (ev.arg.equals("Abrir")) {
                    abrirFichero.setVisible(true);
                    String path = abrirFichero.getDirectory() + abrirFichero.getFile();
                    leerFechero(path);
                    return true;
                }
                if (ev.arg.equals("Guardar")) {
                    guardarFichero.setVisible(true);
                    guradar(guardarFichero.getDirectory() + guardarFichero.getFile());
                    return true;
                }
            }
        }
        return false;
    }

    private void leerFechero(String inFile) {
        // DataInputStream inStream;
        BufferedReader inStream;

        try {
            // inStream = new DataInputStream(new FileInputStream(inFile));
            inStream = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));
            String linea;
            String newText = "";
            while ((linea = inStream.readLine()) != null) {
                newText += linea + "\n";
            }
            text.setText(newText);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    private void guradar(String inFile) {
        DataOutputStream a ;
        try{
        a = new DataOutputStream(new FileOutputStream(inFile));
        a.writeBytes(text.getText());
        }catch(FileNotFoundException e){}
        catch (IOException e) {
        }

    }
}
