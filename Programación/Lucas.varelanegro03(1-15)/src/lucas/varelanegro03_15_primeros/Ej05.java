package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        /*Sumar una cantidad de números que se van introduciendo siempre 
        que sean positivos hasta que se teclee el -1*/
        Scanner t = new Scanner(System.in);
        Float num, sum = 0f;

        System.out.println("Introduzca un número positivo (-1 para finalizar)");
        num = t.nextFloat();
        while (num != -1) {
            if (num >= 0) 
                sum = num + sum;           
                System.out.println("Introduzca otro número positivo (-1 para finalizar)");
                num = t.nextFloat();
            
        }        
        System.out.println("Suma total: "+sum);
    }

}
