//ir mostrando el contenido del vector, desplazzando sus elementos hacia la derecha, hasta que los valores queden como al principio.
package Primera;

public class Ejercicio023 {

    public static void main(String arg[]) {
        int datos[] = {10, 20, 30, 40, 50};

        for (int y = 0; y < datos.length; y++) {
            int aux = datos[0];
            for (int x = 0; x < datos.length - 1; x++) {
                datos[x] = datos[x + 1];
                System.out.print(datos[x] + " ");
            }
            datos[datos.length - 1] = aux;
            System.out.println(datos[datos.length - 1]+ " ");
        }

    }
}
