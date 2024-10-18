//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio030 {

    public static void main(String arg[]) {
        int kilos[][] = {{10, 20, 30, 40, 50},
        {50, 60, 70, 80, 80},
        {90, 100, 110, 120, 130}};
        String productos[] = {"Naranjas", "Manzanas", "Peras"};
        int total;
        for (int x = 0; x < productos.length; x++) {
            total = 0;
            for (int y = 0; y < kilos[x].length; y++) {
                total += kilos[x][y];
            }
            System.out.printf("Se han vendido %d kilos de %s\n", total, productos[x]);
        }
    }
}
