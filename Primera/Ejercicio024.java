//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio024 {

    public static void main(String arg[]) {
        int datos[] = {10, 20, 30, 40, 50};
        int multiplos[] = {3, 5, 7};
      
        for (int y = 0; y < multiplos.length; y++) {
            for (int x = 0; x < datos.length ; x++) {
                System.out.print(datos[x] * multiplos[y] +  " ");
            }
           System.out.println("");
        }
 
    }
}
