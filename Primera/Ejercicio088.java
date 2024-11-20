package Primera;

public class Ejercicio088 {

    public static void main(String arg[]) {
        String frase1 = "Habia     vez circo      alegraba el      una      un que     siempre     corazón ";

        
        int posicion = frase1.indexOf("  ");

        while (posicion != -1) {
            //frase1 =frase1.substring(0, posicion).concat(frase1.substring(posicion + 1));
            frase1 =frase1.replace("  ", " ");
            posicion = frase1.indexOf("  ", posicion);
        }
        System.out.println(frase1);
    }
}
