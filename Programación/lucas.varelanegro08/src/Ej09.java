import java.util.Scanner;

public class Ej09 {
    /* Copia la clase _CuentaCorriente que te proporcionará el profesor con un nombre nuevo, por
    ejemplo, CuentaCorriente y realiza las siguientes operaciones:
    • Crea una clase hija llamada CuentaPlazo igual que la anterior, pero sin comisiones. Además, tiene
    un nuevo atributo, que es la fecha de creación.
    • Esta nueva clase ya no permitirá que haya subclases de ella.
    • Crea constructor para la nueva clase que incorpore la inicialización de la fecha de creación al día
    en curso.
    • Sobrescribe el método retirar () para que no que no calcule comisiones. Revisa los modificadores
    de acceso de atributos y quizás tengas que crear algún getter/setter.
    • Haz un programa que cree inicialmente una cuenta a plazo y luego, mediante un menú, permita
    ingresar, retirar y consultar el saldo. */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float importe;
        System.out.println("Introduzca el Iban de la cuenta");
        String Iban = t.nextLine(); 
        CuentaPlazo cuenta = new CuentaPlazo(Iban);
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: 
                    System.out.println("Introduzca la cantidad a ingresar: ");
                    importe = t.nextFloat();
                    cuenta.ingresar(importe);
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad a retirar:");
                    importe = t.nextFloat();
                    cuenta.retirar(importe);
                    break;
                case 3:
                    System.out.println("Su saldo es: "+cuenta.getSaldo());;
                    break;
 
                case 4:
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
        System.out.println("1 Ingresar dinero");
        System.out.println("2 Retirar dinero");
        System.out.println("3 Consultar saldo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }
}
