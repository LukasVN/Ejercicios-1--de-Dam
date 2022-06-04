import java.util.Scanner;

public class Ej05 {
    /*
     * Programa que calcule el factorial de números menores de 20. El programa
     * permite al usuario meter los
     * números que desee y finalizará cuando meta un número menor que 1 o mayor que
     * 20. Crea las funciones que
     * consideres útiles y que puedas reutilizar en otros programas
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        long num;
        System.out.println("Introduzca un número del 1 al 20: ");
        num = t.nextLong();
        while (num >= 1 && num <= 20) {
            System.out.println("El valor de los factoriales de "+num+" es: "+factoriales(num));
            System.out.println("-------------------------------------------");
            System.out.println("Introduzca un número del 1 al 20: ");
            num = t.nextLong();
        }
    }

    public static long factoriales(long num) {
            long total=1;
            for (long i = 1; i<=num; i++) {
                total = total*i;
            }
            return total;

    }
}
