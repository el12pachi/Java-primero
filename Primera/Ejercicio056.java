package Primera;

public class Ejercicio056 {

    public static int sumar(int vector[]) {
        int suma =0;
        for (int x = 0; x < vector.length; x++) {
            suma += vector[x];
        }
        return suma;
    }

  

    public static void main(String arg[]) {
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
        String productos[] = {"Peras","Manzanas"};
        for(int x = 0; x< kilos.length ; x++)
            System.out.printf("Se han vendido un todal de %d kilos de %s \n", sumar(kilos[x]), productos[x]);
        
    }
}
