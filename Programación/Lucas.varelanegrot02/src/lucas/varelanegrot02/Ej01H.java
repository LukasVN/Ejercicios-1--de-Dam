
package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01H {

    public static void main(String[] args) {
        /* Leer dos números y decir si el primero es mayor que el segundo,
        si es menor o si los dos números son iguales. */
        Scanner t = new Scanner(System.in);
        float numA,numB;
        
        System.out.println("Introduce el número A");
        numA = t.nextFloat();
        System.out.println("Introduce el número B");
        numB = t.nextFloat();
        
        if (numA > numB)
            System.out.println("A es mayor que B");
        else if (numA < numB)
            System.out.println("B es mayor que A");
        else
            System.out.println("A y B son iguales");
        
        
        
        
    }
    
}
