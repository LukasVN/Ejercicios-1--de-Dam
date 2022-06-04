package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        /*Diseñar un algoritmo al que se le introduzcan las notas de los exámenes
          de una clase con decimales. Se introducirá -1 para indicar que no hay más notas.
          El algoritmo informará del total de notas introducidas, calculará la nota mínima,
          máxima, la media, y si hay algún 5.0 exacto, y el porcentaje de aprobados.
          Hay que validar que estén entre 0 y 10.*/
        Scanner t = new Scanner(System.in);
        float nota, notaT = 0, num = 0, aprobados = 0, min = 10, max = 0;

        System.out.println("Introduzca las notas de los exámenes (-1 para finalizar)");
        nota = t.nextFloat();
        while (nota != -1) {

            if (nota >= 0 && nota <= 10) {
                num++;
                notaT += nota;

                if (nota >= 5) 
                    aprobados++;
                

                if (nota == 5) 
                    System.out.println("Hay algún 5.0 exacto");
                 
                if(nota>max)
                    max=nota;
                if(nota<min)
                    min=nota;

            }
            System.out.println("Siguiente nota: ");
            nota = t.nextFloat();
        }
        System.out.println("Media: " + notaT / num);
        System.out.println("Porcentaje de aprobados: " + (aprobados / num) * 100 + "%");
        System.out.println("Nota máxima: "+max);
        System.out.println("Nota mínima: "+min);
    }

}
