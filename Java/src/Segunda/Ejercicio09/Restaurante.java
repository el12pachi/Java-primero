package Segunda.Ejercicio09;

import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

public class Restaurante extends Frame {

    static String comidas[] = { "Desayuno", "Almuerzo", "Cena" };
    String platos[][] = {
            { "Café", "Leche", "Tostadas", "Aire" },
            { "Paella", "Sopa", "Macarrones", "Cachopo" },
            { "Tortilla", "Sopa", "Arroz 534 delicias", "Kebab" },
    };
    static Choice chComida;
    List[] listaPlatos;
    static List presentar;
    static TextField texto;

    public static void main(String[] args) {
        Restaurante app = new Restaurante();
    }

    public Restaurante() {
        super("Restaurante Salesianos");

        setUp();

        this.pack(); // Meter dentro del frame
        this.setSize(275, 175); // Pone el tamaño del objeto
        this.setVisible(true);

    }

    public void setUp() {
        this.add("North", new Label("Elige tu comida", Label.CENTER));
        chComida = new Choice();
        for (String x : comidas) {
            chComida.add(x);
        }
        this.add("West", chComida);
        listaPlatos = new List[comidas.length];

        for (int x = 0; x < comidas.length; x++) {
            listaPlatos[x] = new List(5, true);
        }
        for (int x = 0; x < comidas.length; x++) {
            for (int y = 0; y < platos[x].length; y++) {
                listaPlatos[x].add(platos[x][y]);
                ;
            }
        }
        presentar = listaPlatos[0];
        this.add("East", presentar);
        texto = new TextField("", 40);
        this.add("South", texto);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;

        }
        if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Choice) {
                this.remove(presentar);
                presentar = listaPlatos[chComida.getSelectedIndex()];
                this.add("East", presentar);
                this.setVisible(true);
                texto.setText(comidas[chComida.getSelectedIndex()] + ":");
                return true;
            }
        }
        if (ev.id == Event.LIST_SELECT || ev.id == Event.LIST_DESELECT) {
            updateList();
            return false;
        }

        return false;
    }
    public static void updateList(){
        String txt = comidas[chComida.getSelectedIndex()] + ": ";
        for(String x:presentar.getSelectedItems()){
            txt += x + " "; 
        }
        texto.setText(txt);
    }

}
