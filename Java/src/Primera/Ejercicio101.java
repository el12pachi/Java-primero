package Primera;

public class Ejercicio101 {
    public static void character() {
        char frase[] = { 'h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', ' ', 'q', 'u', 'e', ' ', 't', 'a', 'l', ' ',
                'e', 's', 't', 'a', 'n', ' ', 't', 'o', 'd', 'o', 's', ' ' };
        int inicio = 0;
        int fin = 0;
        boolean contador = true;
        int contadorVocales = 0;
        while (fin < frase.length) {
            contador = false;
            while (frase[fin] != ' ') {
                fin++;
            }
            for (int x = inicio; x < fin; x++) {
                switch (frase[x]) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        contador = true;
                        break;

                    default:
                        break;
                }
            }
            inicio = ++fin;
            if (contador) {
                contadorVocales++;
            }
        }
        System.out.printf("El numero de palabras que tienen vocales es %d \n", contadorVocales);
    }

    public static void string() {
        String frase = "hola mundo que tal estan todos ";
        boolean contador = true;
        int contadorVocales = 0;
        int inicio = 0;
        int fin = frase.indexOf(" ");
        while (fin != -1) {
            contador = false;
            for (int x = inicio; x < fin; x++) {
                switch (frase.charAt(x)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        contador = true;
                        break;

                    default:
                        break;
                }
            }
            inicio = ++fin;
            fin = frase.indexOf(" ", fin);
            if (contador) {
                contadorVocales++;
            }
        }
        System.out.printf("El numero de palabras que tienen vocales es %d \n", contadorVocales);

    }

    public static void main(String[] args) {
        string();
        character();

    }
}