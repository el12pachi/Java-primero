package Primera;

public class Ejercicio050 {

    public static void burbuja(int lista[]) {
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
    }

    public static void main(String arg[]) {
        int lista[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        for (int y = 0; y < lista.length; y++) {
            burbuja(lista[y]);
        }
        for (int y = 0; y < lista.length; y++) {
            for (int x = 0; x < lista[y].length; x++) {
                System.out.print(lista[y][x] + " ");
            }
            System.out.println();

        }
    }
}
