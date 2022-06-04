
package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int Sus,Suf,Not,Sb;
        
        System.out.println("Introduzca el número de alumnos con suspensos");
        Sus = t.nextInt();
        System.out.println("Introduzca el número de alumnos con suficientes");
        Suf = t.nextInt();
        System.out.println("Introduzca el número de alumnos con notables");
        Not = t.nextInt();
        System.out.println("Introduzca el número de alumnos con sobresalientes");
        Sb = t.nextInt();
        
        float alumnosT = Sus+Suf+Not+Sb;
        float aprobados = (((Suf+Not+Sb)/(alumnosT))*100);
        System.out.println(aprobados+("% alumnos han aprobado"));
        float notables = (((Not)/(alumnosT))*100);
        System.out.println(notables+"% alumnos han sacado notables");
        float sobresalientes = (((Sb)/(alumnosT))*100);
        System.out.println(sobresalientes+"% alumnos han sacado sobresalientes");
    /*Si pidiésemos el número total de alumnos al usuario, dependeríamos de que
        para que las operaciones fuesen correctas, el usuario introdujese todas
        las calificaciones de forma exacta según al número inicial que introdujo.*/
    }
    
}
