package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int hora; String bus;

        System.out.println("Introduzca la hora");
        hora = t.nextInt();
        
        switch (hora) {
            case 9 : bus= "Hay bus los Domingos"; break;
            case 10 : bus= "Todos los días de la semana hay bus a esa hora"; break;
            case 11 : bus= "Hay bus a esa hora los domingos"; break;
            case 12 : bus= "Hay bus a esa hora los jueves y los domingos"; break;
            case 13 : bus= "Hay bus a esa hora los domingos"; break;
            case 14 : bus= "Hay bus todos los días a esa hora menos los sábados"; break;
            default : bus="No hay bus ningún día a esa hora";
        }
        System.out.println(bus);
    }

}
