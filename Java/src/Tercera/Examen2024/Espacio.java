/*
 1. Tendremos 10 naves que se irán moviendo de izquierda a derecha con velocidad constante
 y rebotando por la parte superior del Applet. (1 punto)
 2. Lasnaves irán lanzando granadas cada cierto tiempo, el tiempo será aleatorio, podrán
 lanzar una granada el 1% de las veces. Una nave puede lanzar muchas granadas, las
 granadas nos desaparecen de la lista. (3 puntos)
 3. Enlaparte inferior habrá un corredor, que se desplazará a derecha e izquierda con las
 teclas de flecha. Cuando pulses una de estas teclas el corredor dará la impresión de que
 está corriendo, para ello tienes los sprites de imágenes que te paso. (3 puntos)
 4. Sialguna de las granadas, que caen en sentido vertical, intersecta con el corredor, este
 caerá al suelo poco a poco, para eso disponéis de ese otro Sprite de “dead”. (2 puntos)
 5. Laclase ejecutable, su estructura, la carga de imágenes y demás (1 punto)
 */
package Tercera.Examen2024;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

public class Espacio extends Applet implements Runnable{
    public static final int TIEMPO = 16;
    public static final int ANCHURA = 1000;
    public static final int ALTURA = 1000;
    public static boolean activo = true;
    Corredor personaje;
    Nave naves[];
    ArrayList<Granada> granadas;
    
    Graphics noseve;
    Image imagen;
    Image imgCorredor;
    Image imgCorredorMuerto;
    Image[] imgNaves;
    Image imgGranada;
    
    Thread animacion;
    
    public void init(){
        imagen = this.createImage(ANCHURA, ALTURA);
        noseve = imagen.getGraphics();
        
        imgCorredor = getImage(getCodeBase(), "Tercera/Examen2024/Sprites/v1.gif");
        imgCorredorMuerto = getImage(getCodeBase(), "Tercera/Examen2024/Sprites/v4.gif");
        imgGranada = getImage(getCodeBase(), "Tercera/Examen2024/Sprites/rueda1.gif");
        imgNaves = new Image[10];
        
        personaje = new Corredor(imgCorredor, 300, 800, imgCorredorMuerto);
        granadas =  new ArrayList<Granada>();
        naves = new Nave[10];
        
        for(int i = 0; i < imgNaves.length; i++){
            imgNaves[i] = getImage(getCodeBase(), "Tercera/Examen2024/Sprites/Naves/ficha" + i + ".png");
            naves[i] = new Nave(imgNaves[i], 80 + 80 * i, 150);
        }
        
        this.setSize(ANCHURA, ALTURA);
    }
    
    public void start(){
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.GRAY);
        noseve.fillRect(0, 0, ANCHURA, ALTURA);
        personaje.paint(noseve, this);
        
        for(Nave nave:naves){
            nave.paint(noseve, this);
        }
        for(Granada granada:granadas){
            granada.paint(noseve, this);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }

    @Override
    public void run() {
        do{
            for(Nave nave:naves){
                nave.update();
            }
            for(Granada granada:granadas){
                granada.update();
            }
            personaje.update(granadas);
            lanzarGranadas();
            repaint();
            try{
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex){}
        }while(activo);
    }
    
    public boolean keyDown(Event ev, int tecla){
        personaje.mover(tecla);
        return true;
    }
    
    public void lanzarGranadas(){
        if (Math.random() <= 0.01) {
            int naveElegida = (int)(Math.random() * naves.length);
            granadas.add(new Granada(imgGranada, naves[naveElegida].x, naves[naveElegida].y));
        }
    }
}
