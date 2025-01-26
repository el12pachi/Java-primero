package Primera;

public class Ejercicio081 {

    public static void main(String arg[]) {
        String frase[] = {"En un lugar", "de la Mancha", ",de cuyo nombre", "no quiero acordarme"};
        int count = 0;
        for (int x = 0; x < frase.length; x++) {
            for (int y = 0; y < frase[x].length(); y++) {
                if (frase[x].charAt(y) == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
