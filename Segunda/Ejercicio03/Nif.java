package Segunda.Ejercicio03;

public class Nif {
    int dni;
    char letra;
    final char tabla[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    public Nif(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }
    public Nif(int dni) {
        this.dni = dni;
        this.letra = tabla[dni % 23];
    }
    
}
