/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class Ejercicio099 {
    public static void main(String[] args) {
        int notas[][] = {
                { 3, 4, 8, 9 },
                { 4, 5, 7, 10 },
                { 2, 7, 10, 8 },
                { 5, 3, 6, 7 },
                { 4, 2, 5, 8 },
        };
        String asignaturas[] = { "Programación", "Marcas", "Entornos", "Base Datos" };
        String alumnos[] = { "Alumno1", "Alumno2", "Alumno3", "Alumno4", "Alumno5" };
        for (int x = 0; x < notas[0].length; x++) {
            int contador = 0;
            for (int y = 0; y < notas.length; y++) {
                if (notas[y][x] < 5) {
                    contador++;
                }
            }
            System.out.println("En la asignatura " + asignaturas[x] + " han suspendido " + contador);
        }

        float media = 0;
        int contador = 0;
        for (int x = 0; x < notas.length; x++) {
            for (int y = 0; y < notas[0].length; y++) {
                if (notas[x][y] < 5) {
                    media += notas[x][y];
                    contador++;
                }
            }
        }
        media /= contador;
        System.out.println("La media de las notas menores a 5 es: " + media);

        for (int x = 0; x < notas.length; x++) {
            media = 0;
            for (int y = 0; y < notas[0].length; y++) {
                media += notas[x][y];
            }
            media /= notas[0].length;
            if (media > 5) {
                System.out.println("El alumno " + alumnos[x] + " ha sacado una media de " + media);
            }
        }

    }
}