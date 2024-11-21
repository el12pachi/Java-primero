package Primera;

public class Ejercicio095 {

    public static void des(int numero,int contador) {
        String medidas[] = {"Unidades","Decenas","Centenas","Unidades de millar","Decenas de millar","Centenas de millar"};
        if(contador == medidas.length){
            return;
        }else{
            des(numero / 10 , contador + 1);
        }

        System.out.println(medidas[contador] + " : " + numero % 10);
    }

   
    public static void main(String srg[]) {
        int numero = 256809;
        int contador = 0;
        des(numero, contador);

    }
}