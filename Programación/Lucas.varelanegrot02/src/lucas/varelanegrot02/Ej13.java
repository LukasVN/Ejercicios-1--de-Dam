package lucas.varelanegrot02;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int nota;
        System.out.println("Introduzca la nota");
        nota = t.nextInt();
        
        switch (nota) {
            case 0: 
            case 1:
            case 2: 
                System.out.println("Muy deficiente: "+nota);
                break;
            case 3:
            case 4:
                System.out.println("Insuficiente: "+nota);
                break;
            case 5:
            case 6:
                System.out.println("Aprobrado: "+nota);
                break;
            case 7:
            case 8:
                System.out.println("Notable: "+nota);
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente: "+nota);
                break;                 
        }
            
                
        
    }
    
}
