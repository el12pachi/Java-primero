package Segunda.Ejercicio04;

public class Bombo {
    private int[] vector;
    private int bolas = 48;

    public Bombo() {
        vector = new int[bolas];
        for (int x = 0; x < vector.length; x++) {
            vector[x] = x + 1;
        }
        
    }


    public int[][] createTable(){
        int table[][] = new int[6][8];
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = newBol();
            }
        }
        return table;

    }
    public int newBol() {
        int ramndom = (int) (Math.random() * (bolas+ 1));
        int aux = vector[ramndom];
        vector[ramndom] = vector[bolas-- -1];
        return aux;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getBolas() {
        return bolas;
    }

    public void setBolas(int bolas) {
        this.bolas = bolas;
    }

}
