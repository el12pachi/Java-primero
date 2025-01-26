package Primera;

public class Ejercicio092 {

    public static void fact(int a) {
        if (a > 0) {
            System.out.println(a);
            fact(a -1);
            System.out.println(a);

        }
    }

    public static void main(String srg[]) {
        fact(5);

    }
}