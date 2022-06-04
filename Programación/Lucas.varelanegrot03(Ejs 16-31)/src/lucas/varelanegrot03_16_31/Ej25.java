package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej25 {

    private static char M;

    public static void main(String[] args) {
        /*Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad 
        de los 30 trabajadores de una fábrica. El programa debe obligar a que las edades que se 
        introduzcan estén comprendidas entre 16 y 70 años. El programa nos mostrará la edad 
        y el sexo del más joven y también mostrará la media de edad de las mujeres.
        Finalmente nos informará si hay alguno con más de 60 años. Si se introduce cero 
        como edad el programa terminará en ese momento sin esperar a que introduzcan 
        los 30 trabajadores.*/
        Scanner t = new Scanner(System.in);
        char sexo = 0;
        int joven = 70, trabajador = 0, menor = 0, edad = 0,edadm=0;
        double totalm = 0;
        
        for (int i = 0; i < 30; i++) {
            System.out.println("Trabajador " + (++trabajador));
            System.out.println("Introduzca el sexo del trabajador (H/M): ");
            sexo = t.next().charAt(0);           

            System.out.println("Introduzca edad del trabajador (16-70): ");
            edad = t.nextInt();
            if (edad == 0) {
                break;
            }
            if (edad >= 16 && edad <= 70) {
                if (joven < edad) {
                    joven = edad;
                }
                if (sexo=='M')
                    edadm= edadm + edad;
                    totalm++;
                
                if (edad > 60) {
                    System.out.println("Hay algún trabajador con más de 60 años");
                }
            } else {
                System.out.println("Intente de nuevo con valores correctos");
                i--;
            }

        } //fin del for      
        System.out.println("El más joven tiene " + joven + " años y su sexo es " + sexo);
        System.out.println("La media de edad de la mujeres es: " + edadm / totalm);
    }

}
