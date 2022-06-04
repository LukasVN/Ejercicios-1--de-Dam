package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
        // Calcular la suma de los 100 números siguientes a uno tecleado previamente
        Scanner t = new Scanner(System.in);
        int num,suma=0;
        System.out.println("Introduzca un número");
        num = t.nextInt();
        for (int i = num; i<=num+100; i++) {
            suma+=i;
            
        }
        System.out.println("Suma: "+suma);
    }

}
