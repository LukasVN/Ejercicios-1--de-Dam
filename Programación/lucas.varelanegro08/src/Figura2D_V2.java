import java.util.Scanner;

public class Figura2D_V2 {
    private float ancho;
    private float alto;

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
