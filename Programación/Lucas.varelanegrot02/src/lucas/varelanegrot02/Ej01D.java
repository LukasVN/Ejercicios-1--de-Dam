package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01D {

    public static void main(String[] args) {
        // Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.
        Scanner t = new Scanner(System.in);
        int numA, numB;

        System.out.println("Introduce el número A(entero)");
        numA = t.nextInt();
        System.out.println("Introduce el número B(entero)");
        numB = t.nextInt();

        boolean Mayor = ((numA & numB) > 10);

        if (Mayor) {
            System.out.println(numA + " (A) y " + numB + " (B) son los dos mayores que 10");
        } else {
            System.out.println(numA + " (A) y " + numB + " (B) no son los dos mayores de 10");
        }

    }

}
