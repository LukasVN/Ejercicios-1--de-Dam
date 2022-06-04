import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        /*
         * Un algoritmo de encriptado monoalfabético consiste en la sustitución de una
         * letra por otra a lo largo de todo el mensaje, por ejemplo las A por F, las B
         * por X, las C por M. Obviamente si la A pasa a ser F, ninguna otra letra
         * pasará F. Hacer un programa que le introduzca una cadena en mayúsculas y
         * muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se
         * deja intacto: números, espacios en blanco, etc.). Hacer una segunda versión
         * que funcione con mayúsculas y minúsculas.
         */
        Scanner t = new Scanner(System.in);
        //Versión 1 (Solo funciona con las mayúsculas)
        String cadena;
        String encriptado;
        System.out.println("Introduzca una palabra en mayúsculas a encriptar (Versión 1): ");
        cadena = t.nextLine();
        encriptado = cadena.replace('A', 'F').replace('B', 'X').replace('C', 'M');
        System.out.println(encriptado);
        
        //Versión 2 (Funciona con mayúsculas y minúsculas)
        String cadena2;
        String encriptado2;
        System.out.println("Introduzca una palabra en mayúsculas a encriptar (Versión 2): ");
        cadena2 = t.nextLine();
        t.close();
        encriptado2 = cadena2.replace('A', 'F').replace('B', 'X').replace('C', 'M')
        .replace('a', 'f').replace('b', 'x').replace('c', 'm');
        System.out.println(encriptado2);

    }
}
