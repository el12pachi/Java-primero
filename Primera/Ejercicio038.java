//mostrar`por pantalla el nombre del empleado que mas cobrea
//mostrar`por pantalla el nombre del empleado que mas cobrea
package Primera;

public class Ejercicio038 {

    public static void main(String arg[]) {
        int tabla1[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
        int tabla2[][] = new int[4][4];

        for (int x = 0; x < tabla1.length; x++) {
            for (int y = 0; y < tabla1[x].length; y++) {
                tabla2[x][y] = tabla1[y][x];
            }
        }
        for (int x = 0; x < tabla2.length; x++) {
            for (int y = 0; y < tabla2[x].length; y++) {
                System.out.print(tabla2[x][y] + " ");
            }
            System.out.println( " ");
        }
    }
}
