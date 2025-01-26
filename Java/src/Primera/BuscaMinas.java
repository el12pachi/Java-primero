package Primera;
//errorr
public class BuscaMinas {

    public static int[][] generateTablet(int v1[][]) {
        int minesCord[][] = new int[5][2];
        for (int z = 0; z < 5; z++) {
            int x = (int) Math.floor(Math.random() * 5);
            int y = (int) Math.floor(Math.random() * 5);
            if (v1[x][y] != 9) {
                v1[x][y] = 9;
                minesCord[z][0] = x;
                minesCord[z][1] = y;

            } else {
                z--;
            }
        }
        for (int z = 0; z < minesCord.length; z++) {
            int cordx = minesCord[z][0];
            int cordy = minesCord[z][1];
            for (int x = -1; x < 2; x++) {
                for (int y = -1; y < 2; y++) {
                    try {
                        if (v1[cordx + x][cordy + y] == 9) {

                        } else {
                            v1[cordx + x][cordy + y] += 1;
                            //System.out.println("El valor de x es  " + cordx + "|" + (cordx + x) + " Y el valor de y es " + cordy  + "|" + (cordy + y) );
                        }
                    } catch (Exception e) {

                    }
                }

            }

        }
        return v1;

    }

    public static void printArray(int v1[][]) {
        for (int x = 0; x < v1.length; x++) {
            for (int y = 0; y < v1[x].length; y++) {
                System.out.print(v1[x][y] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String arg[]) {
        int mine[][] = new int[5][5];

        printArray(generateTablet(mine));
    }
}
