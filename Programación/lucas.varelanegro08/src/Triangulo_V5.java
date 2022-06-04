import java.util.Scanner;

public class Triangulo_V5 extends Figura2D_V5{
    Scanner t = new Scanner(System.in);
    String estilo;
    public Triangulo_V5(String estilo,float ancho,float alto) {
        SetAncho(); ancho = getAncho();
        SetAlto(); alto = getAlto();
        System.out.println("Introduce el estilo del triángulo");
        this.estilo = t.nextLine();
    }
    public Triangulo_V5() {
        estilo = null;
    }
    public Triangulo_V5(float valor) {
        super(valor);
        estilo = "IgualBaseAltura";
    }
    public float Area() {
        return (getAncho()*getAlto())/2;
    }
}
