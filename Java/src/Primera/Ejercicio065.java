package Primera;

//camino hacia la izquierda y el ultimo caracter se mueve al principio
public class Ejercicio065 {
    public static void derecha(int inicio, char[] frase, int x) {
        char cambio = frase[x - 1];
        for (int y = x - 1; y > inicio; y--) {
            frase[y] = frase[y - 1];
        }
        frase[inicio] = cambio;
    }

    public static void izquierda(int inicio, char[] frase, int x) {
        char cambio = frase[inicio];
        for (int y = inicio; y < x - 1; y++) {
            frase[y] = frase[y + 1];
        }
        frase[x - 1] = cambio;
    }

    public static void main(String arg[]) {
        char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
                'a', 'n', 'c', 'h', 'a', ' ' };
        int inicio = 0;

        for (int x = 0; x < frase.length; x++) {

            if (frase[x] == ' ') {
                derecha(inicio, frase, x);
                izquierda(inicio, frase, x);
                
                inicio = x + 1;

            }

        }
        System.out.println(frase);
    }
}
