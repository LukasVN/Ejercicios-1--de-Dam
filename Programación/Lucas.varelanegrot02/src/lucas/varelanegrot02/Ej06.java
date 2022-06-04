package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        /*Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c,
    y d, e y f) y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita  ¿Existen
    algunos   casos   para   los   cuales   este   algoritmo   no   funcione?*/
        Scanner t = new Scanner(System.in);
        double a, b, c, d, e, f, x = 0, y = 0;

        System.out.println("Introduzca el valor de a");
        a = t.nextDouble();
        System.out.println("Introduzca el valor de b");
        b = t.nextDouble();
        System.out.println("Introduzca el valor de c");
        c = t.nextDouble();
        System.out.println("Introduzca el valor de d");
        d = t.nextDouble();
        System.out.println("Introduzca el valor de e");
        e = t.nextDouble();
        System.out.println("Introduzca el valor de f");
        f = t.nextDouble();

        double den=(a * e - b * d);  
        if ( den != 0) {
            x = ((c * e - b * f) / den);
            y = ((a * f - c * d) / den);
            System.out.println("x es igual a: " + x);
            System.out.println("y es igual a: " + y);
        }

    }

}
