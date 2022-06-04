package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float kma,kmb,gasolina,gasolinab;
      
        System.out.println("Introduzca el kilometraje de la última vez que repostó");
        kma = t.nextFloat();
      
        System.out.println("Introduzca el kilometraje actual");
        kmb = t.nextFloat();
        
        System.out.println("Introduzca los litros de gasolina en la última vez que repostó");
        gasolina = t.nextFloat();
        
        System.out.println("Introduzca los litros de gasolina actuales");
        gasolinab = t.nextFloat();
        
        System.out.println("El coche consume cada 100km = "+(((gasolina-gasolinab))/(kmb-kma))*100+" litros");


 
    }
    
}
