import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        /*
         * Realizar un programa al que se le introduzcan dos números enteros positivos y
         * nos diga cuál de los dos
         * tiene más divisores (usar función previa).
         */
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca un número entero:");
        int num1 = t.nextInt(); 
        System.out.println("Introduzca otro número entero:");
        int num2 = t.nextInt(); 
        
        int mayor=0;
        if (cantidadDivisores1(num1) > cantidadDivisores2(num2)) {
            mayor = num1;
        }
        else {
            mayor = num2;
        }
        System.out.println("El número con más divisores es: "+mayor);
        
    }
    public static int cantidadDivisores1(int num) {
        int cont = 0; int divisor;
        for (int i=1;i<num;i++) {
            divisor = i;
            if (num%divisor == 0 && divisor > 0 && divisor  != num && divisor != 1) {
                cont++;
            }
        }
        return cont;
    }
    public static int cantidadDivisores2(int num) {
        int cont = 0; int divisor;
        for (int i=1;i<num;i++) {
            divisor = i;
            if (num%divisor == 0 && divisor > 0 && divisor  != num && divisor != 1) {
                cont++;
            }
        }
        return cont;
    }
}

