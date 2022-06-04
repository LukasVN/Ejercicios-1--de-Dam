import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej17a {
    /* Realiza una clase llamada Primitiva2 similar a la clase Primitiva, pero empleando ahora una ArrayList,
    y aprovechando los métodos de los que dispone para simplificar la generación de números sin repetidos. Además,
    los números premiados se mantendrán ordenados y, por último, la búsqueda de los números jugados en el ArrayList
    de los premiados se requiere que se haga de forma dicotómica. Rehacer los 3 programas del ejercicio anterior de la
    Primitiva pero usando esta nueva clase.
    a) Programa que el usuario introduzca los 6 números de su boleto y le diga cuantos acertó.
    b) Programa en el que se generen 1000 boletos al azar y nos informe de cuantos boletos hay con 3, 4, 5
        y 6 aciertos (a lo mejor es necesario crear un nuevo método en la clase Primitiva para generar
        boletos al azar).
    c) Programa con un bucle que genere boletos hasta que acierte los 6 números ¿Cuántos boletos has
        tenido que crear?*/
    public static void main(String[] args) { // a)
        Scanner t = new Scanner(System.in);
        Primitiva2 p = new Primitiva2();
        List<Integer> boleto = new ArrayList<>();
        for(int i= 0; i<6;i++) {
            int num_boleto = i+1;
            System.out.println("Introduce el número "+num_boleto+" del boleto");
            int num = t.nextInt();
            while(boleto.contains(num) | num<0 | num>49) {
                System.out.println("Valor incorrecto/repetido, introduzca otro número");
                num = t.nextInt();
            }
            boleto.add(num);
        }
        System.out.println("Has tenido un total de "+p.Intento(boleto)+" aciertos");
    }
}

