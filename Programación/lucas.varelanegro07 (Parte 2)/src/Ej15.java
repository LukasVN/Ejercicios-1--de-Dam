import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej15 {
    /* Realiza un programa que tenga un ArrayList llamado AlturaAlumnos que mantenga una lista con las
    alturas de los alumnos de un centro. Serán valores positivos entre 0,50 y 2,50 redondeados a dos decimales. El
    programa tendrá las siguientes funciones (accesibles mediante un menú):
    a. Añadir altura.
    b. Mostrar lista actual con el número de posición
    c. Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.
    d. Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que se
    encuentre dicha altura. Devuelve la cantidad de eliminaciones.
    e. Ordenar la lista.
    f. Vaciar la lista. */
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        List <Double> AlturaAlumnos = new ArrayList <> ();
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: 
                    double altura = (Math.random()*2.50-0.5)+0.5;
                    altura = Math.round(altura*100.0)/100.0; //Aproximación a centésimas.
                    AlturaAlumnos.add(altura);
                    break;
                case 2:
                    for(int i= 0; i<AlturaAlumnos.size();i++) {
                        System.out.println("Posición "+(i+1)+":"+AlturaAlumnos.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Introduzca la posición que desea eliminar:");
                    int posicion = t.nextInt();
                    AlturaAlumnos.remove(posicion);
                    System.out.println("Posicion "+posicion+" eliminada");
                    break;
                case 4: 
                    System.out.println("Introduzca el valor a eliminar en la lista:");
                    double valor= t.nextDouble();
                    int cont = 0;
                    while(AlturaAlumnos.remove(valor)) {
                        cont++;
                    }
                    System.out.println("Se han borrado "+cont+" valores");
                    break;
                case 5:
                    Collections.sort(AlturaAlumnos);
                    System.out.println("Lista ordenada satisfactoriamente");
                    break;
                case 6:
                    AlturaAlumnos.clear();
                    System.out.println("Lista vaciada completamente");
                    break;
                case 0:
                    salir = true;
                    break;
 
            }
        } while (!salir);
    }
    private static int pintarMenu() {
        Scanner t = new Scanner(System.in);
 
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Añadir nueva altura");
        System.out.println("2 Mostrar lista y sus posiciones");
        System.out.println("3 Eliminar posición de la lista");
        System.out.println("4 Eliminar por valor (Indica cantidad de eliminaciones)");
        System.out.println("5 Ordenar lista");
        System.out.println("6 Vaciar lista");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
   
    }

}
