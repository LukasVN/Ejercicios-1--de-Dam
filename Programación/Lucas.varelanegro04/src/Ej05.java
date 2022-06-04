public class Ej05 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que muestre una contraseña generada aleatoriamente
         * teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo
         * pueden ser letras entre la ‘a’ y la ‘j’ pero sin letras repetidas.
         */
        String letras = "abcdefghij";
        String contraseña = "";
        int posicion = 0;
        char letra;
        int tamaño = (int) (Math.random() * 5) + 5;
        for (int i = 0; i < tamaño; i++) {
            posicion = (int) (Math.random() * 10);
            letra =letras.charAt(posicion);
            if(contraseña.indexOf(letra)==-1)  // la añado si está
                contraseña += letras.charAt(posicion);
              else
                i--;

            }
        System.out.println("La contraseña es: "+contraseña);

    }
}
