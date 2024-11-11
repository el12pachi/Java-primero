package Primera;

public class Ejercicio078 {

    public static void main(String arg[]) {
        String nombres[] = { "Pepe", "Juan", "Maria", "Antonio", "Luis" };

        String aux;
        for (int x = 0; x < nombres.length - 1; x++) {
            for (int y = nombres.length - 1; y >= x; y--) {
                if (nombres[y].compareTo(nombres[x]) < 0) {
                    aux = nombres[y];
                    nombres[y] = nombres[x];
                    nombres[x] = aux;
                }
            }
        }
        for (int y = 0; y < nombres.length; y++) {
            System.out.println(nombres[y]);
        }
    }

}
