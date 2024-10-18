//Implementar una funcion que devuelva el valor max
package Primera;

public class Ejercicio046 {

    public int max(int v1[]) {
        int maxNum = 0;
        for (int x = 1; x < v1.length; x++) {
            if (v1[x] > v1[maxNum]) {
                maxNum = x;
            }
        }
        return v1[maxNum];
    }

    public static void main(String arg[]) {
        Ejercicio046 x = new Ejercicio046();
        int vector[] = {1, 45, 86754, 1245, 123, 543, 654};
        int vector2[] = {10, 45, 54, 5, 12, 43, 64};

        System.out.printf("El maximo del primer vector es %d\n", x.max(vector));
        System.out.printf("El maximo del segundo vector es %d\n", x.max(vector2));

    }
}
