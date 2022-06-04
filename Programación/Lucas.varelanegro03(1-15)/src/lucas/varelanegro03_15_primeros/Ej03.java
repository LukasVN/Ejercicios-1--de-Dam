package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        /*Diseñar un algoritmo que permita introducir números positivos y nos vaya
        informando uno a uno si es par o impar. El programa finalizará cuando se 
        introduzca un número negativo. Hacer dos versiones, una primera con una lectura
        de teclado adelantada (antes de entrar en el bucle) y otra versión en la que 
        l lectura de datos se haga únicamente al principio del bucle*/
        Scanner t = new Scanner(System.in);
        int num=0;
     
       System.out.println("Introduzca un número positivo (Negativo para finalizar)");
       num= t.nextInt();
       //lectura adelantada, antes del bucle 
       while (num >= 0) {          
                      
            if (num%2==0)
                System.out.println("Es par");
            else
                System.out.println("Es impar");
            
            
          System.out.println("Introduzca un número positivo (Negativo para finalizar)");
          num= t.nextInt();  
          
        }
        /* Opcion B */
        /*
        System.out.println("Introduzca un número positivo (Negativo para finalizar)");
        while (num >= 0) {          
            num= t.nextInt();
            if(num<0) break;
            if (num%2==0)
                System.out.println("Es par");
            else
                System.out.println("Es impar");
        }
        */
       
      
      
      
      
    }

}


