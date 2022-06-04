
package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double a,b,aelevado,belevado, sumaelevado;
        
        System.out.println("Introduzca el valor del cateto a: ");
        a = t.nextFloat();
        System.out.println("Introduzca el valor del cateto b: ");
        b = t.nextFloat();
        
        aelevado = Math.pow(a, 2);
        belevado = Math.pow(b, 2);
        sumaelevado= aelevado+belevado;
        
        
        System.out.println("La hipotenusa es: "+(Math.sqrt(sumaelevado)));
        
        
        
        
        
        
        
    }
    
}
