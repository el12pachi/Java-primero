/*
Multiplicacion mediante sumas 
 */
package Primera;

public class sudoku {

    public static void main(String srg[]) {
        int tablero[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},};
        
        
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero[x].length; y++) {

                if ((y + 1) % 3 == 0 && (y + 1) != 9) {
                    System.out.print(tablero[x][y] + "|");
                } else {
                    System.out.print(tablero[x][y]);
                }

            }
            if ((x+1) % 3 == 0) {
                System.out.println();
                System.out.println("-----------");
            } else {
                System.out.println();

            }
        }
    }

}
