package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Introduzca cantidad en euros");
        float dólares;
        float euros;
        final float cambio = 1.14f;
        euros = t.nextFloat();
        dólares = euros*cambio;
        
        System.out.println("Su cantidad es equivalente a: "+dólares+" dólares");
    }
    
}
