import java.util.Scanner;

public class Ej03 {
    /*
     * A partir de la clase CuentaCorriente que te proporcionará el profesor, crea
     * un programa en
     * el que se creen una cuenta corriente (siempre se crean con saldo inicial
     * cero) y mediante un menú le
     * permita al usuario hacer operaciones como ingresar, retirar y consultar saldo
     * en la cuenta. El único
     * atributo público de la cuenta es el IBAN (String de 24 dígitos/letras). Otros
     * atributos privados son saldo,
     * contadorIngresos, porcentajeComision y minimoComision, pero como son
     * privados, no tenemos acceso a ellos. Los
     * métodos son:
     * - constructor (String Iban): se le pasa el nombre de la cuenta y fija saldo
     * inicial a cero.
     * - void ingresar (float importe): aumenta el saldo. Si se hacen 3 ingresos
     * consecutivos, sin ninguna retirada en
     * medio, se regala 0,7 euros al usuario.
     * - boolean retirar (float importe): reduce el saldo si es posible, no puede
     * quedar negativo (devuelve si se ha
     * efectuado la retirada o no). Cada retirada tiene una comisión asociada.
     * - float getSaldo (): devuelve el saldo actual en la cuenta.
     * - setComision (float porcentaje, float impMinimo). Fija la comisión de
     * retirada, para todas las cuentas.
     * - getPorcentajeComision() devuelve un float con el porcentaje de comisión a
     * aplicar en retiradas.
     * - getMinimoComision() devuelve un float con el importe mínimo de comisión a
     * aplicar en retiradas.
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int opcion;
        System.out.println("Introduzca el Iban de la cuenta");
        String iban = t.nextLine().substring(0, 24);
        CuentaCorriente cuenta = new CuentaCorriente(iban);
        CuentaCorriente.setComision(0.05f, 2);

        boolean salir = false;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("\t Su número IBAN es: " + iban);

                    break;
                case 2:
                    System.out.println("\t Introduzca la cantidad a retirar: ");
                    if (cuenta.getSaldo() > 0) {
                        cuenta.retirar(t.nextFloat());
                    }

                    break;
                case 3:
                    boolean fin = false;
                    while (fin == false) {
                        System.out.println("\t Introduzca la cantidad a ingresar: ");
                        cuenta.ingresar(t.nextFloat());
                        System.out.println("\t Desea continuar ingresando? Si=1 | No=2 ");
                        short respuesta = t.nextShort();
                        if (respuesta == 2) {
                            fin = true;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Su saldo actual es de: " + cuenta.getSaldo());
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
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
}
