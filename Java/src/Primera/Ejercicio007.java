/*
Mirar si un numero es divisible 
 */
package Primera;

public class Ejercicio007 {

    
    
    public static void main(String srg[]) {
        int x, y, z;
        x = 21;
        y = 6;
        
        if(x < y){
        z = x;
        x = y;
        y = z;
        }
        
        
        if ((x % y) == 0) {
            System.out.println("El numero es divisible");
        } else {
            System.out.println("El numero no es divisible");
        }
    }
}
