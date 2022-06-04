package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        /* Indica la funcionalidad del siguiente programa. ¿Tiene algún error?
        ¿Falta alguna llave? ¿Podrías reducir el recorrido del for para que el
        programa sea más rápido, manteniendo su funcionalidad?
        
        package ejercicios;
        import java.util.Scanner;
        public class Ejercicios {
            public static void main(String[] args) {
            int num;
            Scanner teclado = new Scanner(System.in);
        
            System.out.print("Introduce un número natural entre 1 y 1000: ");
            num = teclado.nextInt();
            if (num <0 && num > 1000)
                System.out.println("Numero incorrecto.");
            else 
               for (int i=num;num>=1;i--) 
                    if (num % i == 0) System.out.println(i);
        } 
    } */
            Scanner t = new Scanner(System.in);
            int num,i=1;
            System.out.print("Introduce un número natural entre 1 y 1000: ");
            num = t.nextInt();
            if (num <0 || num > 1000) {
                System.out.println("Numero incorrecto.");
            }
            else {                
                for (i=num;i>=1;i--) 
                    if (num % i == 0) System.out.println(i/2);                    
                
               /* La funcionalidad del programa es imprimir el valor de los divisores
               del número introducido*/
            }       
    }
    
}
