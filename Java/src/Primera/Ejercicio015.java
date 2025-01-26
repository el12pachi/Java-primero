/*
//mostrar por pantalla el elemento mayor del vector
 */
package Primera;

public class Ejercicio015 {

    public static void main(String srg[]) {
        int data[] = { -17, -33, -4, -95, -170 };
        int index = 0;
        for (int x = 0; x < data.length; x++) {
            if(data[index] < data[x]){
                index = x;
            }
        }
        System.out.printf("El numero mas grandes es %d y el indice es %d \n", data[index], index);

    }
}
