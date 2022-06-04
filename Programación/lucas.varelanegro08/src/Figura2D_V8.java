import java.util.Scanner;

public class Figura2D_V8 {
    protected float ancho;
    protected float alto;
    private static String nombre;
    public Figura2D_V8() {
        this.ancho = 0;
        this.alto = 0;
        nombre = null;
    }
    public Figura2D_V8(float valorAA) {
        this.alto = valorAA;
        this.ancho = valorAA;
    }
    public Figura2D_V8(Figura2D_V8 figura) {
        figura.alto = alto;
        figura.ancho = ancho;
    }
    public void SetNombre(){
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la figura");
        nombre = t.nextLine();
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
    public static String getNombre(){
        return nombre;
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
