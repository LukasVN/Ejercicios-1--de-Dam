package lucas.varelanegrot01;
import java.util.Scanner;
public class Ej09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        int var1, var2, var1b, var2b; //Para intercambiar los valores usamos 2 variables adicionales.
        
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        var1b = var1;
        var2b = var2;        
        var1 = var2b;
        var2 = var1b;
        System.out.println("Ahora var1 es igual a var2"); //igual a var2, no a var1. 
        System.out.println("Ahora var2 es igual a var2"); //igual a var1, no a var2.
        System.out.println("var1 = "+var1);
         System.out.println("var2 = "+var2);
  // }} Los corchetes están colocados de manera errónea.

        System.out.println("Ejercicio sin variables auxiliares: ");
        int a,b;
        
        System.out.println("Introduce a: ");
        a = teclado.nextInt();
        System.out.println("Introduce b: ");
        b = teclado.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Ahora a es igual a b");
        System.out.println("Ahora b es igual a a");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        
    }
}