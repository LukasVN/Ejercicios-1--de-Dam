import java.util.Scanner;
public class Figura2D_V4 {
    protected static float ancho;
    protected static float alto;

    public Figura2D_V4(float ancho, float alto) {
        System.out.println("Introduzca el ancho de la figura");
        SetAncho();
        System.out.println("Introduzca el alto de la figura:");
        SetAlto();
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
    public static float getAncho(){
        return ancho;
    }
    public static float getAlto(){
        return alto;
    }
    public String verDim(){
        return "Ancho: "+ancho+" Alto: "+alto;
    }
}
