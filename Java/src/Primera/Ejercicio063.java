package Primera;

public class Ejercicio063 {

    public static void cambiar(char vector[], char[] sustituto, char sustituir) {

        for (int x = 0; x < vector.length; x++) {

            if (vector[x] == sustituir) {
                for (int z = 0; z < sustituto.length - 1; z++) {
                    for (int y = vector.length - 1; y >= x + 1; y--) {

                        vector[y] = vector[y - 1];
                    }
                    vector[x] = sustituto[z];
                    x++;
                }
                vector[x] = sustituto[sustituto.length - 1];
            }

        }

    }

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituto[] = {'X', 'Y', 'Z'};
        char frase2[] = new char[50];
        for (int x = 0; x < frase.length; x++) {
            frase2[x] = frase[x];
        }

        cambiar(frase2, sustituto, 'u');
        System.out.println(frase2);

    }
}
