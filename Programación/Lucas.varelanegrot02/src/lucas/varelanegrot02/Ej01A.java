package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01A {

    public static void main(String[] args) {
        // Leer un número entero y determinar si es mayor de 10.
        Scanner t = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número entero");
        num = t.nextInt();

        boolean Esmayor = (num > 10);
        if (Esmayor) {
            System.out.println(num + " es mayor que 10");
        } else {
            System.out.println(num + " es menor que 10");
        }

    }

}
