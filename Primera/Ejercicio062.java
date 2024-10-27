package Primera;

public class Ejercicio062 {

    public static char[] cambiar(char vector[], char[] sustituto, char sustituir) {
        char newFrase[] = new char[50];
        
        for (int x = 0, aux = 0; x < vector.length; x++, aux++) {
            if (sustituir == vector[x]) {
                for(char y:sustituto){
                    newFrase[aux] = y;
                    aux++;
                }
            }else{
                newFrase[aux] = vector[x];
            }
        }
        return newFrase;
    }

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituto[] = {'X', 'X', 'V'};
        System.out.println(cambiar(frase, sustituto, 'a'));

    }
}
