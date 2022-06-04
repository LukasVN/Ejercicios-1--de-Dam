import java.util.Scanner;

public class Ej06 {
    /* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v6) y realiza los
    siguientes cambios:
    • Crea una nueva clase TrianColor_v6, hija de la clase Triángulo_v6 que incluye un nuevo atributo
    privado de tipo String llamado color.
    • Esta nueva clase tiene un constructor de 4 parámetros (alto, ancho, estilo, color), además del getter
    y setter de color.
    • Haz un nuevo programa que cree un triángulo de color y llame a métodos definidos en sus clases
    base. */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String estilo = ""; float valor = 0; String color = ""; float ancho = 0; float alto = 0;
        Triangulo_V6 triangulo = new TrianColor_V6(color, ancho, alto, estilo);
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: 
                    System.out.println("Introduzca el valor para el alto y el ancho:");
                    valor = t.nextFloat();
                    triangulo = new Triangulo_V6(valor);
                    break;
                case 2:
                    System.out.println(triangulo.verDim());
                    break;
                case 3:
                    System.out.println(triangulo.Area());
                    break;
                case 4:
                    triangulo = new Triangulo_V6();
                    break;
                case 5:
                    triangulo = new Triangulo_V6(estilo, ancho, alto);
                    break;
                case 6:
                    System.out.println("Estilo: "+triangulo.estilo+"| Color: "+TrianColor_V6.GetColor());
                    break;
                case 7:
                System.out.println("Introduzca el nuevo color del triángulo: ");
                    ((TrianColor_V6) triangulo).SetColor();
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
        System.out.println("1 Establecer mismo valores para ancho y alto");
        System.out.println("2 Ver dimensiones del triángulo");
        System.out.println("3 Ver área del triángulo");
        System.out.println("4 Restablecer valor Ancho y Alto");
        System.out.println("5 Establecer valores del triángulo");
        System.out.println("6 Ver estilo y color");
        System.out.println("7 Cambiar color triángulo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
}

