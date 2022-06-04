public class Triangulo_V2 extends Figura2D_V2{
    String estilo;
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
