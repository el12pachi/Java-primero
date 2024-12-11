package Segunda.Ejercicio02;

public class Ejecutable {
    public static void main(String[] args) {
        Perro animal1;
        animal1 = new Perro(12, "12/11/2024", true, "Toby", "Salchicha",true);
        animal1.habla();
        Pato animal2;
        animal2 = new Pato(12, "12/11/2024", true, "Toby", 12.12);
        animal2.habla();
    }
}
