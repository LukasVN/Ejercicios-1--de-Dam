import java.util.Scanner;

public class Ej01 {
    /* Realiza las siguientes operaciones:
        • Crea una clase llamada Figura2D con atributos numéricos con decimales y públicos: ancho y alto
        y un método verDim que muestre por consola el alto y el ancho en una sola línea, con dos
        decimales.
        • Define una clase llamada Triángulo que es hija de Figura2D y añádele una cadena llamada estilo
        (vale: isósceles, rectángulo, equilátero, etc.), un método llamado área que devuelva la superficie
        del triángulo y un último método llamado verEstilo que muestre por consola el valor del atributo
        estilo.
        • Finalmente hacer un programa que cree un triángulo, asigne valores a sus atributos y use los
        métodos para ver sus dimensiones, estilo y área. */
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        boolean salir = false; float lado1 = 0; float lado2= 0;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1:
                System.out.println("Introduce el ancho del triángulo");
                triangulo.ancho = t.nextFloat();
                System.out.println("Introduce el alto del triángulo");
                triangulo.alto = t.nextFloat();
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

