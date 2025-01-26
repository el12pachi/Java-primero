package Primera;

//camino hacia la izquierda y el ultimo caracter se mueve al principio
public class Ejercicio068 {

    public static void main(String arg[]) {
        char frase1[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
                'a', 'n', 'c', 'h', 'a', ' ' };

        char frase2[] = new char[(frase1.length * 2)];
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < frase1.length; x++) {
                frase2[x + (y* frase1.length)] = frase1[x];
            }
        }
       
        System.out.println(frase2);

    }
}
