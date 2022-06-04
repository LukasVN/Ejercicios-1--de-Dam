package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
    /* Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en
    clase y la nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las
    siguientes situaciones:
        Nota examen mayor o igual a 5
        Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor
        que 5.
        Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la
        valoración del trabajo en clase.
    Diseñar un algoritmo que lea la nota del examen, la valoración del trabajo en clase y la
    nota del trabajo práctico y saque por pantalla si está aprobado o no, todo en con una
    sola sentencia condicional. */
        Scanner t = new Scanner(System.in);
        float examen,clase,práctico;
        
        System.out.println("Introduzca la nota del examen");
        examen = t.nextFloat();
        System.out.println("Introduzca la nota del trabajo en clase");
        clase = t.nextFloat();
        System.out.println("Introduzca la nota del trabajo práctico");
        práctico = t.nextFloat();
        
        if (examen>=5 || examen>=4 && clase>5 && práctico>5)
            System.out.println("Aprobado");
        else if (examen>=4 && (clase>8 || práctico>8))
            System.out.println("Aprobado");
        else
            System.out.println("Suspenso");
        
            
        
            
        
        
    }
    
}
