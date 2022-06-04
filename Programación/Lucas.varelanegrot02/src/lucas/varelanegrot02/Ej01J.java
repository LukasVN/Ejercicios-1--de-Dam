
package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej01J {

    public static void main(String[] args) {
        /* Leer   dos   números   enteros   y   diga   si   el   menor   de   ellos   es   
        divisor   del   mayor (prevenir   divisiones   por   cero,   que   causan   error) 
        Repasar   operadores   en cortocircuito para hacer un solo if. */
        Scanner t = new Scanner(System.in);
        int menor,mayor;
        
        System.out.println("Introduce el número A");
        mayor = t.nextInt();
        System.out.println("Introduce el número B");
        menor = t.nextInt();
               
        if(menor>mayor)
        { //los intercambio
        int aux=menor;
        menor=mayor;
        mayor=menor;
        
        }
        
        if(menor!=0 && mayor%menor==0){
            System.out.println("Divisibles");}
        else
            System.out.println("no divisibles");
        
        
    }
    
}
