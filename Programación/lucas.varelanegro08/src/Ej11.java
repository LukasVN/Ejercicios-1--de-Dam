import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ej11 {
    /* Usando las clases del ejercicio anterior, haz un programa que cree un ArrayList de teléfonos de tipo
    MovilPlus. Inserta varios teléfonos y luego prueba el método remove () pasándole como parámetro un
    objeto de tipo MovilPlus. ¿Funciona? Modifica la clase con los cambios necesarios para que funcione
    (haciendo una nueva versión). */
    public static void main(String[] args) {
        ArrayList<MovilPlus> moviles = new ArrayList<MovilPlus>();
        System.out.println("Añadiendo telefonos");
        MovilPlus mp1 = new MovilPlus(673532523, 0.05f, 0.03f, 0.04f, 20);
        MovilPlus mp2 = new MovilPlus(673532524, 0.05f, 0.03f, 0.04f, 20);
        MovilPlus mp3 = new MovilPlus(673532525, 0.05f, 0.03f, 0.04f, 20);
        MovilPlus mp4 = new MovilPlus(673532526, 0.05f, 0.03f, 0.04f, 20);
        MovilPlus mp5 = new MovilPlus(673532527, 0.05f, 0.03f, 0.04f, 20);
        moviles.add(mp1);
        moviles.add(mp2);
        moviles.add(mp3);
        moviles.add(mp4);
        moviles.add(mp5);
        System.out.println("Borrando telefonos");
        moviles.remove(mp1);
        moviles.remove(mp2);
        moviles.remove(mp3);
        moviles.remove(mp4);
        moviles.remove(mp5);

    }
}
