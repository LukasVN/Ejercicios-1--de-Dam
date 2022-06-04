package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        /*Programar el siguiente juego. El ordenador genera un número al azar entre
        el 0 y 99 que habrá que adivinar. El jugador intentará adivinar el número y
        el programa le responderá si es mayor, menor o si ha acertado. Se dispone de
        un máximo de 5 intentos.*/
        Scanner t = new Scanner(System.in);
        int num, random = (int) (Math.random() * 99);

        System.out.println("Intenta adivinar el número entre 0 y 99 (5 intentos)");
        
        for (int i = 1; i <= 5 && i != random; i++) {
            num = t.nextInt();
            
            if (num == random) {
                System.out.println("Acertaste!");           
            }
            else if (i!=5)
                System.out.println("Prueba otra vez");
            
            if (i == 5 && num != random) {
                System.out.println("Fallaste, el número era: " + random);
            }

        }

    }
}