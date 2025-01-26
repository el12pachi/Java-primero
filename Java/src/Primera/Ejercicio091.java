package Primera;

public class Ejercicio091 {

    static int fact(int factorial) {
        if (factorial == 1) {
            return factorial;
        } 
        return fact(--factorial ) * factorial;
    }

    public static void main(String srg[]) {
        int factorial = 5;
        factorial = fact(factorial);
        System.out.println(factorial);

    }
}