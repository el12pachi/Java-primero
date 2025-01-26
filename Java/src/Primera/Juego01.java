/*
Multiplicacion mediante sumas 
 */
package Primera;

import java.util.Scanner;

public class Juego01 {

    public static void main(String srg[]) {
        int number = (int) Math.floor(Math.random() * 100 + 1);
        int lives = 5;

        while (lives >= 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Diga un numero entre el 1 y el 100: ");
            int user = input.nextInt();
            System.out.println(user);
            if (user < number) {
                System.out.println("El numero es mayor que " + user);
            } else if (user > number) {
                System.out.println("El numero es menor que " + user);
            } else {
                System.out.println("Ganastes");
                break;
            }
            if (lives == 0) {
                System.out.println("Perdistes puto noob el numero era " + number);
            }
            lives--;

        }

    }
}
