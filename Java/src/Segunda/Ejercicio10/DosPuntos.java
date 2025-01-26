package Segunda.Ejercicio10;

import java.awt.Graphics;

public class DosPuntos {
    public static final int LINEA = 0;
    public static final int OVALO = 1;
    public static final int RECTANGULO = 2;
    int incioX, incioY, finX, finY;
    int tipo;

    public DosPuntos(int incioX, int incioY, int finX, int finY, int tipo) {
        this.incioX = incioX;
        this.incioY = incioY;
        this.finX = finX;
        this.finY = finY;
        this.tipo = tipo;
    }

    public DosPuntos(int incioX, int incioY, int tipo) {
        this(incioX, incioY, incioX, incioY, tipo);
    }

    public DosPuntos() {
        this(0, 0, LINEA);
    }

    public void dibujar(Graphics g) {
        switch (tipo) {
            case LINEA:
                g.drawLine(incioX, incioY, finX, finY);
                break;
            case OVALO:
                g.drawOval(incioX, incioY, (finX - incioX), (finY - incioY));
                break;
            case RECTANGULO:
                g.drawRect(incioX, incioY, (finX - incioX), (finY - incioY));
                break;
            default:
                break;
        }

    }
}
