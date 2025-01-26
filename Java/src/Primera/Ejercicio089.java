package Primera;

public class Ejercicio089 {

    public static void main(String arg[]) {
        String frase1 = "Habia vez circo alegraba el una un que siempre corazón ";
        String fraseA = "";
        String fraseB = "";
        
        boolean frase = true;

        int posicion = frase1.indexOf(" ");
        int last = 0;
        while (posicion != -1) {
            if(frase){
                fraseA = fraseA.concat(frase1.substring(last, posicion));
                frase = false;
            }else{
                fraseB = fraseB.concat(frase1.substring(last, posicion));
                frase = true;
            }
            last = posicion ;
            posicion = frase1.indexOf(" ", posicion +1);
        }
        System.out.println(fraseA + fraseB);
    }
}
