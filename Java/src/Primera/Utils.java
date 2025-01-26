/*
Multiplicacion mediante sumas 
 */
package Primera;

public class Utils {

    public static void printVector(int vector[][]) {
        for (int x = 0; x < vector.length; x++) {
            for (int y = 0; y < vector[x].length; y++) {
                System.out.print(vector[x][y] + " ");
            }
            System.out.println();

        }
    }

    public static void printVector(int vector[], boolean ln) {
        for (int x = 0; x < vector.length; x++) {
            System.out.print(vector[x] + " ");
            if (ln) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void printVector(int vector[]) {
        for (int x = 0; x < vector.length; x++) {
            System.out.print(vector[x] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String srg[]) {

    }

}
