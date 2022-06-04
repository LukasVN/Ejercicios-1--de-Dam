package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01E {

    public static void main(String[] args) {
        // Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.
        Scanner t = new Scanner(System.in);
        int numA, numB;

        System.out.println("Introduce el número A(entero)");
        numA = t.nextInt();
        System.out.println("Introduce el número B(entero)");
        numB = t.nextInt();

        boolean Mayor = ((numA | numB) > 10);

        if (Mayor) {
            System.out.println("Al menos 1 número es mayor que 10");
        } else {
            System.out.println("Ningún número es mayor que 10");
        }

    }
}
