import java.util.Scanner;

public class Ej07 {
    /* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v7) y realiza los
    siguientes cambios:
    • Figura2D_v7 tendrá un nuevo constructor, que recibe como parámetro otro objeto de tipo
    Figura2D_v7 y que copiará todos sus datos.
    • Hacer otro constructor análogo para la clase Triangulo_v7.
    • Hay un programa que cree un Triangulo_v7 con el constructor de 3 parámetros creado
    previamente, y otro triángulo utilizando el nuevo constructor. Mostrar el área de ambos. */
public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    String estilo = ""; float ancho = 0; float alto = 0;
    Triangulo_V7 triangulo1 = new Triangulo_V7(estilo, ancho, alto);
    Triangulo_V7 triangulo2 = new Triangulo_V7(triangulo1);
    System.out.println("Área triángulo1: "+triangulo1.Area()+"| Área triángulo2: "+triangulo2.Area());
    }
}
