package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej08C {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float edades;
        
        System.out.println("*Progama de edad con 1 variable*");
        
        System.out.println("Introduzca la edad A");
        edades = t.nextFloat();
        System.out.println("Introduzca la edad B");
        edades += t.nextFloat();
        System.out.println("Introduzca la edad C");
        edades += t.nextFloat();
        System.out.println("Introduzca la edad D");
        edades += t.nextFloat();
       
        System.out.println("La media de edades es: "+edades/4);   
        
        
    }
    
} 
        
        