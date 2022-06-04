package lucas.varelanegrot03_16_31;

public class Ej21 {

    public static void main(String[] args) {
        /*Programa que muestre los número primos comprendidos entre  2 y 1000. 
        Hacer los bucles con un número mínimo de iteraciones (se permite el uso de break) 
        sabiendo que:
        -Un número primo es solo divisible por 1 y el mismo.
        -Los números primos son todos impares salvo el 2.
        -Los divisores de un número siempre son menores que la mitad de dicho número (salvo el mismo).
        -Si un número no es divisible por 2 ya no va a serlo por ningún otro número par*/
        for (int i = 3; i <= 1000; i++) {
            int cont = 0;
            for (int num = 1; num <= i; num++) {
                if (i % num == 0) {
                    cont++;
                }
            }
            if (cont==2){
                System.out.println(i);
            }
        }
    }
}