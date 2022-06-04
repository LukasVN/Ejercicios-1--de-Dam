import java.util.Scanner;

public class Ej08 {
    /*
     * Implementar una clase llamada EjemplarLibro que se va a usar en una
     * biblioteca y que tiene
     * los siguientes atributos:
     * - Título de libro (se le pone en el momento del alta)
     * - Fecha de adquisición (es la fecha del sistema en el momento del alta)
     * - Número de ejemplar: 1, 2, 3, etc. (de un mismo libro, la biblioteca tiene
     * varios ejemplares)
     * - Prestado (sí /no). Inicialmente no está prestado.
     * Además, tiene los siguientes métodos:
     * - Constructor 1: cuando es el primer ejemplar de un determinado título, se le
     * pasa como parámetro solo el título del libro. El resto de datos los puede
     * calcular él.
     * - Constructor 2: se le pasa como parámetro un libro y copia todos sus
     * atributos salvo el número de ejemplar que será 1 más el del libro pasado.
     * - Prestar (): si no está prestado lo marca como prestado y devuelve true ̧ si
     * está prestado no hace nada y devuelve false.
     * - Devolver (): si está prestado lo marca como no prestado y devuelve true ̧
     * si no está prestado no hace nada y devuelve false.
     * - toString (): Genera un String con el nombre, la fecha entre paréntesis y el
     * número de ejemplar entre corchetes.
     * Este método se usará para sacar por pantalla de forma cómoda los datos de un
     * libro.
     * Haz un main() que cree 4 libros (probando ambos constructores), que realice
     * algún préstamo y devolución, y finalmente muestre los libros -con
     * toString()-.
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int opcion; boolean salir = false;
        System.out.println("Introduzca el nombre de 3 libros: ");
        EjemplarLibro l1 = new EjemplarLibro(t.nextLine());
        EjemplarLibro l2 = new EjemplarLibro(t.nextLine());
        EjemplarLibro l3 = new EjemplarLibro(t.nextLine());
        EjemplarLibro l4 = new EjemplarLibro(l3);
        EjemplarLibro lactual = new EjemplarLibro(l1);
        
        
        do {
        opcion = pintarMenu();
        switch (opcion) {
            case 1:
            System.out.println(lactual.toString()); 
            break;

            case 2:
            lactual.Prestar();
            break;

            case 3:
            lactual.Devolver();
            break;

            case 4:
            System.out.println("A que libro quieres cambiar? (1 | 2 | 3 | 4)");
            int respuesta2 = t.nextInt();
            switch (respuesta2) {
                case 1: lactual =l1;
                break;

                case 2: lactual =l2;
                break;

                case 3: lactual =l3;
                break;

                case 4: lactual =l4;
                break;
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
        System.out.println("1 Datos Libro");
        System.out.println("2 Prestar Libro");
        System.out.println("3 Devolver Libro");
        System.out.println("4 Cambiar Libro Actual");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }

}
