package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
        /*Diseñar un algoritmo que se le introduzcan las notas de un alumno en los nueve
        módulos de un ciclo y nos informe si puede ir a la FCT (todos aprobados). 
        ¿Hay que solicitarle al usuario siempre las notas de los nueve módulos?*/
        Scanner t = new Scanner(System.in);
        int nota;

        for (int i = 0; i < 9; i++) {
            System.out.println("Introduzca la nota del módulo");
            nota = t.nextInt();
            if (nota < 5) {                
                System.out.println("El alumno ha suspendido"); break;
            }
            if (i==8)
                System.out.println("El alumno ha aprobado");
        }       
        /*Hay que solicitarle las 9 notas a no ser que ingrese una suspensa antes
        de introducir el resto, debido a que con un módulo suspenso se suspende el ciclo*/
    }

}
