// mostrar por panttalla mayor y menor.

package Primera;

public class Ejercicio016 {

    public static void main(String srg[]) {
        int data[] = { -17, -33, -4, -95, -170 };
        int mayor = 0;
        int menor = 0;
        for (int x = 0; x < data.length; x++) {
            if(data[mayor] < data[x]){
                mayor = x;
            }
            if(data[menor] > data[x]){
                menor = x;
            }
        }
        System.out.printf("El numero mas grandes es %d y el indice es %d \n, y el mas pequeño es %d y el indice es %d \n", data[mayor], mayor, data[menor], menor);

    }
}
