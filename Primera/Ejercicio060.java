package Primera;

public class Ejercicio060 {

    public static void mayusculas(char vector[]) {

        for (int x = 0; x < vector.length; x++) {
            vector[x] = Character.toUpperCase(vector[x]);

        }
    }
    

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};

        mayusculas(frase);

        System.out.println(frase);

    }
}
