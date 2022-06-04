import java.util.Scanner;

public class Rectangulo_V8 extends Figura2D_V8{
Scanner t = new Scanner(System.in);
    public Rectangulo_V8(String nombre, float ancho, float alto) {
        SetNombre(); nombre = getNombre();
        SetAlto(); this.alto = getAlto();
        SetAncho(); this.ancho = getAncho();
    }
    public Rectangulo_V8(float valor,String nombre) {
        super(valor);
        System.out.println("Introduce un valor para la figura");
        valor = t.nextFloat();
        SetNombre(); nombre = getNombre();
    }
    public boolean EsCuadrado(float ancho,float alto){
        if(alto == ancho){
            return true;
        }
        else {
            return false;
        }
    }
}
