package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01C {

    public static void main(String[] args) {
        // Leer un número entero y de determinar si se trata de un número par o impar.
        Scanner t = new Scanner(System.in);
        int num, par;

        System.out.println("Introduzca un número entero");
        num = t.nextInt();
        par = (num % 2);

        boolean esPar = (par == 0);
        if (esPar) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es inpar");
        }

    }

}
