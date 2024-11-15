package Primera;

public class Ejercicio084 {

    public static void main(String arg[]) {
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        String vector[];
        int inicio = 0; 
        int fin = 0;
        int contador = 0;
        int posicion = frase.indexOf(" ");
        
        while (posicion != -1) {
            posicion = frase.indexOf(" ", posicion + 1);
            contador++;
        }

        vector = new String[contador];
        contador = 0;
        while (fin < frase.length()) {
            if(frase.charAt(fin) == ' ') {
                vector[contador] = frase.substring(inicio, fin);
                inicio = fin + 1;
                contador++;
            }
            fin++; 
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
        
        frase = "";
        for (int y = 0; y < vector.length; y++) {
            frase += vector[y] + " ";
        }
        System.out.println(frase);
    }
}
