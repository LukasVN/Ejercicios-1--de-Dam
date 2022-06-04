import java.util.Scanner;

public class Figura2D_V6 {
    protected float ancho;
    protected float alto;
    public Figura2D_V6() {
        this.ancho = 0;
        this.alto = 0;
    }
    public Figura2D_V6(float valorAA) {
        this.alto = valorAA;
        this.ancho = valorAA;
    }
    public void SetAncho(){
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el ancho de la figura");
        ancho = t.nextFloat();
    }
    public void SetAlto(){
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el alto de la figura");
        alto = t.nextFloat();
    }
    public float getAncho(){
        return ancho;
    }
    public float getAlto(){
        return alto;
    }
    public String verDim(){
        return "Ancho: "+ancho+" Alto: "+alto;
    }
}
