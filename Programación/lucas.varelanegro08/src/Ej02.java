import java.util.Scanner;

public class Ej02 {
    /* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v2) y realiza los
    siguientes cambios:
    • Ahora los atributos ancho y alto serán privados.
    • Añade los métodos getter y setter para ambos atributos.
    • Modifica la clase Triangulo obligados por los cambios en su clase padre.
    • Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que el
    programa creado en el ejercicio anterior sigue funcionando. */
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        Triangulo_V2 triangulo = new Triangulo_V2();
        boolean salir = false; float lado1 = 0; float lado2= 0;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1:
                triangulo.SetAncho();
                triangulo.SetAlto();
                // Se piden los lados del triángulo para poder calcular el Estilo con exactitud.
                System.out.println("Introduce el lado1 del triángulo");
                lado1 = t.nextFloat();
                System.out.println("Introduce el lado2 del triángulo");
                lado2 = t.nextFloat();
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
        System.out.println("1 Introducir valores del triángulo");
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
