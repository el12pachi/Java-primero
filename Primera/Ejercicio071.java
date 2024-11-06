package Primera;

//modificar una subcadena por otra
public class Ejercicio071 {

    public static void main(String arg[]) {
        char frase1[] = { 'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
                'a', 'n', 'c', 'h', 'a' };
        char sustituto[] = { 'e', 'n' };
        char sustituir[] = { 'X', 'X', 'X', 'X', 'X' };
        char frase2[] = new char[150];
        for (int i = 0, j = 0, aux = 0; i < frase1.length; i++, j++, aux = 0) {
            if (sustituto[0] == frase1[i]) {
                while (aux < sustituto.length  && sustituto[aux] == frase1[i + aux]) {
                    aux++;
                }
                if (aux == sustituto.length) {
                    for (char x : sustituir) {
                        frase2[j++] = x;
                    }
                    i += sustituto.length -1; 
                }else{
                    frase2[j] = frase1[i];
                }
            } else {
                frase2[j] = frase1[i];
            }

        } 
        System.out.println(frase2);
    }

}
