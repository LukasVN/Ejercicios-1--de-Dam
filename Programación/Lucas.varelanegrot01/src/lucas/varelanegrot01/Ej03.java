package lucas.varelanegrot01;

import java.util.Scanner;


public class Ej03 {

 
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Introduzca el número entero A");
        
        int a,b;
        
        a = t.nextInt();
        
        System.out.println("Introduzca el número entero B");
        
        b = t.nextInt();
        
        System.out.println("La suma de los números es: "+(a+b));
        System.out.println("La resta de los números es: "+(a-b));
        System.out.println("La división de los números es: "+a/(float)b);
        
        
    }
    
}
