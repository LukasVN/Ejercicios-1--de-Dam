import java.util.Scanner;

public class Ej02 {
    static Scanner teclado;

    /*
     * A partir de la clase MovilPrepago del ejercicio anterior, crea un programa en
     * el que el
     * usuario dé de alta un teléfono con unas características determinadas y luego
     * le permita mediante un
     * menú hacer operaciones como consultar saldo, recarga, hacer llamada, navegar.
     * Se proporciona un
     * modelo (modeloMenu) a modo de esqueleto, con el menú y las funciones
     * necesarias, en las que solo
     * tienes rellenar los huecos.
     */
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int opcion;
        int num;
        int saldomovil;

        System.out.println("Introduzca su número de teléfono: ");
        num = teclado.nextInt();

        System.out.println("Introduzca su saldo actual: ");
        saldomovil = teclado.nextInt();

        MovilPrepago movil = new MovilPrepago(num, 0.10f, 0.5f, 0.02f, saldomovil);

        boolean salir = false;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("\tIntroduce la duración de la llamada (segundos): ");
                    int llamada = teclado.nextInt();
                    movil.efectuarLlamada(llamada);

                    System.out.println("Llamada realizada ");
                    break;
                case 2:
                    System.out.println("\tIntroduce las megas a utilizar en la navegación: ");
                    int megas = teclado.nextInt();
                    movil.navegar(megas);

                    System.out.println("Navegación realizada ");
                    break;
                case 3:
                    System.out.println("\tIntroduzca el saldo a recargar (solo múltiplos de 5): ");
                    int recarga = teclado.nextInt();
                    movil.recargar(recarga);
                    break;

                case 4:
                    System.out.println("Su saldo actual es de: " + movil.consultarSaldo());
                    break;
                case 0:
                    salir = true;
                    break;

            }
        } while (!salir);

        System.out.println("Saldo actual = " + movil.consultarSaldo());

        movil.navegar(150);

        System.out.println("Saldo actual = " + movil.consultarSaldo());

        movil.recargar(10);

        System.out.println("Saldo actual = " + movil.consultarSaldo());
    }

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Efectuar llamada");
        System.out.println("2 Navegar");
        System.out.println("3 Recargar saldo");
        System.out.println("4 Consultar saldo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
}
