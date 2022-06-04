package lucas.varelanegrot03_16_31;

import java.util.Scanner;

public class Ej23 {

    public static void main(String[] args) {
        /*Hacer un programa que permita calcular el sueldo final de los vendedores 
        de un concesionario de coches. 
        Para cada uno se introducirá: sueldo base, cantidad de horas extras realizadas y cantidad de ventas. 
        El sueldo final será el sueldo base más las horas extras (se pagan a 100€ la hora) 
        y un plus en función de las ventas:
        entre 10 y 20 ventas 500€, entre 21 y 30 ventas  1000€ y si supera las 30 ventas  1300 €. 
        Después de tratar cada vendedor se preguntará al usuario y hay más vendedores a tratar, 
        finalizando el programa si contesta negativamente. Al final el programa mostrará 
        el total de ventas y el salario final del que más ventas ha realizado
        (supón que al menos introducen los datos de un empleado).*/
        Scanner t = new Scanner(System.in);
        int empleado=0;
        double sb = 0, he = 0, ventas = 0,
                totalv = 0, smax = 0, 
                ventasmax = 0, ventas€ = 0;
        int seguir=1;
        while (seguir==1) {
            System.out.println("Empleado "+(++empleado));
            System.out.println("Introduce el sueldo base: ");
            sb = t.nextDouble();

            System.out.println("Introduce las horas extra realizadas: ");
            he = t.nextDouble();
            sb = sb + (he * 100);

            System.out.println("Introduce la cantidad de ventas: ");
            ventas = t.nextDouble();
            totalv = totalv + ventas;

            if (ventas >= 10 & ventas <= 20) {
                ventas€ = 500;
            }
            if (ventas >= 21 & ventas <= 30) {
                ventas€ = 1000;
            }
            if (ventas > 30) {
                ventas€ = 1000;
            }
            if (ventas > ventasmax) {
                    ventas = ventasmax;
                    smax = sb + (he * 100) + ventas€;
                }

            System.out.println("Más empleados? (0-no,1-si)");
            seguir=t.nextInt();
            
            
            } // fin del while
            System.out.println("Total de ventas: " + totalv);
            System.out.println("Salario del que más ventas realizó: "+smax);

        }

    }
