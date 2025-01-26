package Primera;

public class Ejercicio079 {

    public static void main(String arg[]) {
        String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        int inicio = 7;
        int fin = 17;
        System.out.println(frase.substring(inicio, fin));

        for (int x = 0; x < frase.length(); x++) {
            System.out.println(frase.substring(0, x + 1));
        }
    }

}
