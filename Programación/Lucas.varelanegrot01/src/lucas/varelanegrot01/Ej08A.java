package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej08A {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float edad1,edad2,edad3,edad4;
        
        System.out.println("*Progama de edad con 4 variables*");
        
        System.out.println("Introduzca la edad A");
        edad1 = t.nextFloat();
        
        System.out.println("Introduzaca la edad B");
        edad2 = t.nextFloat();
        
        System.out.println("Introduzca la edad C");
        edad3 = t.nextFloat();
        
        System.out.println("Introduzca la edad D");
        edad4 = t.nextFloat();
        
        float edadT = edad1+edad2+edad3+edad4/4;
        
        System.out.println("La media de edad es: "+edadT);
        
        
        
    }
    
}
