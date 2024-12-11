package Segunda.Ejercicio01;

public class Ejecutable {
    public static void main(String[] args) {
        Casa casa1 = new Casa("C/. María Auxiliadora nº59 " , 1200, "Ladrillo");
        Chalet chalet = new Chalet("Avd. de la ilustracion Nº 3" , 2000, "Ladrillo",200 , true);
        
        casa1.mostrar();
        chalet.mostrar();
        // Casa hola[] = new Casa[10];
    }
}
