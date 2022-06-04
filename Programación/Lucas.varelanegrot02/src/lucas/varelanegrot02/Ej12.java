package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int dia1, mes1, año1, dia2, mes2, año2;

        System.out.println("Introduzca el día 1");
        dia1 = t.nextInt();
        System.out.println("Introduzca el mes 1");
        mes1 = t.nextInt();
        System.out.println("Introduzca el año 1");
        año1 = t.nextInt();

        System.out.println("Introduzca el día 2");
        dia2 = t.nextInt();
        System.out.println("Introduzca el mes 2");
        mes2 = t.nextInt();
        System.out.println("Introduzca el año 2");
        año2 = t.nextInt();
        
        if (dia1 > dia2 && mes1 == mes2 && año1 == año2
                || mes1 > mes2 && año1 == año2
                || año1 > año2) 
            System.out.println("La fecha 1 es mayor que la fecha 2");
        else 
            System.out.println("La fecha 2 es mayor que la fecha 1");
        {
        
        
            
        }
    }
}
