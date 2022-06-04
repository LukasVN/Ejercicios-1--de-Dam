package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        /*Programa al que le introduzcas un número y que garantice que es positivo,
        es decir, si lo introducmos menor o igual que cero nos obligará a volver a
        introducirlo las veces que sea necesario hasta que se introduzca uno positivo*/
        Scanner t = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduzca un número positivo: ");
            num = t.nextInt();
        } while (num < 1);

    }
}


