import java.util.Scanner;

public class Ej07 {
    /*
     * Implementar una clase llamada Circulo, que tiene solo la propiedad radio y
     * los métodos
     * setRadio, getRadio, calcularCircunferencia, calcularSuperficie,
     * calcularDiametro además de un
     * constructor. Crea un programa que use esta clase creando un par de círculos y
     * usando los métodos
     * creados. ¿El atributo radio puede ser privado?
     * RESPUESTA: Si, el radio puede ser privado.
     */
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;
        float radio1 =0,radio2=0;
        Circulo circulo = new Circulo(radio1);
        Circulo circulo2 = new Circulo(radio2);
        Circulo CirculoActual = circulo;
        
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    CirculoActual.setRadio();
                case 2:
                    System.out.println("El radio del círculo es: "+CirculoActual.getRadio());;
                    break;
                case 3:
                    System.out.println("La Circunferencia del círculo es: "+CirculoActual.calcularCircunferencia());
                    break;
                case 4:
                    System.out.println("La Superficie del círculo es: "+CirculoActual.calcularSuperficie());
                    break;
                case 5:
                    System.out.println("El Diámetro del círculo es: "+CirculoActual.calcularDiametro());
                    break;
                case 6:
                    if (CirculoActual == circulo) {
                        CirculoActual = circulo2;
                    }
                    else {
                        CirculoActual = circulo;
                    }
                    System.out.println("El Circulo actual ha cambiado");
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
        System.out.println("1 Establecer radio");
        System.out.println("2 Comprobar radio");
        System.out.println("3 Calcular Circunferencia");
        System.out.println("4 Calcular Superficie");
        System.out.println("5 Calcular Diametro");
        System.out.println("6 Cambiar Circulo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
}
