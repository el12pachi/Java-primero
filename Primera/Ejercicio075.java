package Primera;

//modificar una subcadena por otra
public class Ejercicio075 {

    public static void main(String arg[]) {
        char frase1[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ',
                'M', 'a', 'n', 'c', 'h', 'a', ' ' };
        int inico = 0;
        for (int x = 0; x < frase1.length; x++) {
            if (frase1[x] == ' ') {
                frase1[x -1] = Character.toUpperCase(frase1[x-1]);
                frase1[inico] = Character.toUpperCase(frase1[inico]);
                inico = x +1;
            }
        }

        System.out.println(frase1);
    }

}
