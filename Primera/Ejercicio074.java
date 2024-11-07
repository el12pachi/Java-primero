package Primera;

//modificar una subcadena por otra
public class Ejercicio074 {

    public static void main(String arg[]) {
        char frase1[] = { 'e', 'e','n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ',
                'M', 'a', 'n', 'c', 'h', 'a' };
        char subcadena[] = { 'e','n', ' ' };
        for (int x = 0, aux = 0; x < (frase1.length - subcadena.length +1); x++, aux = 0) {
            if (frase1[x] == subcadena[0]) {
                while (aux < subcadena.length && subcadena[aux] == frase1[x + aux]) {
                    aux++;
                }
                if (aux == subcadena.length) {
                    for (char w:subcadena) {
                        for (int y = x; y < frase1.length - 1; y++) {
                            frase1[y] = frase1[y + 1];
                        }
                        frase1[frase1.length-1]=' ';

                    }
                }

            }
        }

        System.out.println(frase1);
    }

}
