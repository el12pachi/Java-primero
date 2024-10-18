//String y funciones
package Primera;

public class Ejercicio045 {

    public static void write() {
        System.out.println("hello world");
    }

    public static void hablar(String frase) {
        System.out.println(frase);
    }

    public static void animalHabla(String frase, String onomatopeya) {
        System.out.println(frase + " : " + onomatopeya);
    }

    public static String concatenar(String frase1, String frase2) {
        return frase1 + frase2;
    }

    public static float sum(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String arg[]) {
        String palabra;
        Ejercicio045 hola = new Ejercicio045();
        write();
        hablar("Buenas tardesx");
        animalHabla("Me llamo toby", "Guau, Guau");
        palabra = concatenar("Hola buenos ", "dias");
        System.out.println(palabra);
        
        
        System.out.println(sum(3, 2));

    }
}
