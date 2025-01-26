/*
Multiplicacion mediante sumas 
 */
package Primera;

public class Ejercicio012 {

    static int fact(int x, int z, int res) {
        if ((z + 1) == x) {
            return res;
        } else {
            res *= x;
            x--;
            return fact(x, z, res);
        }

    }

    public static void main(String srg[]) {
        int number1 = 7;
        int number2 = 4;
        int factorial = 1;
        int veces = number1 - number2;

        factorial = fact(number1, veces, factorial);

        for (int x = number1; x > number2; x--) {
            factorial *= x;
        }

        System.out.println(factorial);

    }
}
