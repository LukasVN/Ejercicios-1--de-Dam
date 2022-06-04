public class Ej07 {
    public static void main(String[] args) {
        /*
         * Un número primo es aquel que solo tiene como divisores el número 1 y a él
         * mismo. Usando la función
         * del programa anterior, haz un programa que muestre la suma de los números
         * primos comprendidos entre 1 y 1000.
         */
        int num = 0;
        System.out.println("La suma de los numeros primos comprendidos entre 1 y 1000 es: "+sumaprimos(num));
        
    }
    
    public static int sumaprimos(int num) {
        int sum = 0;
        for (int i = 2;i<1000;i++){
            num = i;
            if (cantidadDivisores(num) == 0) {
                sum +=num;
            }
        }
        return sum;
    }
    public static int cantidadDivisores(int num) {
        int cont = 0; int divisor;
        for (int i=1;i<num;i++) {
            divisor = i;
            if (num%divisor == 0 && divisor > 0 && divisor  != num && divisor != 1) {
                cont++;
            }
        }
        return cont;
    }
}
