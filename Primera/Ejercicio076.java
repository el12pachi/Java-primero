package Primera;

//modificar una subcadena por otra
public class Ejercicio076 {

    public static void main(String arg[]) {
        char frase1[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ',
                'M', 'a', 'n', 'c', 'h', 'a', ' ' };
        for (int x = 0; x < frase1.length; x++) {
            switch (frase1[x]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    frase1[x] = Character.toUpperCase(frase1[x]);
                    break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    frase1[x] = Character.toLowerCase(frase1[x]);
                    break;
                default:
                    frase1[x] = '-';
                    break;
            }
        }

        System.out.println(frase1);
    }

}
