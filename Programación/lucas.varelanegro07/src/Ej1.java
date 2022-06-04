import java.util.Scanner;

public class Ej1 {
    /*
     * Realiza un programa que tenga definido un Array como variable global
     * llamado temperaturaMeses, de 12 enteros, con las temperaturas medias 
     * de un lugar en cada uno de los meses del año. 
     * Serán valores enteros negativos o positivos. 
     * El programa tendrá diferentes funciones que realicen las siguientes tareas:
     * a. Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
     * b. Mostrar por pantalla el contenido del Array.
     * c. Mostrar por pantalla el contenido del Array en orden inverso.
     * d. Mostrar la temperatura media del año.
     * e. Mostrar los meses en los que hizo más de 30 grados.
     * f. Decir si hay algún mes con más de 30 grados.
     */
    public static void main(String[] args) throws Exception {
        boolean salir = false;
        int[] temperaturaMeses = new int[12];
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        // a)
        for(int i =1; i<=11;i++) {
            temperaturaMeses[i] = (int) (Math.random()*(40));
        }
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                // b)
                case 1: 
                    for(int i =1; i<=11;i++) {
                        System.out.println(temperaturaMeses[i]);
                    }
                    break;
                // c)
                case 2: 
                    for(int i=11; i>=1;i--) {
                        System.out.println(temperaturaMeses[i]);
                    }
                    break;
                // d)
                case 3:
                    int mediagrados = 0;
                    for(int i =1; i<=11;i++) {
                        mediagrados+=temperaturaMeses[i];
                    }
                    mediagrados = mediagrados/12;
                    System.out.println(mediagrados);
                    break;
                // e)
                case 4:
                    System.out.println("Los meses en los que hubo temperaturas superiores a 30 grados son: ");
                    for(int i =1; i<=11;i++) {
                        if(temperaturaMeses[i]>30) {
                            System.out.println(mes[i]);
                        }
                    }
                    break;
                // f)
                case 5:
                    boolean masde30 = false;
                    for(int i =1; i<=11;i++) {
                        if(temperaturaMeses[i]>30) {
                            masde30 = true;
                        }
                    }
                    if(masde30) {
                        System.out.println("Hay algún mes con más de 30 grados");
                    }
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
        System.out.println("1 Mostrar por pantalla el contenido del Array");
        System.out.println("2 Mostrar por pantalla el contenido del Array en orden inverso");
        System.out.println("3 Mostrar la temperatura media del año");
        System.out.println("4 Mostrar los meses en los que hizo más de 30 grados");
        System.out.println("5 Decir si hay algún mes con más de 30 grados");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }
}
