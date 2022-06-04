import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        /*
         * Realizar un programa al que se le introduzca una cadena por teclado, que la
         * convierta a StringBuilder, y aplicando métodos de esa clase, haga lo
         * siguiente: 
         * a. Borrar el carácter que haya en la posición 3. 
         * b. Insertar una ‘x’ en la posición 5. 
         * c. Sustituir el carácter de la posición 1 por una ‘z’.
         * d. Borrar los caracteres entre la posición 5 y 10. 
         * e. Darles la vuelta a todos los caracteres del StringBuilder. 
         * f. Convertir el StringBuilder en cadena.
         */
        Scanner t = new Scanner(System.in);
        String cad;

        System.out.println("Introduzca una cadena de al menos 10 posiciones: ");
        cad = t.nextLine();
        StringBuilder build = new StringBuilder(cad);
        
        System.out.println("a.");
        System.out.println("Resultado: "+build.deleteCharAt(3));

        System.out.println("b.");
        System.out.println("Resultado: "+build.insert(5, 'x'));

        System.out.println("c.");
        System.out.println("Resultado: "+build.replace(1, 1, "z"));

        System.out.println("d.");
        System.out.println("Resultado: "+build.delete(5, 10));

        System.out.println("e.");
        System.out.println("Resultado: "+build.reverse());

        System.out.println("f.");
        cad = build.toString();
        System.out.println("Resultado: "+cad);
        t.close();
 
    }
}
