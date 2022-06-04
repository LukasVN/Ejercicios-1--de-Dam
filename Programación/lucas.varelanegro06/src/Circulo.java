import java.util.Scanner;
public class Circulo {
    private float radio;

public Circulo(float r){
    radio = r;
}

public void setRadio(){
    Scanner t = new Scanner(System.in);
    System.out.println("Introduzca el radio del círculo: ");
    radio = t.nextFloat();
}
public float getRadio(float r){
    return radio;
}
public float calcularCircunferencia(){
    float circunferencia = (float) (2*Math.PI*radio);
    return circunferencia;
}
public float calcularSuperficie() {
    float superficie = (float) Math.pow((2*Math.PI*radio), 2f);
    return superficie;
}
public float calcularDiametro(){
    float diametro = radio*2;
    return diametro;
}
}
