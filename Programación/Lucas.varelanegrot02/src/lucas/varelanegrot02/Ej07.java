package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
    /* Realizar un programa que informe si un año introducido previamente es bisiesto o no. 
    Son bisiestos los años múltiplos de 4 que no sean múltiplos de 100. 
    Como excepción los múltiplos de 400 también son bisiestos. 
    Se puede hacer una primera versión con varias sentencias condicionales y otra más sofisticada con una sola. */
        Scanner t = new Scanner(System.in);
        int año;

        System.out.println("Introduzca el año");
        año = t.nextInt();
        
        boolean esBisiesto = ( año%4== 0 && !(año%100== 0) || año%400== 0 ); 

        if (esBisiesto) {
                System.out.println("Es bisiesto");
            }
        else
            System.out.println("No es bisiesto");
            
        }

    

}
