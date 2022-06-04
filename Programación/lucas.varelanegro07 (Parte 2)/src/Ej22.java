import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ej22 {
    /* Realizar un programa que genere 10.000 números aleatorios entre 1 y 6 (como si fuese lanzar un dado).
    Guarda los resultados obtenidos, esto es, cuantas veces ha salido el uno, cuantas veces ha salido el dos, etc... para
    finalmente mostrar la diferencia de veces entre el número que más ha salido y el que menos ha salido. */
    public static void main(String[] args) {
        ArrayList<Integer> tiradas = new ArrayList<>();
        int mayor = 0; int menor = 10000;
        for(int i= 0; i<10000;i++) {
            Random r = new Random();
            int num = r.nextInt(7-1)+1;
            tiradas.add(num);
            }
        for(int i= 1; i<=6;i++) {
            if(Collections.frequency(tiradas, i) > mayor) {
                mayor = Collections.frequency(tiradas, i);
            }
            else if (Collections.frequency(tiradas, i) < menor) {
                menor = Collections.frequency(tiradas, i);
            }
        }
        System.out.println("Diferencia de veces entre el número que más ha salido y el que menos: "+(mayor-menor));
        }
    }
    
