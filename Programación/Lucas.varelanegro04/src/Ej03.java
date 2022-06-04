import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que solicite que se le introduzcan una cadena y un
         * carácter y nos muestre cuantas veces está contenido el carácter en la cadena.
         */
        Scanner t = new Scanner(System.in);
        String cadena;
        char letra;
        int cont = 0;
        System.out.println("Introduzca una cadena: ");
        cadena = t.nextLine();
        System.out.println("Introduzca una letra: ");
        letra = t.findInLine(".").charAt(0);
        t.close();
        
        for (int i = 0; i < cadena.length(); i++)
            if (cadena.charAt(i) == letra)
                cont++;

        System.out.println("La letra se repite "+cont+" veces");

    }
}
