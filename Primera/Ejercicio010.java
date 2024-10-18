/*
Numero factorial 
 */
package Primera;

public class Ejercicio010 {

    public static void main(String srg[]) {
        int number = 5;
        int factorial = 1;
        for (int x = 1; x <= number; x++) {
            factorial *= x;
        }
        System.out.println("El factorial de " + number + " es " + factorial);
        factorial = 1 ;
        for (int x = number; x >= 1; x--) {
            factorial *= x;
        }
        System.out.println("El factorial de " + number + " es " + factorial);

    }
}
