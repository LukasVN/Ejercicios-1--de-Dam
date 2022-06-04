package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej29 {

    public static void main(String[] args) {
        /*Sacar por pantalla la suma, la media y el producto de los números pares 
        comprendidos entre dosnúmeros enteros tecleados previamente. 
        No sabemos si el que introduce primero es menor que el segundo. 
        No incluir en los cálculos los números introducidos, solo los intermedios*/
        Scanner t = new Scanner(System.in);
        int a, b, cont = 0, sum = 0,prod = 1;
        double med = 0;

        System.out.println("Introduce el número a: ");
        a = t.nextInt();
        System.out.println("Introduce el número b: ");
        b = t.nextInt();

        if (a > b) {
            for (int i = b; i < a; i++) {
                if (i % 2 == 0) {
                    cont++;
                    sum = sum + i;
                    med = sum / cont;
                    prod = prod * i;                   
                }
            }
        System.out.println("La suma de los números pares comprendidos entre a y b es: "+sum);
        System.out.println("La media de los números pares comprendidos entre a y b es: "+med);
        System.out.println("El producto de los números pares comprendidos entre a y b es: "+prod);    
        }
        
    
        if (b > a) {
            for (int i = a; i < b; i++) {
                if (i % 2 == 0) {
                    cont++;
                    sum = sum + i;
                    med = sum / cont;
                    prod = prod * i;                   
                }
            }
        System.out.println("La suma de los números pares comprendidos entre a y b es: "+sum);
        System.out.println("La media de los números pares comprendidos entre a y b es: "+med);
        System.out.println("El producto de los números pares comprendidos entre a y b es: "+prod);
        }
        
    
    }
}
