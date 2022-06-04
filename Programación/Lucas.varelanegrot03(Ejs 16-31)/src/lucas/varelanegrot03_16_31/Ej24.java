package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {
        /*Programa que permita introducir números y  nos muestre el resultado de sumarlos, 
        hasta que aparezca un número mayor que 1000. Si no se introduce un número mayor que 1000 
        el programa finalizará después de introducir  15 números. 
       (Ojo: es fácil equivocarse y hacer que solicite un numero de más o bien que no sume correctamente)*/
        Scanner t = new Scanner(System.in);
        int num=0,suma=0;

        System.out.println("Introduce 15 números para sumar (Mayor que 1000 para finalizar antes)");
        for (int i = 0; i < 15; i++) {
            num = t.nextInt();
            if (num<1000)
                suma= num + suma;
            else
                break;
        }
        System.out.println("Suma total= "+suma);
    }

}
