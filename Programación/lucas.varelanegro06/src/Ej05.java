import java.util.Scanner;

public class Ej05 {
    /*
     * A partir de la clase Ahorcado que te proporcionará el profesor, crea un
     * programa que permita
     * al usuario jugar al ahorcado. Desconocemos los atributos de la clase Ahorcado
     * ya que son privados,
     * pero sus métodos públicos son:
     * - Constructor(String txtAdivinar, String txtPista). Crea el juego con la
     * frase a adivinar y con un texto de pista
     * para el jugador.
     * - Constructor(String txtAdivinar). Crea el juego con la frase a adivinar, sin
     * pistas.
     * - boolean probarLetra (char x). Comprueba si la letra pasada como parámetro
     * está en la frase a adivinar, en
     * caso afirmativo, devuelve true ̧ sino false.
     * - boolean adivinada(). Devuelve true si se ha adivinado la frase, false en
     * caso contrario.
     * - boolean perdio(). Devuelve true si se ha llegado al número máximo de
     * intentos sin adivinar la frase, false en
     * caso contrario.
     * - char leerLetra (). Pide al usuario por consola una letra y devuelve dicha
     * letra.
     * - void pintar (). Dibuja un “tablero” en la consola, con el estado del juego
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String txtadivinar;
        int intentos = 0;

        System.out.println("Introduzca la frase para adivinar: ");
        txtadivinar = t.nextLine();

        Ahorcado juego = new Ahorcado(txtadivinar);

        juego.pintar();
        while (juego.adivinada() == false && juego.perdio() == false) {
            char letra = juego.leerLetra();
            juego.probarLetra(letra);
            juego.pintar();    
        }

    }
}
