// lo mismo pero hacia la derecha
package Primera;

public class Ejercicio021 {

    public static void main(String srg[]) {
        int datos[] = {10, 20, 30, 40, 50};
        int aux = datos[datos.length - 1];
        for (int x = datos.length - 1; x > 0 ; x--) {
            datos[x] = datos[x - 1];
        }
        datos[0] = aux;
        //datos[datos.length - 1] = aux;
        for (int x = 0; x < datos.length; x++ ){
            System.out.println(datos[x]);
        }
    }

}
