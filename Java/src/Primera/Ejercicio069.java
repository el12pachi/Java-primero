package Primera;

//camino hacia la izquierda y el ultimo caracter se mueve al principio
public class Ejercicio069 {

    public static void main(String arg[]) {
        char frase1[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
                'a', 'n', 'c', 'h', 'a' };

        char aux[] = new char[150];
        for (int x = 0; x < frase1.length; x++) {
            aux[x] = frase1[frase1.length - x - 1];
        }

        System.out.println(aux);

    }
}
