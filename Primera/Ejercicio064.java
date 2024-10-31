package Primera;

public class Ejercicio064 {



    public static void main(String arg[]) {
        char frase[] = {'E', 'n','n','n','n', ' ', 'u', 'n', 'n','n','n',' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n','n','n', 'c', 'h', 'a'};
        char patron[] = {'n', 'n', 'n','n'};
        int conatdor = 0;
        for(int x = 0; x< frase.length; x++){
            if(patron[0] ==frase[x]){
                for(int y = 0; y< patron.length; y++){
                    if (frase[x + y] != patron[y]) {
                        break;
                    }
                    if((patron.length) == y +1){
                    conatdor++;
                    }
                }
            }
        }
        System.out.println(conatdor);
    }
}
