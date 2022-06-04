public class Triangulo extends Figura2D{
    String estilo;
    public float Area() {
        return (ancho*alto)/2;
    }
    public String VerEstilo(float lado1,float lado2) {
        if(lado1 == lado2 && lado1 == ancho) {
            estilo = "Equilátero";
            return estilo;
        }
        else if(lado1 == lado2|| lado1 == ancho|| lado2 == ancho) {
            estilo = "Isósceles";
            return estilo;
        }
        else if (Math.pow(lado1, 2)+Math.pow(lado2, 2) == Math.pow(ancho, 2)){
            estilo = "Rectángulo";
            return estilo;
        }
        else {
            estilo = "Escaleno";
            return estilo;
        }

    }
}
