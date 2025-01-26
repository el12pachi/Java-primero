package Primera;

//modificar una subcadena por otra
public class Ejercicio072 {
    /// ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M','a',
    /// 'n', 'c', 'h', 'a'
    public static void main(String arg[]) {
        char frase1[] = { ' ', 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ',
                'M', 'a', 'n', 'c', 'h', 'a' };
        char frase2[] = new char[150];
        int end = frase1.length - 1;

        for (int x = frase1.length - 1, aux = 1; x >= 0; x--) {
            if (frase1[x] == ' ') {
                for (int y = 0; y < (end - x); y++) {
                    frase2[y + aux ] = frase1[y + x +1];
                }
                
                aux = frase1.length - x ;
                frase2[aux++] = ' ';
                end = x;
            }

        }

        System.out.println(frase2);
    }

}
