package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej26 {

    public static void main(String[] args) {
    /*Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, 
    siendo x un número entero positivo tecleado previamente 
    (ojo: el número x puede ser par o impar)*/
        Scanner t = new Scanner(System.in);
        int n;

        System.out.println("Introduzca el número positivo de líneas a completar");
        n = t.nextInt();
        if (n > 0) {
            for (int i = 0; i < (n / 2); i++) {
                System.out.println("Hola");
                System.out.println("Adiós");
            }

        if (n % 2 != 0) {
            System.out.println("Hola");
            }
        }

    }
}