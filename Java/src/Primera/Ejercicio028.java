//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio028 {
    
    public static void main(String arg[]) {
        int data[][] = {{10, 20, -30, -40},
        {50, 60, -70, 80},
        {90, 100, -110, -120}};
        int v1[] = {2, 4, 6};
        
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data[x].length; y++) {
                System.out.printf("%d ", (data[x][y]* v1[x]));
            }
            System.out.println(" ");
        }
    }
}
