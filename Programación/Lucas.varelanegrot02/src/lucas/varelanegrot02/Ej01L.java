
package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01L {

    public static void main(String[] args) {
        /* Leer tres números enteros y diga hay alguno mayor que cero. */
        Scanner t = new Scanner(System.in);
        int numA,numB,numC;
        
        System.out.println("Introduzca el número A");
        numA = t.nextInt();
        System.out.println("Introduzca el número B");
        numB = t.nextInt();
        System.out.println("Introduzca el número C");
        numC = t.nextInt();
     
        if (numA>0 | numB>0 | numC>0)
            System.out.println("Hay algún número mayor que cero");
        else
            System.out.println("Ningún número es mayor que cero");
        
        
    }
    
}
