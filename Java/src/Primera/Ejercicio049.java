package Primera;

public class Ejercicio049 {

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
        int lista[] = {25, 2, 73, 85, 16, 4, 33};
        burbuja(lista);
        for (int y = 0; y < lista.length; y++) {
            System.out.println(lista[y]);

        }
    }
}
