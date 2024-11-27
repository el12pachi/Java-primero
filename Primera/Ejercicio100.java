package Primera;

public class Ejercicio100 {

    public static String centena[] = { "cero", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos",
            "seiscientos",
            "setecientos", "ochocientos", "novecientos" };
    public static String decena[] = { "cero", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
            "setenta",
            "ochenta", "noventa" };
    public static String unidad[] = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho",
            "nueve" };

    public static void nummeros(int number) {

        if (number >= 100 && number % 10 != 0) {
            nummeros(number / 10);
            System.out.print(unidad[number % 10] + "");
        } else if (number >= 10 && number % 10 != 0) {
            nummeros(number / 10);
            System.out.print(decena[number % 10] + " y ");
        } else if (number >= 1 && number % 10 != 0) {
            System.out.print(centena[number % 10] + " ");
        }

    }

    public static void main(String[] args) {
        int number = 185;
       
        String strNumber = "";
        nummeros(number);
        while (number > 0) {
            if (number >= 100 && number % 10 != 0) {
                strNumber = unidad[number % 10].concat(strNumber);
            } else if (number >= 10 && number % 10 != 0) {
                strNumber = decena[number % 10].concat(" y " + strNumber);
            } else if (number >= 1 && number % 10 != 0) {
                strNumber = centena[number % 10].concat(" " + strNumber);
            }
            number /= 10;

        }
        // System.out.println(strNumber);
    }
}