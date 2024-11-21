package Primera;

public class Ejercicio094 {

    public static int cuco(int campanadas) {
        if (campanadas == 1) {
            return 1;
        }
        if (campanadas > 12) {
            return cuco(campanadas - 1) + (campanadas - 12);
        }
        return cuco(campanadas - 1) + campanadas;

    }

    public static int camp(int campanadas) {
        int numero = 0;
        for (int i = campanadas; i > 0; i--) {
            if (i == 1) {
                numero += 1;
            } else if (i > 12) {
                numero += (i - 12);
            } else
                numero += i;
        }

        return numero;
    }

    public static void main(String srg[]) {
        int num =13;
        System.out.println(camp(num));
        System.out.println(cuco(num));

    }
}