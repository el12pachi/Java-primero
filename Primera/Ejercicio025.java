//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio025 {

    public static void main(String arg[]) {
        
      
        for (int y = 1; y <= 10; y++) {
            System.out.printf("--------Tabla del %d----------\n", y);
            for (int x = 1; x <= 10 ; x++) {
                System.out.printf("%d*%d=%d\n", y,x,(y*x));
            }
           
        }
 
    }
}
