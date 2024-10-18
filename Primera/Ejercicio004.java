/*
Cual es mayor de los tres
*/
package Primera;

public class Ejercicio004 {

    public static void main(String srg[]) {
        int x, y, n;
        x = 5;
        y = 5;
        n = 60;
        if (y > x && y > n) {
            System.out.println("El numero " + y);
        } else if(x > y && x < n){
            System.out.println("El numero " + x);
        }else if(n > y &&  n > x){
            System.out.println("El numero " + n);
        }else{
            System.out.println("El numero " + x + " es igual");
        }
    }
}
