import java.util.Scanner;

public class Ej2 {
    /*
     * Realizar un programa que tenga un Array con las 10 notas de un alumno de
     * ciclos formativos. 
     * Primero se le pedirá al usuario que introduzca valores para las 10 asignaturas,
     * verificando que los valores estén entre 1 y 10 
     * (si lo introduce mal, deberá introducirlos hasta que lo haga bien) 
     * Mostrar la nota máxima, mínima, media, si puede ir a la FCT (todas >=5)
     * y si se propone para matrícula de honor (todas 9 ó 10)
     */
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        int[] notas = new int[10]; int notamax=0; int notamin = 10; 
        int media=0; boolean fct = true; boolean matricula = true;
        for(int i=0;i<=9;i++) {
            int pos = i+1;
            System.out.println("Introduzca nota de la asignatura "+pos);
            notas[i] = t.nextInt();
            if(notas[i] <1 || notas[i] >10) {
                System.out.println("Error");
                i--;
            }
            else {
                if (notamax < notas[i]) {
                    notamax= notas[i];
                }
                else if (notamin > notas[i]) {
                    notamin= notas[i];
                }
                else if (notas[i] < 5) {
                    fct = false;
                }
                else if (notas[i] <9) {
                    matricula = false;
                }
                media+=notas[i];        
            }
        }
        media = media/10;
        System.out.println("La nota mínima es: "+notamin);
        System.out.println("La nota max es: "+notamax);
        System.out.println("La nota media es: "+media);
        if (fct) {System.out.println("El alumno puede ir a la FCT");}
        if (matricula) {System.out.println("El alumno se propone para matrícula de honor");}
        else {System.out.println("El alumno NO se propone para matrícula de honor");}
    }
}