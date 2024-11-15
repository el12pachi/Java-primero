package Primera;

public class Ejercicio080 {

    public static void main(String arg[]) {
        String frase = "En un lugar de la Mancha, sitio de cuyo , nombre no quiero acordarme";
        frase = frase.replace('a', 'X');
        frase = frase.replace("lugXr", "sitio");
        int posicion = frase.indexOf("sitio");
        while (posicion != -1) {
            System.out.println(posicion);
            posicion = frase.indexOf("sitio", posicion + 1);
        }
    }

}
