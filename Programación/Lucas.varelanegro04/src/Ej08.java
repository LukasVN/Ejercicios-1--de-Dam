import java.util.Scanner;


public class Ej08 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que solicite una cadena, un número que indica una
         * posición de la cadena y una letra. El programa reemplazará sobre la misma
         * cadena, el carácter que hubiera en la posición indicada por la letra
         * introducida. Hacer dos versiones, la primera con String y otra con
         * StringBuilder.
         */
        Scanner t = new Scanner(System.in);
        //Versión 1 (Usando String)
        String cadena1;
        int pos1;
        char letra1;
        System.out.println("Introduzca una cadena (Versión 1): ");
        cadena1 = t.nextLine();
        System.out.println("Introduzca una posición de la cadena (Versión 1): ");
        pos1 = t.nextInt();
        System.out.println("Introduzca una letra (Versión 1): ");
        letra1 = t.next().charAt(0);

        cadena1 = cadena1.substring(0, pos1) + letra1 + cadena1.substring(pos1 +1);
        System.out.println(cadena1);
        
        //Versión 2 (Usando StringBuilder)
        String cadena2;
        int pos2;
        char letra2;
        System.out.println("Introduzca una cadena (Versión 2): ");
        t.nextLine();
        cadena2 = t.nextLine();
        System.out.println("Introduzca una posición de la cadena (Versión 2): ");
        pos2 = t.nextInt();
        System.out.println("Introduzca una letra (Versión 2): ");
        letra2 = t.next().charAt(0);
        t.close();
        StringBuilder cadena2sb = new StringBuilder(cadena2);

        cadena2sb = cadena2sb.delete(pos2, pos2+1);
        cadena2sb = cadena2sb.insert(pos2, letra2);
        System.out.println(cadena2sb);
        
    }
}
