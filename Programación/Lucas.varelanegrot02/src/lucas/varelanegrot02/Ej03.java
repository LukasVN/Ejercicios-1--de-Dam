package lucas.varelanegrot02;

import java.util.Scanner;


public class Ej03 {

    public static void main(String[] args) {
    /* Diseñar un programa que lea tres números enteros. Si todos son negativos, mostrar
    el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de los tres.
    En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el
    tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo?
    (Suponer que el cero es un número positivo). Hacer el programa lo más sencillo posible.*/
        Scanner t = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Introduzca el número A");
        a = t.nextInt();
        System.out.println("Introduzca el número B");
        b = t.nextInt();
        System.out.println("Introduzca el número C");
        c = t.nextInt();
        
        if (a<0 && b<0 && c<0)
            System.out.println(a*b*c);
        else if (a<0 || b<0 || c<0)
            System.out.println(a+b+c);
        
        if (a>=0 && b>=0 && c>=0)
            System.out.println((a+b)*c);
        
        
    }
    
}
