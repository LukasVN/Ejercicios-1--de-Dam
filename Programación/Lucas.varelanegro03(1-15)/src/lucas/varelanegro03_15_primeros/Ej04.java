package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        /*Diseñar un programa capaz de leer un valor entero, que verifique que esté
        comprendido entre 1 y 10, y mostrar su tabla de multiplicar*/
        Scanner t = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número comprendido entre 1 y 10");
        num = t.nextInt();
        
        if (num >= 1 && num <= 10) {
            System.out.println("Está comprendido entre 1 y 10");
            System.out.println("Tabla del " + num + ":");
        
            for (int i = 1; i <= 10; i++) 
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        else
            System.out.println("No está comprendido entre 1 y 10");

    }

}
