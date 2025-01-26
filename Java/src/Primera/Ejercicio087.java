package Primera;

public class Ejercicio087 {

    public static void main(String arg[]) {
        String frase1 = "Habia vez circo alegraba el una un que siempre corazón ";

        int posicion = frase1.indexOf(" ");

        while (posicion != -1) {
            frase1 =frase1.substring(0, posicion).concat("a").concat(frase1.substring(posicion));
            posicion = frase1.indexOf(" ", posicion + 2);
        }
        System.out.println(frase1);
    }
}
