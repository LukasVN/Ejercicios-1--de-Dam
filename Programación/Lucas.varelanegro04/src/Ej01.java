import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        // Realizar un programa al que se le introduzca una cadena por teclado y haga lo
        // siguiente:
        Scanner t = new Scanner(System.in);
        String cadena = new String();

        System.out.println("Introduzca una cadena:");
        cadena = t.nextLine();
        String mayusculas = cadena.toUpperCase();
        String minusculas = cadena.toLowerCase();

        // Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y
        // minúsculas.
        System.out.println("a)");
        System.out.println("En mayúsculas ---> " + mayusculas);
        System.out.println("En minúsculas ---> " + minusculas);

        // Decir si en la cadena aparece el carácter ‘x’.
        System.out.println("b)");
        int posiscion = minusculas.indexOf('x');
        if (posiscion > -1) {
            System.out.println("La cadena contiene x");
        } else {
            System.out.println("La cadena no contiene x");
        }

        // Decir si la cadena tiene más de 10 posiciones.
        System.out.println("c)");
        if (cadena.length() > 10) {
            System.out.println("La cadena tiene más de 10 posiciones");
        } else {
            System.out.println("La cadena NO tiene más de 10 posiciones");
        }

        // Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
        System.out.println("d)");
        int longitud = cadena.length();
        if (cadena.length() >= 5) {
            if (longitud >= 5) {
                System.out.println("La cadena contiene x a partir de la 4ª posición");
            } else {
                System.out.println("La cadena NO contiene x a partir de la 4ª posición");
            }
        } else {
            System.out.println("Cadena con menos de 5 posiciones");
        }

        // Crear una cadena formada por las 5 primeras posiciones de la cadena.
        System.out.println("e)");
        if (cadena.length() >= 5) {
            String primeras = cadena.substring(0, 5);
            System.out.println("Las primeras 5 posiciones son: " + primeras);
        } else
            System.out.println("Cadena con menos de 5 posiciones");

        // Crear una cadena formada por las 5 últimas posiciones de la cadena.

        System.out.println("f)");
        if (cadena.length() >= 5) {
            String ultimas = cadena.substring(cadena.length() - 5, cadena.length());
            System.out.println("Las últimas 5 posiciones son: " + ultimas);
        } else
            System.out.println("Cadena con menos de 5 posiciones");

        // Decir si la cadena es igual a la cadena “hola”
        System.out.println("g)");
        String cadena2 = "hola";

        if (cadena.equalsIgnoreCase(cadena2)) {
            System.out.println("La cadena es igual a la cadena 'hola'");
        } else {
            System.out.println("La cadena NO es igual a la cadena 'hola'");
        }

        // Convertir la cadena a un número entero (puede ser negativo o positivo).
        System.out.println("h)");
        String cadenaentero = cadena;
        cadenaentero = String.valueOf(5);
        System.out.println("El valor de la cadena ahora es: " + cadenaentero);

        // Convertir la cadena a un número hexadecimal.
        System.out.println("i)");
        System.out.println("Introduzca un número hexadecimal");
        String cadHex = t.nextLine();
        int cadenahexadecimal = Integer.parseInt(cadHex, 16);
        System.out.println(cadenahexadecimal);
        t.close();
        // Si se encuentra en su interior con "prueva" sustituir por "prueba".
        System.out.println("j)");
        if (cadena.contains("prueva")) {
            String cadenaprueba = cadena.replaceAll("prueva", "prueba");
            System.out.println(cadenaprueba);
        } else
            System.out.println("La cadena no incluye la palabra prueva");

        // Decir si la primera posición de la cadena es igual a la última.
        System.out.println("k)");
        char posicion1 = cadena.charAt(0);
        char posicionfinal = cadena.charAt(cadena.length() - 1);
        if (posicion1 == posicionfinal) {
            System.out.println("La primera posición de la cadena es igual a la última");
        } else
            System.out.println("La primera posición de la cadena NO es igual a la última");

        // Decir cuántos digitos numéricos hay en la cadena.
        System.out.println("l)");
        int totaldigitos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char ch1 = cadena.charAt(i);
            if (Character.isDigit(ch1)) {
                totaldigitos++;
            }
        }
        System.out.println("Hay " + totaldigitos + " digitos en la cadena");

        // Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia
        // atrás)
        System.out.println("m)");
        boolean espalindromo = true;
        int reves = cadena.length() - 1;
        for (int i = 0; i < (cadena.length() / 2); i++) {
            char primera_mitad = cadena.charAt(i);
            char segunda_mitad = cadena.charAt(reves);
            reves--;
            if (primera_mitad != segunda_mitad) {
                espalindromo = false;
                System.out.println("No es palindromo");
                break;
            }
        }
        if (espalindromo) {
            System.out.println("Es palindromo");
        }

        /*
         * Crear una cadena que sea igual a la introducida, pero con la primera y última
         * posiciones intercambiadas. Ejemplo: si introducen: “abcde”, obtendría
         * “ebcda”.
         */
        System.out.println("n)");
        String cadena_intercambiada = cadena;
        char inicio = cadena_intercambiada.charAt(0);
        char ultimo = cadena_intercambiada.charAt(cadena_intercambiada.length() - 1);

        cadena_intercambiada = ultimo + cadena_intercambiada.substring(1, cadena_intercambiada.length() - 1) + inicio;
        System.out.println(cadena_intercambiada);
    }
}
