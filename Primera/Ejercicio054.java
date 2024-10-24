package Primera;

public class Ejercicio054 {

    public static void multiplicar(int vector[][], int mult[]) {
        
        for (int x = 0; x < vector.length; x++) {
            for (int y = 0; y < vector[x].length; y++) {
                vector[x][y] *= mult[x];
            }
        }

    }

    public static void main(String arg[]) {
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
        int precios[] = {6, 7};
        multiplicar(kilos, precios);
        for (int x = 0; x < kilos.length; x++) {
            for (int y = 0; y < kilos[x].length; y++) {
                System.out.print(kilos[x][y] + " ");
            }
            System.out.println();

        }
    }
}
