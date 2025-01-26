//mostrar`por pantalla el nombre del empleado que mas cobrea
//mostrar`por pantalla el nombre del empleado que mas cobrea
package Primera;

public class Ejercicio040 {

    public static void main(String arg[]) {
        int tabla1[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int aux;

        for (int x = 0; x < tabla1.length; x++) {
            aux = tabla1[x][x];
            tabla1[x][x] = tabla1[x][(tabla1[x].length - 1) - x];
            tabla1[x][(tabla1[x].length - 1) - x] = aux;

        }
        for (int x = 0; x < tabla1.length; x++) {
            for (int y = 0; y < tabla1[x].length; y++) {
                System.out.print(tabla1[x][y] + " ");
            }
            System.out.println(" ");
        }
    }
}
