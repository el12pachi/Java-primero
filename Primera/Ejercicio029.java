//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio029 {

    private void test() {
        int data[][] = {{10, 20, 30, 40},
        {50, 60, 70, 80},
        {90, 100, 110, 120}};
        int acumFila[] = {0, 0, 0};
        int acumColumnas[] = {0, 0, 0, 0};
        for (int x = 0; x <= data.length; x++) {
            System.out.println();
            if (x == data.length) {
                System.out.println();

                for (int y = 0; y < acumColumnas.length; y++) {
                    System.out.print(acumColumnas[y] + " ");

                }
                break;
            }
            for (int y = 0; y <= data[x].length; y++) {
                if (y == data[x].length) {
                    System.out.print(" = " + acumFila[x]);
                } else {
                    System.out.print(data[x][y] + " ");

                    acumFila[x] += data[x][y];
                    acumColumnas[y] += data[x][y];
                }
            }
        }
    }

    public static void main(String arg[]) {
        int data[][] = {{10, 20, 30, 40},
        {50, 60, 70, 80},
        {90, 100, 110, 120}};
        int acumFila[] = {0, 0, 0};
        int acumColumnas[] = {0, 0, 0, 0};

        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data[x].length; y++) {
                acumFila[x] += data[x][y];
                acumColumnas[y] += data[x][y];
            }
        }

        for (int y = 0; y < acumColumnas.length; y++) {
            System.out.printf("La sumas de la %dº columna es = %d\n", (y + 1), acumColumnas[y]);
        }
        System.out.println();
        for (int y = 0; y < acumFila.length; y++) {
            System.out.printf("La sumas de la %dº fila es = %d\n", (y + 1), acumFila[y]);
        }
        
        Ejercicio029 test = new Ejercicio029();
        test.test();
        
    }
}
