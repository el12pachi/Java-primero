//Modificar frase, de manera que sus palabras (separadas por espacios en blanco) queden ordenadas alfabéticamente.
package Primera;

public class Ejercicio084 {

    public static void main(String arg[]) {
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        String vector[];
        int cont = 0;
        int postion = frase.indexOf(" ");
        while (postion != -1) {
            cont++;
            postion = frase.indexOf(" ", postion + 1);
        }
        vector = new String[cont];
        cont = 0;
        int inicio = 0;
        int fin = frase.indexOf(" ");
        while (cont < vector.length) {
            vector[cont] = frase.substring(inicio, fin);
            inicio = fin + 1;
            fin = frase.indexOf(" ", inicio);
            cont++;
        }

        String aux;
        for (int x = 0; x < vector.length - 1; x++) {
            for (int y = vector.length - 1; y >= x; y--) {
                if (vector[y].compareTo(vector[x]) < 0) {
                    aux = vector[y];
                    vector[y] = vector[x];
                    vector[x] = aux;
                }
            }

        }

        for(String x:vector){
            System.out.print(x+" ");
        }
    }
}
