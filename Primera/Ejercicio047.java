//Implementar una funcion que reciba una array bidimensional de enteros y devuleva la suma de todos sus elementos
package Primera;

public class Ejercicio047 {

    public static int suma(int v1[][]) {
        int sum = 0;
        for (int x = 0; x < v1.length; x++) {
            for (int y = 0; y < v1[x].length; y++) {
                sum += v1[x][y];
            }
        }
        return sum;
    }

    public static void main(String arg[]) {

        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000,1000}, {1500, 1950, 1880, 1978, 2200, 2100}};

        System.out.printf("La suma de todos los numeros es %d\n", suma(salarios));

    }
}
