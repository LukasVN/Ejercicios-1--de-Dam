package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float C, F;
        System.out.println("Introduzca la temperatura en Celsius(Cº)");
        C = t.nextInt();
        F = (C * 9f/5) + 32;
        System.out.println("Equivalen a " + F + "ºF");
        System.out.println("---------------------------------------");
        float pulg, cm;
        
        System.out.println("Introduzca las pulgadas del pluviómetro");
        pulg = t.nextFloat();
        cm =((pulg)/(0.3937f));
        System.out.println("Equivalen a " + cm + "cm");

    }

}
