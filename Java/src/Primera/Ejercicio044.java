//ordenar ordenacion parcial
package Primera;

public class Ejercicio044 {

    public static void main(String arg[]) {
        int lista[] = {25, 2, 73, 85, 16, 4, 33};
        int aux, y;
        for (int x = 1; x < lista.length; x++) {
            y = x;
            while (0 != y && lista[y] <= lista[y - 1]) {
                aux = lista[y - 1];
                lista[y - 1] = lista[y];
                lista[y] = aux;
                y--;

            }
        }

        for (int x = 0; x < lista.length; x++) {
            System.out.println(lista[x]);

        }
    }
}
