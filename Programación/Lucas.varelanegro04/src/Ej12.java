import java.util.Scanner;


public class Ej12 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que solicite la entrada de una cadena de 6 posiciones,
         * que todas sean dígitos y sin repetidos. Si no cumple esas condiciones, el
         * usuario deberá introducirla de nuevo hasta que lo haga correctamente.
         */
        Scanner t = new Scanner(System.in);
        String digitos;
        char pos;
        boolean malaContra;
        do {
            
            System.out.println("Introduzca una cadena de 6 posiciones siendo todas digitos diferentes: ");
            digitos = t.nextLine();
            
            malaContra= (digitos.length()!=6);

            for (int i=0; !malaContra && i<6 ; i++){
                pos = digitos.charAt(i);
                if ( !Character.isDigit(pos)  ) 
                    { malaContra=true;
                     } 
                     if (  digitos.indexOf(pos, i+1)!= -1) //repetido
                     { malaContra=true;
                     }                    
            }
        } while(malaContra);
        t.close();
        if (!malaContra) {
            System.out.println("La cadena "+digitos+" es numérica y sus digitos son diferentes");

        }
    }
}