package Segunda.Ejercicio04;

public class Ejecutable {
    public static void main(String[] args) {
        Bombo b1 = new Bombo();
        int table[][] = b1.createTable();
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
}
