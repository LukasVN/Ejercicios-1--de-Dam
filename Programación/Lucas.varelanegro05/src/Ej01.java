import java.util.Random;
import java.util.Scanner;

public class Ej01 {
/*Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a dichas
funciones:
- Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo es.
- Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
- Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma de los
    números comprendidos entre los números pasados (el primero es menor que el segundo, y ambos
    mayores que cero, en caso contrario devuelve -1)
- Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros que tiene.
- Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al azar
    comprendido entre esos dos valores (el primero es menor que el segundo, y ambos mayores que cero,
    en caso contrario devuelve -1)
*/
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("1. Introduce un entero: ");
        int numint = t.nextInt();
        boolean espar = par(numint);
        System.out.println("Es par = " +espar);

        double num1, num2, num3;
        System.out.println("2. Introduce 3 números: ");
        num1 = t.nextDouble();
        num2 = t.nextDouble();
        num3 = t.nextDouble();
        System.out.println("El número mayor es: " + mayor(num1, num2, num3));
        
        long numi,numf;
        System.out.println("3. Introduce 2 números: ");
        numi = t.nextLong();
        numf = t.nextLong();

        
        System.out.println("Suma total entre los dos números: "+sumaIntervalo(numi,numf));

        int cerostotal=0;
        System.out.println("4. Introduzca una cadena numérica: ");
        String cadena1 = "";
        System.out.println("La cadena tiene: "+contarCeros(cerostotal,cadena1)+" ceros");

        int nu1 = 0,nu2 = 0;
        System.out.println("5. Introduce dos números (El primero menor que el segundo y ambos mayores que 0): ");
        System.out.println("Número aleatorio entre los dos : "+aleatorio(nu1, nu2));
    }

    public static boolean par(int numint) {
        if (numint % 2 == 0) {
            return true;
        }
        return false;
    }

    public static double mayor(double numd1, double numd2, double numd3) {
        if (numd1 > numd2 && numd1 > numd3) {
            return numd1;
        } else if (numd2 > numd1 && numd2 > numd3) {
            return numd2;
        }
        return numd3;
    }
    public static long sumaIntervalo(long n1, long n2) {
        long total=0;
        
        if (n1 < n2 && n1 > 0 && n2 > 0) {
            for (long i = n1+1; i<n2; i++) {
                total = total + i;
            }
        return total;
        }
        return -1;
    }
    public static int contarCeros(int ceros, String cadena) {
        Scanner t = new Scanner(System.in);
        cadena = t.nextLine();
        for (int i = 0; i<cadena.length(); i++)
            if (cadena.charAt(i) == '0') {
                ceros++;
            }
        return ceros;
    }
    public static int aleatorio(int numero1, int numero2) {
        Scanner t = new Scanner(System.in);
        int randomnum;
        Random random = new Random();
        numero1 = t.nextInt();
        numero2 = t.nextInt();
        if (numero2 > numero1 && numero1 > 0 && numero2 > 0) {
            randomnum = random.nextInt((numero2 - numero1)+ numero1) + numero1;
        }
        else {
            randomnum = -1;
        }
        return randomnum;
    }
}


