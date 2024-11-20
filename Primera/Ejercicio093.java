package Primera;

public class Ejercicio093 {

    public static int division(int a, int division) {
        if (a < division) {
            return 0;
        }
        return division(a - division, division) +1;

    }

    public static void main(String srg[]) {
        int num = 7;
        int divisor = 2;
        System.out.println(division(num, divisor));

    }
}