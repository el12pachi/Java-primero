package Primera;

public class Ejercicio058 {

    public static int contarPalabras(char[] frase) {
        int palabras = 1;

        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == ' ') {
                palabras++;
            }
        }

        return palabras;
    }

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};

        System.out.println(contarPalabras(frase));
    }

}
