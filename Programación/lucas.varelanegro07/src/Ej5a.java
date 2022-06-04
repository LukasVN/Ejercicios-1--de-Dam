import java.util.Scanner;

public class Ej5a {
    /*
     * Realizar una clase Primitiva que tenga definido un Array privado de 6
     * elementos con el resultado de un sorteo de la primitiva (serán 6 enteros con valores comprendidos entre 1 y 49
     * y sin repetidos). 
     * La clase dispondrá de un constructor en el que se generan y almacenen esos números al azar, también tendrá un método al
     * que se le pase una combinación jugada como parámetro (no necesariamente ordenada) y devuelva el número de aciertos. 
     * Realiza tres programas distintos que usen esa clase:
     * a) Programa que el usuario introduzca los 6 números de su boleto y le diga
     * cuantos acertó.
     * b) Programa en el que se generen 1000 boletos al azar y nos informe de cuantos
     * boletos hay con 3, 4, 5 y 6 aciertos (a lo mejor es necesario crear un nuevo método en la clase Primitiva para generar boletos al azar).
     * c) Programa con un bucle que genere boletos hasta que acierte los 6 números
     * ¿Cuántos boletos has tenido que crear?
     */

    // a)
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        String[] num_intento = {"Primer","Segundo","Tercer","Cuarto","Quinto","Sexto"};
        int[] intento = new int[6];
        Primitiva prim = new Primitiva();

        System.out.println("Introduzca 6 números entre 1 y 49 [Sin repetirse]");
        for (int i=0; i<intento.length;i++) {
            System.out.println(num_intento[i]+" número:");
            intento[i] = t.nextInt();
            while (intento[i] > 49 || intento[i] < 1) {
                System.out.println("Numero erróneo, introduzca de nuevo el "+num_intento[i]+" número");
                intento[i] = t.nextInt();
            }

            for (int y = 0; y < i; y++) {
                while (intento[i] == intento[y]) {
                    System.out.println("Numero repetido, introduzca de nuevo el "+num_intento[i]+" número");
                    intento[i] = t.nextInt();
                    y = 0;
                }
            }
        }
        System.out.println("Usted ha acertado "+prim.Intento(intento)+" números");
        
        
        

    }
}

