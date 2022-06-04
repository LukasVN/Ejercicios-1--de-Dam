import java.util.ArrayList;
import java.util.Scanner;

public class Ej23 {
    /* Realizar el programa que simule el comportamiento de una “cola” FIFO con los nombres de pacientes
    que esperan en la consulta del médico. Tendrá un menú con las siguientes opciones 
    a) Llega un paciente (esto es,Introducir elemento al final de la cola).
    b) Llamar al paciente para ser atendido (esto es, sacar el primer elemento de la cola) mostrándolo por pantalla.
    c) Mostrar el estado de la cola.
    d) salir de programa. */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<String> cola = new ArrayList<>();
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: System.out.println("Introduzca el nombre del paciente");
                        cola.add(t.nextLine());
                    break;
                case 2: System.out.println("El siguiente paciente es "+cola.get(0));
                        cola.remove(0);
                    break;
                case 3: System.err.println("El estado de la cola es el siguiente: "+cola.toString());
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
        System.out.println("1 Llegada de un paciente");
        System.out.println("2 Llamada al siguiente paciente");
        System.out.println("3 Mostrar estado de la cola");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
   
    }

    }
