//Hacer un programa que muestre la media de los valores del vector.
package Primera;

public class Ejercicio019 {

    public static void main(String srg[]) {
        int datos[] = {10, 20, 30, 40, 50};
        int media = 0;
        for (int i = 0; i < datos.length; i++) {
            media += datos[i] / 2;
        }
        System.out.printf("La media es %d\n",media);

    }
}
