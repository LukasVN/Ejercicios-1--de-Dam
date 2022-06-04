import java.util.ArrayList;

public class Ej08 {
    /* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v8) y realiza los
    siguientes cambios:
    • Añadir a la clase Figura2D_v8 un atributo privado llamado nombre de tipo String.
    • Añadir el getter/setter de ese campo y modificar los constructores de dicha clase para incorporar
    como parámetro el nombre de la figura (en el constructor por defecto se le asignará valor null).
    • Modificar la clase hija y nieta para incluir el nombre en constructores.
    • Crear una nueva clase hija de Figura2D_v8 llamada Rectangulo_v8 con constructor con tres
    parámetros (alto, ancho, nombre), constructor con un dos parámetros (alto igual a ancho y
    nombre) y un método que devuelve boolean llamado esCuadrado().
    • Hacer un programa que cree un ArrayList con 4 rectángulos, algunos cuadrados y otros no, y
    cuente cuantos hay cuadrados. */
    public static void main(String[] args) {
        ArrayList<Rectangulo_V8> rectangulos = new ArrayList<>();
        String nombre = ""; float ancho = 0; float alto = 0; float valor = 0; int cont = 0;
        System.out.println("Rectangulo 1");
        Rectangulo_V8 rect1 = new Rectangulo_V8(nombre, ancho, alto);
        rectangulos.add(rect1);
        System.out.println("Rectangulo 2");
        if (rect1.EsCuadrado(rect1.ancho, rect1.alto)) {cont++;}
        Rectangulo_V8 rect2 = new Rectangulo_V8(valor, nombre);
        rectangulos.add(rect2);
        if (rect2.EsCuadrado(rect2.ancho, rect2.alto)) {cont++;}
        System.out.println("Rectangulo 3");
        Rectangulo_V8 rect3 = new Rectangulo_V8(valor, nombre);
        rectangulos.add(rect3);
        if (rect3.EsCuadrado(rect3.ancho, rect3.alto)) {cont++;}
        System.out.println("Rectangulo 4");
        Rectangulo_V8 rect4 = new Rectangulo_V8(nombre, ancho, alto);
        if (rect4.EsCuadrado(rect4.ancho, rect4.alto)) {cont++;}
        System.out.println("Hay "+cont+" cuadrados");
    }
}
