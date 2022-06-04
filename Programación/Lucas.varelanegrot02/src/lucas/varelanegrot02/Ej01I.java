
package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01I {

    public static void main(String[] args) {
        /* Leer dos números enteros y diga si el segundo es divisor del primero (prevenir
        divisiones por cero, que causan error) Repasar operadores en cortocircuito para
        hacer un solo if. */
        Scanner t = new Scanner(System.in);
        int numA,numB;
        
        System.out.println("Introduce el número A");
        numA = t.nextInt();
        System.out.println("Introduce el número B");
        numB = t.nextInt();
        
               
        if (numA!=0 && numB%numA==0)
            System.out.println("El número B es divisible entre A");
        else 
            System.out.println("El número B no es divisible entre A");
        
        
    }
    
}
