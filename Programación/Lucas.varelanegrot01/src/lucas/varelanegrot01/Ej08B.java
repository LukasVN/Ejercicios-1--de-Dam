package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej08B {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float edades,edadesN;
        
        edadesN = 4;
        
        System.out.println("*Progama de edad con 2 variables*");
        
        System.out.println("Introduzca la edad A");
        edades = t.nextFloat();
        System.out.println("Introduzca la edad B");
        edades += t.nextFloat();
        System.out.println("Introduzca la edad C");
        edades += t.nextFloat();
        System.out.println("Introduzca la edad D");
        edades += t.nextFloat();
        
        
        
        System.out.println("La media de edades es: "+edades/edadesN);
        
    
        
        
        
    }
    
}
