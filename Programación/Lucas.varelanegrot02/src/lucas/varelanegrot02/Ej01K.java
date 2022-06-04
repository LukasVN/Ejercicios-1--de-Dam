
package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01K {

    public static void main(String[] args) {
        /* Leer un número y decir si es múltiplo de 2, de 3 y/o de 10.  
            Si no es múltiplo de 2 ya no hay que mirar si lo es de 10. */
        Scanner t = new Scanner(System.in);
        float num;
        
        System.out.println("Introduzca el número");
        num = t.nextFloat();
        
        boolean mult2 = (num%2==0);
        boolean mult10 = (num%10==0);
        boolean mult3 = (num%3==0);
        
        if (mult2)
            System.out.println("Es múltiplo de 2");
            if (mult10)
                System.out.println("Es múltiplo de 10");
        else
                System.out.println("No es múltiplo de 2 o 10");
            
            
        if (mult3)
            System.out.println("Es múltiplo de 3");
        else
            System.out.println("No es múltiplo de 3");
        
        
    }
    
}
