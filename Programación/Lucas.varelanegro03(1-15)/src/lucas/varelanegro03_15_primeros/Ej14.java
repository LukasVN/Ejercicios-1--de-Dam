package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        /*Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000
        Un número perfecto si es igual a la suma de todos los divisores menores que él.*/
        Scanner t = new Scanner(System.in);
        int sum, n = 0;
        System.out.println("Números perfectos del 1 al 10000: ");
        for (int num = 1; num >= 1 && num <= 10000; num++) {
            sum = 0;
            for (n = 1; n < num; n++) {
                if (num % n == 0) {
                    sum = sum + n;

                }
            }
        if (num == sum)
                System.out.println(num);
        }
    }
}
