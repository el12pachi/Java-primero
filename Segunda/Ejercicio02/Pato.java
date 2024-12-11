package Segunda.Ejercicio02;

public class Pato extends Animal {
    double tamanoPico;

    public Pato(int iD, String fnac, boolean vacunado, String nonbre, double tamanoPico) {
        super(iD, fnac, vacunado, nonbre);
        this.tamanoPico = tamanoPico;
    }

    public void habla() {
        System.out.printf("Cua, Cua, soy un pato y mi pico me mide %.2f, naci el %s y me llamo %s \n", tamanoPico,fnac, getNonbre());
    }
}
