/*
Multiplicacion mediante sumas 
 */
package Primera;

public class Ejercicio011 {

    public static void main(String srg[]) {
        int number1 = (int) Math.floor(Math.random()*10+1);
        int number2 = (int) Math.floor(Math.random()*10+1);
        int result = 0;
        for (int x = 0 ; x < number1; x++) {
            result += number2;
        }
        System.out.println("El resultado de " + number1 + " * " + number2 + " es " + result);

    }
}
