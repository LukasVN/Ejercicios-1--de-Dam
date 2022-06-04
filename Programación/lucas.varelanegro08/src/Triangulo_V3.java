import java.util.Scanner;

public class Triangulo_V3 extends Figura2D_V3{
    Scanner t = new Scanner(System.in);
    String estilo;
    float lado1; float lado2;
    public Triangulo_V3(String estilo, float alto, float ancho,float lado1, float lado2) {
        SetAlto(); alto = getAlto();
        SetAncho(); ancho = getAncho();
        this.estilo = VerEstilo(lado1, lado2);

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
    public String VerEstilo(float lado1,float lado2) {
        if(lado1 == lado2 && lado1 == getAncho()) {
            estilo = "Equilátero";
            return estilo;
        }
        else if(lado1 == lado2|| lado1 == getAncho()|| lado2 == getAncho()) {
            estilo = "Isósceles";
            return estilo;
        }
        else if (Math.pow(lado1, 2)+Math.pow(lado2, 2) == Math.pow(getAncho(), 2)){
            estilo = "Rectángulo";
            return estilo;
        }
        else {
            estilo = "Escaleno";
            return estilo;
        }

    }
}
