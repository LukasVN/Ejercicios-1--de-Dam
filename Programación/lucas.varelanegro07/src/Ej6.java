import java.util.Scanner;

public class Ej6 {
    /*
     * Realizar una clase llamada Parking que gestione los coches aparcados en un
     * parking mediante un Array que almacene las matrículas. 
     * El parking es un poco raro, mide solo 3 metros de ancho y caben 20 coches,
     * pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir (esta estructura se llama pila LIFO – Last Input, First Output ). 
     * La clase debe tener métodos siguientes:
     * a. Mostrar el estado del parking, esto es las matrículas de las plazas
     * ocupadas.
     * b. Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o
     * cero si lleno. 
     * La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
     * c. Desaparcar: (¿hace falta pasarle algún parámetro?). 
     * Devuelve la matrícula del coche a desaparcar o bien una cadena vacía si el parking está vacío.
     * d. Mostrar la cantidad de plazas libres en ese momento.
     * Hacer un programa con un menú que permita al usuario usar los métodos creados
     * mostrando la información del
     * parking correspondiente a los métodos creados (los métodos no deben escribir
     * nada por consola, eso lo hace el
     * programa que usa la clase)
     */
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        Parking park = new Parking();
        String matriculas[] = new String[20];
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: System.out.println(park.Estado_Parking());
                    break;
                case 2: System.out.println("Ingrese número de mátricula de su vehiculo: ");
                        String num_matricula = t.nextLine();
                        System.out.println("Plaza ocupada: "+park.Aparcar(num_matricula));
                    break;
                case 3: System.out.println("Matricula vehiculo desaparcado: "+park.Desaparcar());
                    break;
 
                case 4: System.out.println("Hay "+park.Plazas_libres()+" plazas libres");
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
        System.out.println("1 Mostrar estado del parking");
        System.out.println("2 Aparcar vehiculo");
        System.out.println("3 Desaparcar vehiculo");
        System.out.println("4 Mostrar plazas libres");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }
}
