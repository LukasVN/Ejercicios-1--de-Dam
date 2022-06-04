package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        /*Diseñar un programa que muestre los números pares comprendidos 
        entre 100 y 1 en orden descendente*/
        Scanner t = new Scanner(System.in);
        
        System.out.println("Numeros pares del 100 al 1:");
        
        for (int i = 98; i>1 ; i--) {
            if (i%2==0)                
                System.out.println(i);            
        }
    }
}