package lucas.varelanegrot01;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float coche, gananciaT, impuesto;

        System.out.println("Introduzca el precio del coche en euros");
        coche = t.nextFloat();

        gananciaT = coche * 0.1f;
        impuesto = (coche+gananciaT) * 0.2f;
        System.out.println("El coste inicial del automóvil es: " + (coche - gananciaT));
        System.out.println("El coste para el consumidor es: " + (coche + impuesto));

    }

}
