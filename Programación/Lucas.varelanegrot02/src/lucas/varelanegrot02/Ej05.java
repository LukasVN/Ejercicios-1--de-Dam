package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
    /* Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo
    mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total
    de segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de
    Java.*/
        Scanner t = new Scanner(System.in);
        int horas, minutos, segundos;

        System.out.println("Introduzca las horas");
        horas = t.nextInt();
        System.out.println("Introduzca los minutos");
        minutos = t.nextInt();
        System.out.println("Introduzca los segundos");
        segundos = t.nextInt();

        

        if (horas >= 24 || minutos >= 60 || segundos >= 60) {
            System.out.println("Formato de horas incorrecto");
        } else {
            int totalsec = (horas * 3600) + (minutos * 60) + (segundos);
            System.out.println("Han pasado " + totalsec);
        }

    }

}
