package Primera;

public class Ejercicio061 {

    public static void cambiar(char vector[], char sustituto, char sustituir) {

        for (int x = 0; x < vector.length; x++) {
            if(sustituir ==  vector[x])
                vector[x] = sustituto;

        }
    }
    

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};

        cambiar(frase, 'x' ,'a');

        System.out.println(frase);

    }
}
