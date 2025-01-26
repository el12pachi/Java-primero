//mostrar`por pantalla el nombre del alumno que tiene la mejores notas y su media
//mostrar`por pantalla el nombre del alumno que tiene la mejores notas y su media
package Primera;

public class Ejercicio036 {

    public static void main(String arg[]) {
        int notas[][] = {{7, 9, 3, 8}, {10, 9, 9, 8}, {9, 10, 7, 1}, {3, 10, 5, 6}, {8, 5, 4, 5}};
        String alumno[] = {"Javier Maria", "Antonio muñoz", "Javier Vicente", "David", "Agustin"};
        String asignaturas[] = {"Programacion", "Leng.Marcas", "fol", "Ingles"};
        int y;
   

        for (int x = 0; x < notas.length; x++) {
            for (y = 0; y < notas[x].length; y++) {
                if(notas[x][y] == 10){
                     System.out.printf("El alumno %s ha sacado un 10 en %s\n", alumno[x], asignaturas[y]);
                }
            }
          

        }

        

        //System.out.printf("La peor pelicula fue %s el dia %s\n", peliculas[min[0]], dias[min[1]]); postAsigMin
    }
}
