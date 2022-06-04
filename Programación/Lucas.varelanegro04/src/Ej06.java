import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        /*
         * Realiza un programa al que se le introduzca un email y nos devuelva el nombre
         * del dominio y subdominios si los hubiese, es decir, lo que está entre la
         * arroba y el punto final (Ejemplo: info@empresas.clientes.mundo-r.com
         * mostraría empresas.clientes.mundo-r ).
         */
        Scanner t = new Scanner(System.in);
        String email;
        System.out.println("Introduce un email: ");
        email = t.nextLine();
        t.close();
        String dominio;
        dominio = email.substring(email.indexOf("@")+1, email.indexOf(".com"));
        System.out.println(dominio);
    }
}
