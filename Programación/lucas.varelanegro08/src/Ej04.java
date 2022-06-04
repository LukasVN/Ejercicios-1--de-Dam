import java.util.Scanner;

public class Ej04 {
    /* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v4) y realiza los
    siguientes cambios:
    • Añade un constructor a la clase Figura2D al que se le pasan dos parámetros: alto y ancho.
    ¿Funciona ahora el constructor de Triangulo (creado en el ejercicio anterior)? ¿Por qué?
    • Reescribe el constructor de Triangulo creado en el ejercicio anterior para que haga uso del nuevo
    constructor de la clase base.
    • Comprueba que el programa creado en el ejercicio anterior sigue funcionando.
    • Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que sigue
    funcionando. */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String estilo = ""; float ancho = 0; float alto = 0;
        // Se piden los lados del triángulo para poder calcular el Estilo con exactitud.
        System.out.println("Introduce el valor del lado1: "); float lado1 = t.nextFloat();
        System.out.println("Introduce el valor del lado1: "); float lado2 = t.nextFloat();
        Triangulo_V4 triangulo = new Triangulo_V4(estilo,lado1,lado2,ancho,alto);
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1:
                System.out.println("Introduce el lado1 del triángulo");
                lado1 = t.nextFloat();
                System.out.println("Introduce el lado2 del triángulo");
                lado2 = t.nextFloat();
                triangulo = new Triangulo_V4(estilo,lado1,lado2,ancho,alto);
                    break;
                case 2:
                    System.out.println(triangulo.verDim()+" Lado1: "+lado1+" Lado2: "+lado2);
                    break;
                case 3:
                    System.out.println(triangulo.Area());
                    break;
                case 4:
                    System.out.println(triangulo.VerEstilo(lado1, lado2));
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
        System.out.println("1 Cambiar valores del triángulo");
        System.out.println("2 Ver dimensiones del triángulo");
        System.out.println("3 Ver área del triángulo");
        System.out.println("4 Ver estilo del triángulo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
}
