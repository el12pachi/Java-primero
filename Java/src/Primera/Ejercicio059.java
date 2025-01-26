package Primera;

public class Ejercicio059 {

    public static void sustituir(char vector[], char newVector[]) {

        for (int x = 0; x < vector.length; x++) {
            if (vector[x] == ' ') {
                newVector[x] = 'X';
            } else {
                newVector[x] = vector[x];
            }
        }

    }

    public static char[] sustituir(char vector[]) {
        char newVector[] = new char[50];
        for (int x = 0; x < vector.length; x++) {
            if (vector[x] == ' ') {
                newVector[x] = 'X';
            } else {
                newVector[x] = vector[x];
            }
        }
        return newVector;

    }

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char fraseMod[] = new char[50];
        char fraseModV2[] = sustituir(frase);

        sustituir(frase, fraseMod);
        
        System.out.println(fraseModV2);

    }
}
