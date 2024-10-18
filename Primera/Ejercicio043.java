//ordenar ordenacion directa
package Primera;

public class Ejercicio043 {

    public static void main(String arg[]) {
        int lista[] = {25, 2, 73, 85, 16, 4, 33};
        int aux, min;
        
        for (int x = 0; x < lista.length - 1; x++) {
            min = x;
            for (int y = lista.length - 1; y >= x; y--) {
                if (lista[y] < lista[min]) {
                    min = y;
                }
            }

            aux = lista[min];
            lista[min] = lista[x];
            lista[x] = aux;

        }
        for (int y = 0; y < lista.length; y++) {
            System.out.println(lista[y]);

        }

    }
}
