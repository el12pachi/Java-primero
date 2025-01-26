package Primera;

//camino hacia la izquierda y el ultimo caracter se mueve al principio
public class Ejercicio067 {
 
    public static void main(String arg[]) {
        char frase1[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
                'a', 'n', 'c', 'h', 'a', ' ' };
        char caracter = 'a';
        char subcadena[] = { 'A', 'B', 'C', 'D', 'E'};
        char frase2[] = new char[150];
        
        for (int x = 0, aux = 0; x < frase1.length; x++, aux++) {
            if(frase1[x] == caracter){
                for(char y: subcadena){
                    frase2[aux++] = y;
                }
            
            }else{
                frase2[aux] = frase1[x];
            }
        }
        System.out.println(frase2);
        
    }
}
