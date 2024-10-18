//mostrar`por pantalla el nombre del empleado que mas cobrea
//mostrar`por pantalla el nombre del empleado que mas cobrea
package Primera;

public class Ejercicio041 {

    public static void main(String arg[]) {
        int goles[][] = {
            {18, 20, 13, 14, 23},
            {15, 26, 7, 18, 13},
            {19, 10, 11, 22, 30},
            {13, 19, 15, 26, 9}
        };

        String futbolistas[] = {"Halland", "Mbappé", "Grizzman", "Yamal", "Williams"};
        float media;

        for (int x = 0; x < futbolistas.length; x++) {
            media = 0;
            for (int y = 0; y < goles.length; y++) {
                media +=goles[y][x];
            }
            media /= goles.length;
            System.out.printf("El jugador %s ha marcado %.2f goles de media \n", futbolistas[x], media);

        }

    }
}
