package Segunda.Ejercicio01;

public class Casa {
    private String direccion;
    private double numMetros;
    private String material;
    private int numHabitaciones;

    public Casa(String direccion, double numMetros, String material, int numHabitaciones) {
        this.direccion = direccion;
        this.numMetros = numMetros;
        this.material = material;
        this.numHabitaciones = numHabitaciones;
    }

    public Casa(String direccion, double numMetros, String material) {
        this.direccion = direccion;
        this.numMetros = numMetros;
        this.material = material;
        this.numHabitaciones = 1;
    }
    public void mostrar() {
        System.out.printf("%s numero de metros %.2f esta construida con %s y tiene %d habitaciones. \n",this.direccion, this.numMetros,this.material, this.numHabitaciones);
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumMetros(double numMetros) {
        this.numMetros = numMetros;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getNumMetros() {
        return numMetros;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }


}
