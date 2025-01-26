package Primera;

public class Ejercicio055 {

    public static int[][] multiplicar(int vector[][], int mult[]) {
        int leuros[][] = new int[2][7];
        for (int x = 0; x < vector.length; x++) {
            for (int y = 0; y < vector[x].length; y++) {
                leuros[x][y] = vector[x][y] * mult[x];
            }
        }
        return leuros;

    }

    public static void multiplicar(int vector[][], int mult[], int leuros[][]) {
        for (int x = 0; x < vector.length; x++) {
            for (int y = 0; y < vector[x].length; y++) {
                leuros[x][y] = vector[x][y] * mult[x];
            }
        }

    }

    public static void main(String arg[]) {
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
        int precios[] = {6, 7};
        int eurosKilos[][] = new int[2][7];
        int euros[][] = multiplicar(kilos, precios);
        multiplicar(kilos, precios, eurosKilos);

        Utils.printVector(euros);
    }
}
