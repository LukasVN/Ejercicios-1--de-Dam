package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01B {

    public static void main(String[] args) {
    // Leer dos números enteros y muestre si el primero es mayor que el segundo.
        Scanner t = new Scanner(System.in);
        int numA, numB;

        System.out.println("Introduce el número A(entero)");
        numA = t.nextInt();
        System.out.println("Introduce el número B(entero)");
        numB = t.nextInt();

        boolean Esmayor = (numA > numB);
        if (Esmayor)
                System.out.println(numA+" (A) es mayor que "+numB+" (B)");
        else    
                System.out.println(numB+" (B) es menor que "+numA+" (A)");
               
    }

}
