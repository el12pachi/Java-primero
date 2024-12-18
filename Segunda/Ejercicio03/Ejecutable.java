package Segunda.Ejercicio03;

public class Ejecutable {
    public static void main(String[] args) {
        Nif perosna1;
        try{
            perosna1 = new Nif(21748574,'A');
            perosna1.mostarDni();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
