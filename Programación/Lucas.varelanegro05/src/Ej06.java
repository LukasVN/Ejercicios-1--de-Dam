import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        /*
         * Realiza una función llamada cantidadDivisores al que se le pase como
         * parámetro un número entero y
         * devuelva el número de divisores o bien cero si el número es negativo. Usa
         * dicha función en un main.
         */
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca un número entero:");
        int num = t.nextInt();
        System.out.println("El número tiene un total de divisores de: ");
        System.out.println(cantidadDivisores(num));
    }
    public static int cantidadDivisores(int num) {
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
