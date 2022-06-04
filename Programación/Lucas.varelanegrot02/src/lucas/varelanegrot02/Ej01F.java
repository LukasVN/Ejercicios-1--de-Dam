package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01F {

    public static void main(String[] args) {
        /* Leer   un   número   entero   y   decir   si   está   comprendido   
        entre   10   y   20   (ambos incluidos).*/
        Scanner t = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero entero");
        num = t.nextInt();
        
        boolean Comprendido = (num > 10) & (num < 20);

        if (Comprendido) {
            System.out.println("El número ("+num+") está comprendido entre 10 y 20");
        } else {
            System.out.println("El número ("+num+") no está comprendido entre 10 y 20");
        }

    }
}
