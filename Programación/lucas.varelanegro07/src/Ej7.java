import java.util.Scanner;

public class Ej7 {
    /*
     * Realizar una clase llamada Parking2 que gestione los coches aparcados en un
     * parking mediante un
     * Array, que almacene las matrículas y la hora de entrada en el parking. El
     * parking es un poco raro, mide solo 3
     * metros de ancho y caben 20 coches, pero uno detrás de otro por lo que el
     * último en entrar debe ser el primero en
     * salir (esta estructura se llama pila LIFO – Last Input, First Output). Cada
     * minuto en el parking cuesta 2 céntimos
     * (máx 10 euros). 
     * La clase debe tener métodos siguientes:
     * Mostrar el estado del parking, esto es las matrículas/hora de entrada de
     * las plazas ocupadas.
     * Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o
     * cero si lleno. 
     * La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
     * Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se
     * calcula el importe a pagar según
     * los segundos de estancia. Devuelve la matrícula del coche y el importe a
     * pagar. Si es parking está vacío devuelve cadena vacía y cero euros.
     * Mostrar lo recaudado hasta ese momento.
     * Hacer un programa con un menú que permita al usuario usar los métodos
     * creados. No hay que introducir a mano los valores de hora 
     * de entrada y salida en el parking, se harán por el reloj del sistema
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Parking2 park = new Parking2();
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
                case 3: System.out.println("Matricula vehiculo desaparcado: "+park.Desaparcar()+" euros");
                    break;
                case 4: System.out.println("Dinero total recaudado: "+park.Recaudado()+" euros");
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
        System.out.println("4 Dinero recaudado");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }
}

