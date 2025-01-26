package Primera;

public class Ejercicio077 {

    public static void main(String arg[]) {
        String frase1 = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        char cadena[] = new char[frase1.length()];

        for(int x = 0; x< frase1.length(); x++){
            System.out.print(frase1.charAt(x) + " ");
        }

        for(int x = 0; x< frase1.length(); x++){
            cadena[x] = frase1.charAt(x);
        }

        System.out.println(cadena);
    }

}
