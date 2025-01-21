package Segunda.Ejercicio10;

import java.awt.Canvas;
import java.awt.Event;

public class MiCanvas extends Canvas {

    DosPuntos actual;
    private int  tipo;
    public MiCanvas() {
        super();
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


    public boolean mouseDown(Event ev, int x, int y) {
        actual = new DosPuntos(x, y, tipo);
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        actual.finY = y;
        actual.finX = x;
        repaint();
        return true;
    }
}
