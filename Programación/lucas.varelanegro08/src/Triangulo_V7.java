import java.util.Scanner;

public class Triangulo_V7 extends Figura2D_V7{
    Scanner t = new Scanner(System.in);
    String estilo;
    public Triangulo_V7(String estilo,float ancho,float alto) {
        SetAncho(); this.ancho = getAncho();
        SetAlto(); this.alto = getAlto();
        System.out.println("Introduce el estilo del triángulo");
        this.estilo = t.nextLine();
    }
    public Triangulo_V7() {
        estilo = null;
    }
    public Triangulo_V7(float valor) {
        super(valor);
        estilo = "IgualBaseAltura";
    }
    public Triangulo_V7(Triangulo_V7 triangulo) {
        this.alto = triangulo.alto;
        this.ancho = triangulo.ancho;
    }
    public float Area() {
        return (getAncho()*getAlto())/2;
    }
}
