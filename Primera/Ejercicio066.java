package Primera;

public class Ejercicio066 {

    public static void main(String arg[]) {
        char frase[] = { 'E', 'n', 'a', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
                'a', 'n', 'c', 'h', 'a', ' ' };
        int inicio = 0;
        char last, cambio = ' ';

        for (int x = 0; x < frase.length; x++) {

            if (frase[x] == ' ') {
                last = frase[(x - inicio)];
                for (int y = (x - inicio); y < 0; y--) {
                    cambio = frase[(inicio +y)];
                    frase[(inicio +y)] = frase[(inicio +y -1)];
                    frase[(inicio +y -1)] = cambio;
                }
                frase[inicio] = last;
                inicio = x + 1;

            }

        }
        System.out.println(frase);
    }
}
