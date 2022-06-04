public class TrianColor_V6 extends Triangulo_V6{
    static String color;
    public TrianColor_V6(String color, float ancho, float alto, String estilo) {
        super(estilo, ancho, alto);
        System.out.println("Introduzca el color de su triángulo: ");
        SetColor(); color = GetColor();
    }
    public void SetColor() {
        color = t.nextLine();
    }
    public static String GetColor() {
        return color;
    }
}
