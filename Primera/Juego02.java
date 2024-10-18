/*
Multiplicacion mediante sumas 
 */
package Primera;

import java.util.Scanner;

public class Juego02 {

    public static int sum(int x, int y) {
        return x + y;
    }

    static int restar(int x, int y) {
        return x - y;
    }

    static int dividir(int x, int y) {
        return x / y;
    }

    static int multiplicar(int x, int y) {
        return x * y;
    }

    public static void main(String srg[]) {
        int x, y;
        String[] div;
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Diga la operacion: ");
        String simbol = input.next();
        if (simbol.contains("+")) {
            div = simbol.split("\\+");
            result = sum(Integer.parseInt(div[0]), Integer.parseInt(div[1]));
        } else if (simbol.contains("-")) {
            div = simbol.split("\\-");
            result = restar(Integer.parseInt(div[0]), Integer.parseInt(div[1]));
        } else if (simbol.contains("*")) {
            div = simbol.split("\\*");
            result = multiplicar(Integer.parseInt(div[0]), Integer.parseInt(div[1]));
        } else if (simbol.contains("/")) {
            div = simbol.split("\\/");
            result = dividir(Integer.parseInt(div[0]), Integer.parseInt(div[1]));
        }
        System.out.println(result);
    }
}
