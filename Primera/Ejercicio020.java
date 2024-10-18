//Todos los elementos a la izquierda una posicion y el primero pasará al final. 20, 30, 40, 50, 10.
package Primera;

public class Ejercicio020 {

    public static void main(String srg[]) {
        int datos[] = {10, 20, 30, 40, 50};
        int aux = datos[0];
        for (int x = 0; x < datos.length - 1; x++) {
            datos[x] = datos[x + 1];
        }
        datos[datos.length - 1] = aux;
        for (int x = 0; x < datos.length; x++ ){
            System.out.println(datos[x]);
        }
    }

}
