package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {
        /*Programa que lea números de entrada y que informa si están ordenados 
        ascendentemente o no. El programa finaliza si se introduce cero o en cuanto
        se detecte que los números no están ordenados*/
        Scanner t = new Scanner(System.in);
        int num, ant;
        
        System.out.println("Introduzca números ordenados de forma ascendente: ");
        num = t.nextInt();
        ant=num;
        while (num != 0 && num>=ant) {
            ant=num;            
            num = t.nextInt();            
        }
        if (num<ant && num!=0)
            System.out.println("Los números no están ordenados ascendentemente");

        

    }

}
