package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int dia, mes, año,numDias=31;

        System.out.println("Introduzca el día");
        dia = t.nextInt();
        System.out.println("Introduzca el mes");
        mes = t.nextInt();
        System.out.println("Introduzca el año");
        año = t.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 2:
                if( año%4==0 && año%100!=0|| año%400==0 )              
                    numDias = 29;
                else
                    numDias = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
        }
        
        if (mes<=12 && dia<=numDias)
            System.out.println("Fecha correcta");
        else
            System.out.println("Fecha incorrecta");
        

    }

}
