//ordenar mediate burbuja
package Primera;

public class Ejercicio042 {

    public static void main(String arg[]) {
        int lista[] = {25, 2, 73, 85, 16, 4, 33};
        int aux;

        for (int x = 0; x < lista.length - 1; x++) {
            for (int y = lista.length - 1; y >= x; y--) {
                if (lista[y] < lista[x]) {
                    aux = lista[y];
                    lista[y] = lista[x];
                    lista[x] = aux;
                }
            }
            

        }

        for (int y = 0; y < lista.length; y++) {
            System.out.println(lista[y]);

        }

    }
}

