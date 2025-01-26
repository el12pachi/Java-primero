//mostrar`por pantalla el nombre del empleado que mas cobrea
//mostrar`por pantalla el nombre del empleado que mas cobrea
package Primera;

public class Ejercicio037 {

    public static void main(String arg[]) {
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleado[] = {"Javier Maria", "Antonio muñoz", "Javier Vicente", "David", "Agustin"};
        String mes[] = {"Enero", "Febrero", "marzo", "abril", "mayo", "junio"};
        float mediaAsig[] = {0, 0, 0, 0, 0, 0};
        float mediAalum[] = {0, 0, 0, 0, 0};
        int max = 0;
        int min = 0;
        
        for (int x = 0; x < salarios.length; x++) {
            for (int y = 0; y < salarios[x].length; y++) {
                mediAalum[x] += salarios[x][y];
                mediaAsig[y] += salarios[x][y];

            }
            mediAalum[x] /= salarios[x].length;
            if (mediAalum[x] > mediAalum[max]) {
                max = x;

            }
            if (mediAalum[x] < mediAalum[min]) {
                min = x;

            }
        }

        int mesMax = 0;
        int mesMin = 0;

        for (int x = 0; x < mediaAsig.length; x++) {
            mediaAsig[x] /= salarios.length;
            if (mediaAsig[mesMax] < mediaAsig[x]) {
                mesMax = x;
            }
            if (mediaAsig[mesMin] > mediaAsig[x]) {
                mesMin = x;
            }
        }
        System.out.printf("El trabajdor que mas cobra es %s con una media de %.2f\n", empleado[max], mediAalum[max]);
        System.out.printf("El trabajdor que menos conbra es %s con una media de %.2f\n", empleado[min], mediAalum[min]);
        System.out.printf("El peor mes es %s con una media de %.2f\n", mes[mesMin], mediaAsig[mesMin]);
        System.out.printf("El mejor mes es %s con una media de %.2f\n", mes[mesMax], mediaAsig[mesMax]);

    }
}
