import java.util.Scanner;
public class Ej10  {
    /* Copia la clase _MovilPrepago que te proporcionará el profesor con un nombre nuevo, por ejemplo,
    MovilPrepago y realiza las siguientes operaciones:
    • Crea una subclase llamada MovilPlus igual que la anterior pero que al efectuar llamadas no se le
    aplica ningún coste por el establecimiento de llamada y tiene una nueva funcionalidad llamada
    videollamada a la que se le pasa los segundos de la videollamada y reduce el saldo de forma
    similar a ‘navegar’. En este caso, cada segundo de llamada son 2 MB de datos (recuerda que los
    atributos de MovilPrepago son privados, esto puede ser un problema a resolver).
    • Crea constructor para la nueva clase, que llame al constructor de la clase padre.
    • Sobrescribe el método toString () en la superclase para que muestre el número y el saldo del
    móvil.
    • Añade una nueva subclase de MovilPrepago llamada MovilTarifaPlana ̧ en la que se redefine el
    método navegar para no reducir el saldo y además en el constructor fija el coste de navegación
    a cero.
    • Haz un programa que cree una instancia de MovilPrepago, otra de MovilPlus y otra de
    MovilTarifaPlana, y realicen diversas operaciones sobre los mismos: llamar, navegar, videollamar,
    etc. mostrando como se reduce su saldo con el nuevo método toString () */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float cEL = 0.10f; float cML = 0.03f; float cMB = 0.04f; float s = 20; 
        MovilPrepago mp = new MovilPrepago(987532895, cEL, cML, cMB, s);
        MovilPlus mplus = new MovilPlus(632576234, cEL, cML, cMB, s);
        MovilTarifaPlana mtp = new MovilTarifaPlana(643863225, cEL, cML, cMB, s);
        boolean salir = false;
        boolean salirmovil = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    do {
                    int opcionMP = MenuMovil();
                    switch (opcionMP) {
                        case 1:
                            System.out.println("Introduzca los segundos de llamada (entero)");
                            int segundos = t.nextInt();
                            mp.efectuarLlamada(segundos);
                        break;
                        case 2:
                            System.out.println("Introduza los mb para navegar (entero)");
                            int mb = t.nextInt();
                            mp.navegar(mb);
                        break;
                        case 3:
                            System.out.println("Introduzca el saldo a recargar (entero)");
                            int importe = t.nextInt();
                            mp.recargar(importe);
                        break;
                        case 4:
                            mp.toString();
                        break;
                        case 0:
                            salirmovil = true;
                        break;
                    }}while(!salirmovil);
                break;
                case 2:
                    do {
                        int opcionMP = MenuMovilPlus();
                        switch (opcionMP) {
                            case 1:
                                System.out.println("Introduzca los segundos de llamada (entero)");
                                int segundos = t.nextInt();
                                mplus.efectuarLlamada(segundos);
                            break;
                            case 2:
                                System.out.println("Introduzca los segundos de videollamada");
                                float segundosv = t.nextFloat();
                                mplus.Videollamada(segundosv);
                            break;
                            case 3:
                                System.out.println("Introduza los mb para navegar (entero)");
                                int mb = t.nextInt();
                                mplus.navegar(mb);
                            break;
                            case 4:
                                System.out.println("Introduzca el saldo a recargar (entero)");
                                int importe = t.nextInt();
                                mplus.recargar(importe);
                            break;
                            case 5:
                                mplus.toString();
                            break;
                            case 0:
                                salirmovil = true;
                            break;
                    }}while(!salirmovil);
                break;
                case 3:
                    do {
                        int opcionMP = MenuMovil();
                        switch (opcionMP) {
                            case 1:
                                System.out.println("Introduzca los segundos de llamada (entero)");
                                int segundos = t.nextInt();
                                mtp.efectuarLlamada(segundos);
                            break;
                            case 2:
                                System.out.println("Introduza los mb para navegar (entero)");
                                int mb = t.nextInt();
                                mtp.navegar(mb);
                            break;
                            case 3:
                                System.out.println("Introduzca el saldo a recargar (entero)");
                                int importe = t.nextInt();
                                mtp.recargar(importe);
                            break;
                            case 4:
                                mtp.toString();
                            break;
                            case 0:
                                salirmovil = true;
                            break;
                    }}while(!salirmovil);
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
        System.out.println("Elija un Móvil para gestionar:");
        System.out.println("1 Móvil de Prepago");
        System.out.println("2 Móvil Plus");
        System.out.println("3 Móvil de Tarifa Plana");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }
    private static int MenuMovil() {
        Scanner t = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("Elija una acción:");
        System.out.println("1 Efectuar llamada");
        System.out.println("2 Navegar");
        System.out.println("3 Recargar saldo");
        System.out.println("4 Consultar saldo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
    private static int MenuMovilPlus() {
        Scanner t = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("Elija una acción:");
        System.out.println("1 Efectuar llamada");
        System.out.println("2 Efectuar videollamada");
        System.out.println("3 Navegar");
        System.out.println("4 Recargar saldo");
        System.out.println("5 Consultar saldo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }
}
