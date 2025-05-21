package Tercera.Examen2023;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Game extends Applet implements Runnable {

    public static final int TIEMPO = 100;
    public static final int NUMRUEDA = 5;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    int velocidad = 100;
    Image neumaticos[];
    Image mercedes;
    Image fondo;
    Image pedal1;
    Image pedal2;
    Image luz;
            
    Fondo atras;
    Rueda ruedas[];
    Coche coche;
    Pedal acelerador;
    Pedal freno;
    
    int contador = 0;

    public void init() {
        imagen = this.createImage(600, 300);
        noseve = imagen.getGraphics();

        mercedes = getImage(getCodeBase(), "Tercera/Examen2023/imgsCoche/mercedes.png");
        fondo = getImage(getCodeBase(), "Tercera/Examen2023/imgsCoche/fondo.jpg");
        pedal2 = getImage(getCodeBase(), "Tercera/Examen2023/imgsCoche/pedal2.png");
        pedal1 = getImage(getCodeBase(), "Tercera/Examen2023/imgsCoche/pedal1.png");
        luz = getImage(getCodeBase(), "Tercera/Examen2023/imgsCoche/lightBeam.png");

        neumaticos = new Image[NUMRUEDA];
        for (int i = 0; i < NUMRUEDA; i++) {
            neumaticos[i] = getImage(getCodeBase(), "Tercera/Examen2023/imgsCoche/rueda" + (i + 1) + ".gif");  
        }
        
        acelerador = new Pedal(pedal1,320,150);
        freno = new Pedal(pedal2,400,150);
        
        atras = new Fondo(fondo,this);
        
        coche = new Coche(mercedes,luz);
        
        ruedas= new Rueda[2];
        ruedas[0] = new Rueda(neumaticos,(60));
        ruedas[1] = new Rueda(neumaticos,(205));
        
        
        
        
        this.setSize(600, 300);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    @Override
    public void stop() { 
        if (animacion != null) { 
            animacion.stop(); 
            animacion = null;
        }
    }

    public void gameover() {
        noseve.setColor(Color.red); 
        noseve.drawString("GAME OVER", 350, 400);
        stop();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 600, 300);
       

        atras.paint(noseve);
        
        acelerador.paint(noseve, this);
        freno.paint(noseve, this);
        
        coche.paint(noseve, this);
        
        for(int i = 0;i<ruedas.length;i++)
            ruedas[i].paint(noseve,this);
        
        
        
        g.drawImage(imagen, 0, 0, this);
    }

    public void run() {
        do {
            for(int i = 0;i<ruedas.length;i++){
                ruedas[i].update();
            }
            atras.update();
            
            repaint();

            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {

            }
        } while (true);
    }

    public boolean mouseDown(Event e, int x, int y) {
        Point click;
        click = new Point(x,y);
        if(coche.contains(click)){
            coche.encendida();
        }
        if(freno.contains(click))
            velocidad-=10;
        if(acelerador.contains(click))
            velocidad += 10;
           
        
        
        return false;
    }
}
