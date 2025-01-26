package Segunda.Ejercicio01;

public class Chalet extends Casa {
    private int numJardin;
    private boolean piscina;
    public Chalet(String direccion, double numMetros, String material, int numHabitaciones, int numJardin,
            boolean piscina) {
        super(direccion, numMetros, material, numHabitaciones);
        this.numJardin = numJardin;
        this.piscina = piscina;
    }
    public Chalet(String direccion, double numMetros, String material, int numJardin, boolean piscina) {
        super(direccion, numMetros, material);
        this.numJardin = numJardin;
        this.piscina = piscina;
    }
    public void mostrar() {
        super.mostrar();
        if (piscina) {
            System.out.print(" tiene piscina ");
        }
        System.out.printf(" tiene un jardirn de " + numJardin + " mtrs");

    }

}
