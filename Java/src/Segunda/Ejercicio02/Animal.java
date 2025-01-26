package Segunda.Ejercicio02;

abstract public class Animal {
    int ID;
    String fnac;
    boolean vacunado;
    private String nonbre;

    public Animal(int iD, String fnac, boolean vacunado, String nonbre) {
        ID = iD;
        this.fnac = fnac;
        this.vacunado = vacunado;
        this.nonbre = nonbre;
    }

    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    abstract void habla();

}
