import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        /*
         * Diseña un algoritmo capaz de obtener la letra del nif a partir del número de
         * dni. Consiste en dividir dicho número entre 23 y tomar el resto de la
         * división asignándole la letra correspondiente según la siguiente tabla.
         * Almacena las letras del NIF en una cadena
         */
        Scanner t = new Scanner(System.in);
        int dni, resto;
        String letrasdni = "TRWAGMYFPDXBNJZSQVHLCKE";
        System.out.println("Introduzca el número de su DNI (sin letra)");
        dni = t.nextInt();
        t.close();
        resto = dni % 23;
        System.out.println("La letra que le corresponde es  " + letrasdni.charAt(resto));
    }

}
