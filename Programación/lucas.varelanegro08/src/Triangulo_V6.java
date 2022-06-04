import java.util.Scanner;

public class Triangulo_V6 extends Figura2D_V6{
    Scanner t = new Scanner(System.in);
    String estilo;
    public Triangulo_V6(String estilo,float ancho,float alto) {
        SetAncho(); ancho = getAncho();
        SetAlto(); alto = getAlto();
        System.out.println("Introduce el estilo del triángulo");
        this.estilo = t.nextLine();
    }
    public Triangulo_V6() {
        estilo = null;
    }
    public Triangulo_V6(float valor) {
        super(valor);
        estilo = "IgualBaseAltura";
    }
    public float Area() {
        return (getAncho()*getAlto())/2;
    }
}
