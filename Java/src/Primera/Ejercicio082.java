package Primera;
//Reemplazar una subcadena por ella misma en mayusculas.

public class Ejercicio082 {
    public static void main(String[] args) {
        String frase[] = {"en un lugar", "lugar de la Mancha", "de cuyo nombre", "no quiero acordarme"};
        String subCad = "lugar";
        for (int x = 0; x < frase.length -1; x++) {
            frase[x] = frase[x].replace(subCad, subCad.toUpperCase());

        }
        for (int x = 0; x < frase.length; x++) {
            System.out.println(frase[x]);
        }
    }
}
