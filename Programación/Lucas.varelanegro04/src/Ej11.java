public class Ej11 {
    public static void main(String[] args) {
        /* Describe que realiza el código siguiente e indica si contiene algún error: */
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine(); 
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos!=-1) cadenaSB.deleteCharAt(pos); 
        } while (pos != -1);
        System.out.println(cadenaSB);
        teclado.close();
        // No le veo ningún error al programa, y su función es eliminar los espacios.
    }
}
