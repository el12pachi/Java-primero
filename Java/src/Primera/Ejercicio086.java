package Primera;

public class Ejercicio086 {

    public static void main(String arg[]) {
        String frase1 = "Habia vez circo alegraba el una un que siempre corazón";
        String frase2 = "";

        for (int x = frase1.length() -1; x >= 0; x--) {
            frase2 =frase2.concat(Character.toString(frase1.charAt(x)));
        }
        System.out.println(frase2);
        
    }
}
