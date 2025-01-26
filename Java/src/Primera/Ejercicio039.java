//mostrar`por pantalla el nombre del empleado que mas cobrea
//mostrar`por pantalla el nombre del empleado que mas cobrea
package Primera;

public class Ejercicio039 {

    public static void main(String arg[]) {
        int tabla1[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
        int aux = 1;
      /*  int tabla1[][] = new int [5][5];
        
        for (int x = 0; x < 5; x++) {
            for (int y = x; y < 5; y++) {
                tabla1[x][y] = (x+1)*(y+1);
               
            }

        }*/
        
        for (int x = 0; x < tabla1.length; x++) {
            for (int y = x; y < tabla1[x].length; y++) {
                aux = tabla1[x][y];
                tabla1[x][y] = tabla1[y][x];
                tabla1[y][x] = aux;
            }

        }
        for (int x = 0; x < tabla1.length; x++) {
            for (int y = 0; y < tabla1[x].length; y++) {
                System.out.print(tabla1[x][y] + " ");
            }
            System.out.println(" ");
        }
    }
}
