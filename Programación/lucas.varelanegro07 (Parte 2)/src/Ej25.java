import java.util.ArrayList;
import java.util.Scanner;

public class Ej25 {
    /* Realizar una programa con un ArrayList bidimensional llamado edadesAlumnos en el que cada fila
    representa cada aula y cada columna los alumnos dentro del aula. El programa solicitará por teclado las edades de
    los alumnos (si se introduce 0 quiere decir que se acabó con esa clase y se pasa a la siguiente y si se introduce -1
    finaliza el programa). Una vez introducidos todos los valores, mostrar todas las edades introducidas (cada aula en
    una fila). */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
       ArrayList<ArrayList<Integer> > edadesAlumnos = new ArrayList<ArrayList<Integer>>();
       int edad = 0; int num_clase = 0; int pos = 0;
       edadesAlumnos.add(new ArrayList<Integer>());
        do {
            System.out.println("Ingrese la edad del alumno para la clase: "+(num_clase+1)+" (0 Para cambiar de clase)");
            edad = t.nextInt();
            if(edad != 0 && edad != -1) {
                edadesAlumnos.get(num_clase).add(pos,edad);
                pos++;
            }
            else if(edad == 0){
                edadesAlumnos.add(new ArrayList<Integer>());
                num_clase++; pos = 0;
            }
        }
        while(edad != -1);
        for(int i=0; i<edadesAlumnos.size();i++) {
            System.out.println("Clase "+(i+1)+" "+edadesAlumnos.get(i).toString());
        }
    }
}
