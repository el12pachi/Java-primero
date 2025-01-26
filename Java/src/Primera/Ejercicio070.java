package Primera;

//camino hacia la izquierda y el ultimo caracter se mueve al principio
public class Ejercicio070 {

    public static void main(String arg[]) {
        char frase1[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
                'a', 'n', 'c', 'h', 'a' };

        char cadena2[] = new char[frase1.length * 2];
        int i = 0;
        for (int x = 0; x < cadena2.length; x++) {
            if (x < frase1.length) {
                cadena2[x] = frase1[x];
            }else{
                cadena2[x] = frase1[(frase1.length - (i++)) - 1];
            }
        }
        System.out.println(cadena2);

    }
}
