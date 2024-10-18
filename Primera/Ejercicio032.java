//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio032 {

    public static void main(String arg[]) {
        int salas[][] = {{10, 20, 30, 40, 50, 200, 180},
        {50, 60, 70, 80, 80, 300, 198},
        {90, 100, 110, 120, 130, 150, 120}};
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int sum[] = {0, 0, 0, 0, 0, 0, 0};
        int max = 0;
        int min = 0;
        for (int x = 0; x < salas.length; x++) {
            for (int y = 0; y < salas[x].length; y++) {
                sum[y] += salas[x][y];
                if (sum[max] < sum[y]) {
                    max = y;
                }
                if (sum[min] > sum[y]) {
                    max = y;
                }
            }
        }

        
        System.out.printf("El mayor dia es %s con %d\n", dias[max], sum[max]);
        System.out.printf("El menor dia es %s con %d\n", dias[min], sum[min]);

    }
}
