import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        /*
         * Realizar un programa en el que el usuario introduzca un texto y sustituya sus
         * posiciones impares por asteriscos, por ejemplo: “abcdefg” cambie las
         * posiciones impares pasaría a: “a*c*e*g”.
         */
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String lectura = t.nextLine();
        StringBuilder texto = new StringBuilder(lectura);
        
        for (int i=1; i<texto.length(); i+=2){
                texto.deleteCharAt(i);
                texto.insert(i, "*");
        }
        System.out.println(texto);
        t.close();
    }
}
