package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        /*Progama al que se le introduzcan las edades de los alumnos (-1 para finalizar)
          y nos informe si hay alguno menor de edad.*/
        Scanner t = new Scanner(System.in);
        int edad=0;
        System.out.println("El siguiente programa le informará de la existencia de alumnos menores, introduzca -1 para finalizarlo");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Introduzca las edades de los alumnos: ");
        while (edad != -1) {
            edad = t.nextInt();
            if (edad < 18 && edad!=-1) {
                System.out.println("Sí, hay alguno");
            }

        }

    }
}