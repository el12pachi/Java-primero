package Segunda.Ejercicio02;

public class Perro extends Animal {
    String raza;
    boolean peligrosidad;

    public Perro(int iD, String fnac, boolean vacunado, String nonbre, String raza, boolean peligrosidad) {
        super(iD, fnac, vacunado, nonbre);
        this.raza = raza;
        this.peligrosidad = peligrosidad;
    }

    public void habla() {
        System.out.printf("Gua, guau, soy un perro de raza %s, naci el %s y me llamo %s \n", raza,fnac, getNonbre());
    }
}
