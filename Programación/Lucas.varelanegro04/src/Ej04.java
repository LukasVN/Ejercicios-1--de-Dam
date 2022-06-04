public class Ej04 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que muestre una contraseña generada aleatoriamente
         * teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo
         * pueden ser letras entre la ‘a’ y la ‘j’.
         */
        String letras = "abcdefghij";
        String contraseña = "";
        int posicion = 0;
        int tamaño = (int) (Math.random() * 5) + 5;
        for (int i = 0; i < tamaño; i++) {
            posicion = (int) (Math.random() * 10);
            contraseña += letras.charAt(posicion);
        }
        System.out.println("La contraseña es: "+contraseña);

    }
}
