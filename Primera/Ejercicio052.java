package Primera;

public class Ejercicio052 {

    public static int sumSalarios(int vector[]) {
        int sum = 0;
        for (int x = 0; x < vector.length; x++) {
            sum += vector[x];
        }
        return sum;
    }

    public static void main(String arg[]) {
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleado[] = {"Javier Maria", "Antonio muñoz", "Javier Vicente", "David"};
        for (int x = 0; x < salarios.length; x++) {
            System.out.printf("El empleado %s ha cobrado %d€ \n", empleado[x], sumSalarios(salarios[x]));
        }
    }
}
