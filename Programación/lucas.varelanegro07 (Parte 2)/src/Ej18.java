import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ej18 {
    /* Realizar un programa que tenga una función a la que se le pasa un entero y devuelva un ArrayList con
    todos sus divisores. */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int num = t.nextInt();
        System.out.println(Divisores(num));
    }
    public static List<Integer> Divisores(int num) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if(num%i == 0) {
                int divisor = num/i;
                divisores.add(divisor);
            }
        }
        return divisores;
    }
}
