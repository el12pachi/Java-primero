/*
Multiplicacion mediante restas 
 */
package Primera;

public class Ejercicio013 {

    public static void main(String srg[]) {
        int number1 = 20;
        int number2 = 7;
        int result = 0;
        int resto = 0;
        for (int x = number1; x > 0; x -= number2) {
            if ((x - number2) < 0) {
                resto = number1 - (number2 * result);
            } else {
                result++;
            }

        }
        System.out.println(result + " y de resto " + resto);
    }
}
