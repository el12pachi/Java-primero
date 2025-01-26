/*
Declaración y manipulación de vectores
 */
package Primera;

public class Ejercicio014 {

    public static void main(String srg[]) {
        int data[] = {17, 30, 40, 50};
        for (int x = 0; x < data.length; x++) {
            System.out.printf("data[%d] = %d \n", x, data[x]);
        }
        //apartado b (modificar el contenido de cada elemento del vector multiplicandolo por 2 y mostrar como queda el vector.
        for (int x = 0; x < data.length; x++) {
            data[x] *= 2;
            System.out.printf("data[%d] = %d \n", x, data[x]);
        }

    }
}
