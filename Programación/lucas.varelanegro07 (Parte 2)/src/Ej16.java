import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej16 {
    /* Realizar un programa al que se le vayan introduciendo por teclado números enteros. El programa
    dispone de dos ArrayList, uno llamado positivos y otro negativos. 
    Se trata de meter los números introducidos en uno u otro según su signo hasta que finalice el programa (esto ocurrirá cuando se introduzca cero).
    Al finalizar, mostrará la media aritmética de cada ArrayList. */
    public static void main(String[] args) {
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca un valor entero:");
        int num = t.nextInt(); float media1=0; float media2=0;
        while(num != 0) {
            if (num > 0) {
                positivos.add(num);
                media1+=num;
            }
            else if (num < 0) {
                negativos.add(num);
                media2+=num;
            }
            System.out.println("Introduzca un valor entero (0 para finalizar):");
            num = t.nextInt();
        }
        System.out.println("Media positivos: "+media1/positivos.size());
        System.out.println("Media negativos: "+media2/negativos.size());
    }
}

