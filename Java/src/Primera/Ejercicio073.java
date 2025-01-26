package Primera;

//modificar una subcadena por otra
public class Ejercicio073 {
   
    public static void main(String arg[]) {
        char frase1[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ',
                'M', 'a', 'n', 'c', 'h', 'a' };
        char patron = 'n';
        for (int x = 0; x <frase1.length; x++) {
            if (frase1[x] == patron) {
                for (int y = x; y < frase1.length - 1; y++) {
                    frase1[y] = frase1[y + 1];
                }
                frase1[frase1.length-1]=' ';
            }
        }

        System.out.println(frase1);
    }

}
