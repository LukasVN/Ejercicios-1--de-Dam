import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que solicite la entrada de 10 cadenas de caracteres y
         * construya una cadena con el primer carácter de cada cadena. Finalmente
         * mostrará dicha cadena por pantalla.
         */
        Scanner t = new Scanner(System.in);
        String cadena = "";
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un carácter: ");
            char letra;
            letra = t.next().charAt(0);
            cadena += letra;
        }
        t.close();
        System.out.println(cadena);
    }
}
