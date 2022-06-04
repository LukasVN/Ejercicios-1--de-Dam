import java.util.Scanner;

public class Ej02 {
    /* Programa que presente un menú y permita calcular repetidas veces a) el área de círculo –necesitará el
    radio- , b) el área de cuadrado –necesitará el lado - , c) el área de triángulo –necesitará base y altura – d) Salir. Usar
    funciones para cada una de las 3 opciones. */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        char letra;
        do {
        double radioc =0, ladoc = 0, baset = 0, alturat= 0;


        System.out.println("Escriba la letra para la acción que desea realizar: ");
        System.out.println("A. Calcular el área de un círculo: ");
        System.out.println("B. Calcular el área de un cuadrado: ");
        System.out.println("C. Calcular el área de un triángulo: ");
        System.out.println("D. Salir: ");
        letra = t.next().charAt(0);
        letra = Character.toLowerCase(letra); 

        if (letra == 'a') {
            areacirculo(radioc);
            System.out.println("------------------------------------------");
        }
        else if (letra == 'b') {
            areacuadrado(ladoc);
            System.out.println("------------------------------------------");
        }
        else if (letra == 'c') {
            areatriangulo(baset, alturat);
            System.out.println("------------------------------------------");
        }
        else if (letra == 'd') {
            System.out.println("-------------Progama finalizado-------------");
        }
        }
        while (letra != 'd');
        
        
    }
    public static  double areacirculo(double radio) {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo");
        radio = t.nextDouble();
        System.out.println("El área del círculo es: "+(Math.PI)*(Math.pow(radio, 2)));
        return radio;
    }
    public static double areacuadrado(double ladocuadrado) {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado: ");
        ladocuadrado = t.nextDouble();
        System.out.println("El área del cuadrado es: "+Math.pow(ladocuadrado, 2));
        return ladocuadrado;
    }
    public static double areatriangulo(double basetriangulo, double alturatriangulo) {
        Scanner t = new Scanner(System.in);
        double areat;
        System.out.println("Introduce la base del triángulo: ");
        basetriangulo = t.nextDouble();
        System.out.println("Introduce la altura del triángulo: ");
        alturatriangulo = t.nextDouble();
        areat = (basetriangulo*alturatriangulo)/2;
        System.out.println("El área del triángulo es: "+areat);
        return areat;
    }
}
