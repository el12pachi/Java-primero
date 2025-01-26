package Primera;

public class Ejercicio051 {

    public static int factorial(int number) {
        int fact = 1;
        for (int x = number; x > 1; x--) {
            fact *= x;
        }
        return fact;
    }

    public static void main(String arg[]) {
        int a = 5;
        int b = 2;
        System.out.println(factorial(a)/(factorial(a-b)*factorial(b)));
    }
}
