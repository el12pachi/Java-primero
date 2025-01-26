package Primera;

//Sistema D'Hondt
public class Ejercicio098 {
    public static boolean primo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String srg[]) {
        int number = 9;
        if (primo(number)) {
            System.out.println("El número " + number + " es primo");
        } else {
            System.out.println("El número " + number + " no es primo");
        }
    }
}