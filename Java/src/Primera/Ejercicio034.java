//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio034 {

    public static void main(String arg[]) {
        int salas[][] = {{10, 20, 30, 40, 50, 200, 180},
        {50, 60, 70, 80, 80, 300, 198},
        {90, 100, 110, 120, 130, 150, 120},
        {90, 199, 150, 180, 13, 100, 190}};
        String peliculas[] = {"joker", "Soy Nevenka", "Buffalo kids", "Los Destellos "};
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        int max[] = {0, 0};
        int min[] = {0, 0};
        for (int x = 0; x < salas.length; x++) {
            for (int y = 0; y < salas[x].length; y++) {
                if (salas[max[0]][max[1]] < salas[x][y]) {
                    max[0] = x;
                    max[1] = y;
                }
                if (salas[min[0]][min[1]] > salas[x][y]) {
                    min[0] = x;
                    min[1] = y;
                }
            }
        }

        System.out.printf("La mejor pelicula fue %s el dia %s\n", peliculas[max[0]], dias[max[1]]);
        System.out.printf("La peor pelicula fue %s el dia %s\n", peliculas[min[0]], dias[min[1]]);

    }
}
