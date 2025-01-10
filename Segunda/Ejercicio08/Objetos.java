package Segunda.Ejercicio08;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Objetos extends Frame {

    public static void main(String[] args) {
        Objetos app = new Objetos();
    }

    public Objetos() {
        super("Trabajando con objetos de Java");

        setUp();

        this.pack(); 
        this.setSize(400, 400); 
        this.setVisible(true);

    }

    public void setUp() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(3, 3));

        Panel paneles[][] = new Panel[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                paneles[i][j] = new Panel();
                paneles[i][j].setLayout(new FlowLayout(FlowLayout.LEFT));
            }
        }

        paneles[0][0].add(new Label("Campo de texto:"));
        paneles[0][0].add(new MiTextField("", 15));

        principal.add(paneles[0][0]);
        
        this.add("Center", principal);

    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;

        }

        return false;
    }

}

class MiTextField extends TextField{

    public MiTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }
    public boolean action(Event ev, Object obj){
        String texto = this.getText();
        this.setText(texto.toUpperCase());
        return true;
    }
}