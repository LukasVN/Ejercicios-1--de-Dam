package lucas.varelanegro03_15_primeros;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        /*Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre
          los números comprendidos entre ellos ordenados ascendentemente, junto con el
          valor de elevar cada uno de esos números al cuadrado. No se sabe si m > n, pero
          se desea utilizar una sola sentencia repetitiva tanto si m > n como si m < n.*/
        Scanner t = new Scanner(System.in);
        int m, n;
        System.out.println("Introduzca el valor de m");
        m = t.nextInt();
        System.out.println("Introduzca el valor de n");
        n = t.nextInt();
        for (int num = m+1; num < n; num++) {
            System.out.println("Número: " + num+ "    " + "Valor elevado= " + Math.pow(num, 2));
        }
        for (int num = n+1; num < m; num++) {
            System.out.println("Número: "+num+"    "+"Valor elevado= "+Math.pow(num, 2));
        }
    }

}
