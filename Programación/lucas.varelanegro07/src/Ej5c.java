public class Ej5c {
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

    // c)
    public static void main(String[] args) throws Exception {
        Primitiva prim = new Primitiva();
        int cont = 0; int[] boleto; int aciertos;
        do {
            boleto = prim.Boleto_random();
            cont++;
            aciertos = prim.Intento(boleto);
        }while (aciertos != 6);

        System.out.println(cont+" intentos para sacar un boleto de 6 aciertos");

    }
}
