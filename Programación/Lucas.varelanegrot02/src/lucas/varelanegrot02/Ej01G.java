package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01G {

    public static void main(String[] args) {
        // Leer dos números enteros y diga si uno y solo uno es mayor de 10.
        Scanner t = new Scanner(System.in);
        int numA, numB;

        System.out.println("Introduce el número A (entero)");
        numA = t.nextInt();
        System.out.println("Introduce el número B (entero)");
        numB = t.nextInt();

        boolean alguno = (numA>10 ||  numB > 10);
        boolean losDos = (numA>10 &&  numB > 10);
        
        if (alguno && !losDos)
            System.out.println("Alguno es mayor que 10");
        else
            System.out.println("No se cumple");
        
        
        
      
            

    }
}


