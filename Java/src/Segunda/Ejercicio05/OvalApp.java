package Segunda.Ejercicio05;

import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Graphics;

public class OvalApp extends Frame {
    Ovalo ovalo ;

    public static void main(String[] args) {
        OvalApp app = new OvalApp();
    }

    public OvalApp() {
        super("Dibujando ovalos");
        ovalo = new Ovalo();


        Button boton1 = new Button("Siguiente");
        Button boton2 = new Button("Salir");

        Panel p1 = new Panel();
        p1.add(boton1);
        p1.add(boton2);

        this.add("South", p1);

        this.pack();
        this.resize(300, 300);
        this.show();
    }

    public void paint(Graphics g) {
        ovalo.dibujar(g);
    }
    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Button) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                }else if (ev.arg.equals("Siguiente")) {
                    ovalo.inicializar();
                    repaint();  
                    return true;
                }
            }
        }
        return false;

    }


}
