public class Ej5b {
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

    // b)
    public static void main(String[] args) throws Exception {
        Primitiva prim = new Primitiva();
        int cont3 = 0, cont4 = 0, cont5 = 0, cont6 =0;
        for(int i=0; i<1000;i++) {
            int[] boleto = prim.Boleto_random();
            switch (prim.Intento(boleto)) {
                case 3: cont3++;  break;
                case 4: cont4++;  break;
                case 5: cont5++;  break;
                case 6: cont6++;  break;
            }
        }
        System.out.println(+cont3+" boletos han tenido 3 aciertos");
        System.out.println(+cont4+" boletos han tenido 4 aciertos");
        System.out.println(+cont5+" boletos han tenido 5 aciertos");
        System.out.println(+cont6+" boletos han tenido 6 aciertos");
    }
}
