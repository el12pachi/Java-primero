//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio033 {

    public static void main(String arg[]) {
        int salas[][] = {{10, 20, 30, 40, 50, 200, 180},
        {50, 60, 70, 80, 80, 300, 198},
        {90, 100, 110, 120, 130, 150, 120},
        {90, 199, 150, 180, 13, 100, 190}};
        String peliculas[] = {"joker", "Soy Nevenka", "Buffalo kids", "Los Destellos "};
        int sum[] = {0, 0, 0, 0};
        int max = 0;
        int min = 0;
        for (int x = 0; x < salas.length; x++) {
            for (int y = 0; y < salas[x].length; y++) {
                sum[x] += salas[x][y];
                if (sum[max] < sum[x]) {
                    max = x;
                }
                if (sum[min] > sum[x]) {
                    max = x;
                }
            }
        }

        
        System.out.printf("La pelicula mas taquillera es %s con %d\n", peliculas[max], sum[max]);
        System.out.printf("La pelicula menos taquillera es %s con %d\n", peliculas[min], sum[min]);

    }
}
