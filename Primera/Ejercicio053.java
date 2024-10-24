package Primera;

public class Ejercicio053 {

    public static void modificar(int vector[], int mult) {
        for (int x = 0; x < vector.length; x++) {
            vector[x] *= mult;
        }

    }

    public static void main(String arg[]) {
        int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int multiplicador = 4;
        for (int x = 0; x < tabla.length; x++) {
            modificar(tabla[x], multiplicador);
        }

        for (int x = 0; x < tabla.length; x++) {
            for (int y = 0; y < tabla[x].length; y++) {
                System.out.print(tabla[x][y] + " ");
            }
            System.out.println();

        }
    }
}
