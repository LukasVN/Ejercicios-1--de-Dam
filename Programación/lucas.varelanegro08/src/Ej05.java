import java.util.Scanner;

public class Ej05 {
    /* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v5) y realiza los
    siguientes cambios:
    • Añade un constructor más a la clase Figura2D, a este se le pasa solo un parámetro que se le asigna
    tanto al alto como al ancho (figura igual alto que ancho).
    • Hacer el constructor sin parámetros (ya no se crea por defecto) en este caso tanto alto como
    ancho igual a cero.
    • Añade a la clase Triangulo también un constructor sin parámetros, que invoque al constructor sin
    parámetros de la clase base (aunque se hace por defecto) y que ponga el estilo a null.
    • Añade otro constructor a la clase Triangulo, con un solo parámetro, para aquellos que tienen igual
    alto que ancho (en este caso el estilo será ‘igualBaseAltura’).
    • Haz un programa similar a los de ejercicios anteriores pero que use las nuevas características
    incorporadas en este ejercicio */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String estilo = ""; float valor = 0;
        Triangulo_V5 triangulo = new Triangulo_V5();
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: 
                    System.out.println("Introduzca el valor para el alto y el ancho:");
                    valor = t.nextFloat();
                    triangulo = new Triangulo_V5(valor);
                    break;
                case 2:
                    System.out.println(triangulo.verDim());
                    break;
                case 3:
                    System.out.println(triangulo.Area());
                    break;
                case 4:
                    triangulo = new Triangulo_V5();
                    break;
                case 5:
                    float ancho = 0; float alto = 0;
                    triangulo = new Triangulo_V5(estilo, ancho, alto);
                    break;
                case 6:
                    System.out.println("Estilo: "+triangulo.estilo);
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
        System.out.println("6 Ver estilo");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
}

