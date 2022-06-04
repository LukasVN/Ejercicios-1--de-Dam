import java.util.Scanner;

public class Triangulo_V8 extends Figura2D_V8{
    Scanner t = new Scanner(System.in);
    String estilo;
    public Triangulo_V8(String estilo,float ancho,float alto,String nombre) {
        SetNombre();
        nombre = getNombre();
        SetAncho(); this.ancho = getAncho();
        SetAlto(); this.alto = getAlto();
        this.estilo = t.nextLine();
    }
    public Triangulo_V8() {
        estilo = null;
    }
    public Triangulo_V8(float valor) {
        super(valor);
        estilo = "IgualBaseAltura";
    }
    public Triangulo_V8(Triangulo_V7 triangulo) {
        this.alto = triangulo.alto;
        this.ancho = triangulo.ancho;
    }
    @Override
    public void SetAlto() {
        super.SetAlto();
    }
    @Override
    public void SetAncho() {
        super.SetAncho();
    }
    public float Area() {
        return (getAncho()*getAlto())/2;
    }
}

