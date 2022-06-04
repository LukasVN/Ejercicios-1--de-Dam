import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {
    /* Realizar un programa que tenga una función a la que se le pasa un Array con las edades de los alumnos
    de una clase y nos devuelva la edad media. Añadir una función a la que se le pasa un Array 
    con las edades de los alumnos y nos devuelva un Array solo con los mayores de edad. 
    */
    public static void main(String[] args) {
        int edades[] = new int[30];int mayoresedad[] = new int[30];
        boolean salir = false;
        for (int i =0; i<=edades.length-2;i++) {
            edades[i] = (int)((Math.random()*24-15+1)+15);
        }
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: System.out.println(Edadmedia(edades));
                    break;
                case 2: System.out.println(Arrays.toString(Mayoresedad(edades)));
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
        System.out.println("1 Edad media de la clase");
        System.out.println("2 Alumnos mayores de edad");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
   
    }

    public static double Edadmedia(int edades[]) {
        int edadestotal = 0; double media = 0;
        for(int i=0; i<=edades.length-2;i++){
            edadestotal+= edades[i];
        }
        media = edadestotal/30;
        return media;
    }

    public static int[] Mayoresedad(int edades[]) {
        Arrays.sort(edades);
        int posicion = 0;
        for(int i = 0; i < edades.length; i++){
            if (edades[i]>=18){
                posicion = i;
                break;
            }
        }
        int[] mayores = Arrays.copyOfRange(edades, posicion, edades.length-1);
        return mayores;
    }
    
}
