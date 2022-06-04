package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int dia, hora;

        System.out.println("Introduzca el día");
        dia = t.nextInt();
        System.out.println("Introduzca la hora");
        hora = t.nextInt();

        boolean bus = (hora == 10 
                || dia != 6 && hora == 14 || 
                   dia == 7 || 
                   dia == 4 && hora == 12);

        if (bus) {
            System.out.println("Hay bus");
        } else {
            System.out.println("No hay bus");
        }

    }

}
