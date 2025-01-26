package Primera;

public class Ejercicio090 {

    public static int multiplicar(int a, int b) {
        if (b == 1) {
            return a;
        }
        return multiplicar(a, --b) + a;
    }

    public static void main(String arg[]) {
        System.out.println(multiplicar(5, 3));
    }
}
