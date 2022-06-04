package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej30_31 {

    public static void main(String[] args) {
        /*Ejercicio 30*/
        /*Hacer un programa para llevar el control de venta de entradas. Lo primero que ha de hacer es pedir la
        cantidad de entradas que se pondrán a la venta, después irá solicitando la cantidad de entradas que quiere comprar,
        estando limitado a un máximo de 10 por cliente. El programa finalizará cuando se agoten las entradas mostrando la
        cantidad de entradas que se ha llevado el que más ha comprado.*/
        
        /*Ejercicio 31*/
        /*Modificar el programa anterior para que si un cliente introduce un número negativo o mayor que 10 le
        informe de su error y le obligue a meter correctamente las entradas que desea, las veces que sea necesario hasta que
        lo haga bien.*/
        Scanner t = new Scanner(System.in);
        int entradas, vendidas,mayor=0;

        System.out.println("Introduzca el número total de entradas a la venta: ");
        entradas = t.nextInt();
        int restantes = entradas;
        while ( restantes > 0 ) {
            System.out.println("Introduzca las el número de entradas que desea comprar (max 10): ");
            vendidas = t.nextInt();
            if (vendidas <= 10 && vendidas > 0 ) {
                restantes-= vendidas;
                if (vendidas>mayor)
                    mayor=vendidas;
            }
            else
                System.out.println("Por favor introduzca un número de entradas correcto"); 
               
        }
        System.out.println("El mayor comprador de entradas compró: "+mayor+" entradas");
    }

}
