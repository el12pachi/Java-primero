package Segunda.Ejercicio03;

public class Nif {
    int dni;
    char letra;
    final char tabla[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    public Nif(int dni, char letra) throws Exception {
        this.dni = dni;
        this.letra = letra;
        if (letra != tabla[dni % 23]) 
            //throw new IllegalArgumentException("La letra no es correcta");
            throw new Exception("La letra no es correcta");
    }

    public Nif(int dni) {
        this.dni = dni;
        this.letra = tabla[dni % 23];
    }

    public void mostarDni() {
        System.out.println(this.dni +"-"+ this.letra);
    }
    
}
