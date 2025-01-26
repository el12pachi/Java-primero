//cambiar orden de los valores del vector
package Primera;

public class Ejercicio017 {

    public static void main(String srg[]) {
        int data[] = {10, 20, 30, 40, 50};
        int aux;

        for (int x = 0; x < (data.length / 2); x++) {
            aux = data[x];
            data[x] = data[data.length - x - 1];
            data[data.length - x - 1] = aux;
        }
        for (int x = 0; x < data.length; x++) {
            System.out.printf("data[%d] = %d \n", x, data[x]);
        }

    }
}
