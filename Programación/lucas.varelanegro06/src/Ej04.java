import java.util.Scanner;

public class Ej04 {
    /*
     * Haz un programa como el anterior, pero creando dos cuentas en vez de una.
     * Habrá una
     * opción de menú nueva que será “Cambiar cuenta activa” para pasar de una
     * cuenta a otra.
     * Tendremos una variable de tipo CuentaCorriente que le puedes llamar
     * cuentaActiva que unas veces
     * apuntará a una cuenta y otras veces a la otra
     * Recuerda que las variables de tipo Objeto, a diferencia de los tipos
     * primitivos, son apuntadores a
     * los objetos, si tenemos los objetos ‘cuenta1’ y ‘cuenta2’ creados con su
     * constructor, podemos hacer
     * luego una tercera variable ‘cuentaActiva’ sin constructor y hacer
     * ‘cuentaActiva=cuenta1’ o bien
     * ‘cuentaActiva=cuenta2’ cuando nos interese.
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int opcion;
        System.out.println("Introduzca el Iban de la primera cuenta");
        String iban1 = t.nextLine().substring(0, 24);
        System.out.println("Introduzca el Iban de la segunda cuenta");
        String iban2 = t.nextLine().substring(0, 24);
        CuentaCorriente cuenta1 = new CuentaCorriente(iban1);
        CuentaCorriente cuenta2 = new CuentaCorriente(iban2);
        CuentaCorriente.setComision(0.05f, 2);
        CuentaCorriente cActiva= cuenta1;

        boolean salir = false;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("\t Su número IBAN es: " + cActiva.IBAN);
                    
                    break;
                case 2:
                    System.out.println("\t Introduzca la cantidad a retirar: ");
                    if (cActiva.getSaldo() > 0) {
                        cActiva.retirar(t.nextFloat());
                    }
                    break;
                case 3:
                    boolean fin = false;
                    while (fin == false) {
                        System.out.println("\t Introduzca la cantidad a ingresar: ");
                        cActiva.ingresar(t.nextFloat());
                        System.out.println("\t Desea continuar ingresando? Si=1 | No=2 ");
                        short respuesta = t.nextShort();
                        if (respuesta == 2) {
                            fin = true;
                        }
                    }
                    break;

                case 4:
                    
                    System.out.println("Su saldo actual es de: " + cActiva.getSaldo());
                    break;
                case 5:
                    if (cActiva==cuenta1) {
                        cActiva=cuenta2;
                        System.out.println("\t Cambio de cuenta realizado");
                    }
                    else {
                        cActiva=cuenta1;
                        System.out.println("\t Cambio de cuenta realizado");
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
        System.out.println("1 Comprobar IBAN");
        System.out.println("2 Retirar saldo");
        System.out.println("3 Ingresar saldo");
        System.out.println("4 Consultar saldo");
        System.out.println("5 Cambiar cuenta activa");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    
    }
}

