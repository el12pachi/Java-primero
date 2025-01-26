package Primera;

//Sistema D'Hondt
public class Ejercicio097 {

    public static void bin(int numero) {
        if (numero == 0) {
            return;
        } else {
            bin(numero / 2);
        }
        System.out.print(numero % 2);
    }

    public static void main(String srg[]) {
        int votos[] = { 192100, 232000, 33000, 63600, 13000 };
        String partidos[] = { "PSOE", "PP", "CHA", "VOX", "PAR" };
        int divisor[] = { 1, 1, 1, 1, 1 };
        final int ESCANO = 5; //constante no se puede modificar y se escribe en mayusculas
        int max = 0;
        for (int x = 0; x < ESCANO; x++) {
            for (int y = 0; y < votos.length; y++) {
                if ((votos[max] / divisor[max]) < (votos[y] / divisor[y])) {
                    max = y;
                }
            }
            divisor[max]++;
        }
        for (int x = 0; x < divisor.length; x++) {
            divisor[x] = divisor[x] - 1;
            System.out.println("El partido " + partidos[x] + " tiene " + divisor[x] + " escaños");
        }
    }
}