package Primera;

public class Ejercicio096 {

    public static void bin(int numero) {
        if (numero == 0) {
            return;
        } else {
            bin(numero / 2);
        }
        System.out.print(numero % 2);
    }

   
    public static void main(String srg[]) {
        int numero = 10;
        bin(numero);
    }
}