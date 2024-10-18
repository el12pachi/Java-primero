//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio031 {

    public static void main(String arg[]) {
        int kilos[][] = {{10, 20, 30, 40, 50},
        {50, 60, 70, 80, 80},
        {90, 100, 110, 120, 130}};
        String productos[] = {"Naranjas", "Manzanas", "Peras"};
        double precios[] = {1.5, 2, 0.8};
        double total;
        double ganancias = 0;
        for (int x = 0; x < productos.length; x++) {
            total = 0;
            for (int y = 0; y < kilos[x].length; y++) {
                total += kilos[x][y];
            }
            ganancias += (precios[x] * total);
            System.out.println("He vendido " + (precios[x] * total) + " de euros en " + productos[x]);
        }
        System.out.println("El total es de " + ganancias + "Euros ganados");

    }
}
