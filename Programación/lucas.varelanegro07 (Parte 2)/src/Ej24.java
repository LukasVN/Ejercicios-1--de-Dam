import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Ej24 {
    /* Realizar un programa con una función a la que se le pasan dos ArrayList de enteros como parámetros y
    nos devuelva true si los dos ArrayList tienen los mismos elementos, aunque sean en otro orden, y devuelva false en
    caso contrario (suponemos que no tienen valores repetidos). */
    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        Scanner t = new Scanner(System.in);
        int num = 0;
        while(num != -1) {
            System.out.println("Introduzca un valor entero para el Array [1] (-1 para salir)");
            num = t.nextInt();
                if(num != -1) {
                numeros1.add(num);
                System.out.println("Introduzca valor un valor entero para el Array [2] (-1 para salir)");
                num = t.nextInt();
                if(num != -1) {
                numeros2.add(num);
                }
            }
        }
        System.out.println(SonIguales(numeros1,numeros2));
    }
    public static boolean SonIguales(ArrayList<Integer> numeros1, ArrayList<Integer> numeros2) {
        if(numeros1.equals(numeros2)) {
            return true;
        }
        else {
            return false;
        }
    }
}
