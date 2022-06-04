package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        /*Sumar una cantidad de números que se van introduciendo por teclado hasta
          que la suma de los mismos valga más de 100*/
        Scanner t = new Scanner(System.in);
        int num=0;
        
        System.out.println("Introduce un número");
        num += t.nextInt();
        while (num<=100) {
            System.out.println("Introduce un número");
            num += t.nextInt();
            System.out.println("Suma: "+num);
        }        
    }

}
