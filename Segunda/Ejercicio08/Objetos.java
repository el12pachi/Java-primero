package Segunda.Ejercicio08;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javafx.scene.layout.Pane;

public class Objetos extends Frame {
    TextArea textArea;

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

        textArea = new TextArea(5, 10);
        textArea.setBackground(Color.yellow);
        paneles[0][1].add(textArea);

        paneles[0][2].add(new MiBoton("Borrar", textArea));

        String opciones[] = { "Si", "No", "Quizaz" };
        paneles[1][0].add(new MiChoice(opciones, textArea));

        String deportes[] = { "Futbol", "Baloncesto", "Tenis", "Balonmano" };
        paneles[1][1].add(new MiList(deportes, textArea));

        paneles[1][2].add(new MiCanva());

        String alimentos[] = { "Patatas", "Cebolas", "Tomates", "Lechuga" };
        paneles[2][0].add(new MiCheckBoxGroup(alimentos));

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                principal.add(paneles[x][y]);
            }
        }

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

class MiTextField extends TextField {

    public MiTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    public boolean action(Event ev, Object obj) {
        String texto = this.getText();
        this.setText(texto.toUpperCase());
        return true;
    }
}

class MiBoton extends Button {
    private final TextArea textArea;

    public MiBoton(String text, TextArea textArea) throws HeadlessException {
        super(text);
        this.textArea = textArea;
    }

    public boolean action(Event ev, Object obj) {
        textArea.setText(" ");
        return true;
    }
}

class MiChoice extends Choice {
    TextArea textArea;

    public MiChoice(String opciones[], TextArea textArea) throws HeadlessException {
        super();
        for (String x : opciones) {
            this.add(x);
        }
        this.textArea = textArea;
    }

    public boolean action(Event ev, Object obj) {
        textArea.setText(this.getSelectedItem());
        return true;
    }
}

class MiList extends List {
    TextArea textArea;

    public MiList(String opciones[], TextArea textArea) throws HeadlessException {
        super(opciones.length, true);
        for (String x : opciones) {
            this.add(x);
        }
        this.textArea = textArea;
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.ACTION_EVENT) {
            textArea.setText("asd");
            return true;
        } else if (ev.id == Event.LIST_SELECT) {
            textArea.setText("Elemento Selecionado");
            String[] elemnentos = this.getSelectedItems();
            String text = "";
            for (String x : elemnentos) {
                text += x + "\n";
            }
            textArea.setText(text);
            return true;
        } else if (ev.id == Event.LIST_DESELECT) {
            textArea.setText("Elemento Deselecionado");
            return true;
        }
        return false;
    }
}

class MiCanva extends Canvas {
    int posy = 20;
    int posx = 20;

    public MiCanva() {
        super();
        this.setSize(75, 75);
        this.setBackground(Color.yellow);
        this.setForeground(Color.red);
        this.setVisible(true);
        ;
    }

    public void paint(Graphics g) {
        g.fillRect(posx, posy, 5, 5);
    }
    

}

class MiCheckBoxGroup extends Panel {
    Checkbox checkBoxes[];
    TextField resultado;

    public MiCheckBoxGroup(String elementos[]){
        super();
        this.setLayout(new GridLayout(elementos.length +1,1));
        checkBoxes = new Checkbox[elementos.length];
        for(int x =0 ; x < elementos.length; x++){
            checkBoxes[x] = new Checkbox(elementos[x]);
            this.add(checkBoxes[x]);
        }
        resultado = new TextField("", 15);
        this.add(resultado);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.ACTION_EVENT) {
            String text = "";
            for(Checkbox x:checkBoxes){
                if (x.getState()) {
                    text += x.getLabel() + " ";
                }
            }
            resultado.setText(text);
            return true;
        } 
        return false;
    }
 
}