//mostrar`por pantalla el nombre del alumno que tiene la mejores notas y su media
package Primera;

public class Ejercicio035 {

    public static void main(String arg[]) {
        int notas[][] = {{7, 9, 3, 8}, {10, 9, 9, 8}, {9, 10, 7, 1}, {3, 10, 5, 6}, {8, 5, 4, 5}};
        String alumno[] = {"Javier Maria", "Antonio muñoz", "Javier Vicente", "David", "Agustin"};
        String asignaturas[] = {"Programacion", "Leng.Marcas", "fol", "Ingles"};
        int y;
        float mediaAsig[] = {0, 0, 0, 0};
        float mediAalum[] = {0, 0, 0, 0, 0};
        int max = 0;
        int min = 0;

        for (int x = 0; x < notas.length; x++) {
            for (y = 0; y < notas[x].length; y++) {
                mediAalum[x] += notas[x][y];
                mediaAsig[y] += notas[x][y];

            }
            mediAalum[x] /= notas[x].length;
            if (mediAalum[x] > mediAalum[max]) {
                max = x;

            }
            if (mediAalum[x] < mediAalum[min]) {
                min = x;

            }
        }

        int postAsigMas = 0;
        int postAsigMin = 0;

        for (int x = 0; x < mediaAsig.length; x++) {
            mediaAsig[x] /= notas.length;
            if (mediaAsig[postAsigMas] < mediaAsig[x]) {
                postAsigMas = x;
            }
            if (mediaAsig[postAsigMin] > mediaAsig[x]) {
                postAsigMin = x;
            }
        }
        System.out.printf("El mejor alumno es %s con una media de %.2f\n", alumno[max], mediAalum[max]);
        System.out.printf("El peor alumno es %s con una media de %.2f\n", alumno[min], mediAalum[min]);
        System.out.printf("La peor asignatura es %s con una media de %.2f\n", asignaturas[postAsigMin], mediaAsig[postAsigMin]);
        System.out.printf("La mejor asignatura es %s con una media de %.2f\n", asignaturas[postAsigMas], mediaAsig[postAsigMas]);

        //System.out.printf("La peor pelicula fue %s el dia %s\n", peliculas[min[0]], dias[min[1]]); postAsigMin
    }
}
