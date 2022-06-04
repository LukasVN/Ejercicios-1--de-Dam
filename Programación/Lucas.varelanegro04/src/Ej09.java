import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que solicite que se introduzca por teclado un nombre
         * completo y una edad y muestre el siguiente mensaje, utilizando la clase
         * Format.
         */
        Scanner t = new Scanner(System.in);
        int edad;
        String nombre_completo;

        System.out.println("Introduzca la edad; ");
        edad = t.nextInt();
        System.out.println("Introduzca nombre y apellidos: ");
        t.nextLine();
        nombre_completo = t.nextLine();
        String resultado = String.format("Hola, me llamo %s, y tengo %d años", nombre_completo, edad);
        t.close();
        System.out.println(resultado);
    }
}
