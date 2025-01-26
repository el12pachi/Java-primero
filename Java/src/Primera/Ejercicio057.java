package Primera;

public class Ejercicio057 {

    public static void multiplicador(int vector[], int mult) {
        for (int x = 0; x < vector.length; x++) {
            if (vector[x] < 10) {
                vector[x] *= mult;
            }
        }

    }

    public static void main(String arg[]) {
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
        int multiplicar = 5;
        for (int[] x : kilos) {
            multiplicador(x, multiplicar);
        }

        Utils.printVector(kilos);

    }
}
