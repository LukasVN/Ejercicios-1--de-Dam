import java.util.Arrays;

public class Ej14 {
    /*
     * (ejercicio opcional) Realizar un programa que defina un Array con 10
     * elementos e introduzca valores al azar entre 1 y 20 pero garantizando que no se introducen repetidos y una vez
     * introducidos, ordénalos ascendentemente programando un algoritmo de ordenación.
     */
    public static void main(String[] args) {
        int valores_azar[] = new int[10];
        Añadir_Valores(valores_azar);
        System.out.println(Arrays.toString(valores_azar));
        Ordenar_Valores(valores_azar);
        System.out.println(Arrays.toString(valores_azar));
    }

    public static void Añadir_Valores(int valores_azar[]) {
        for (int i = 0; i < valores_azar.length - 1; i++) {
            int random = (int) (Math.random() * (20 - 1) + 1);
            for (int y = 0; y <= i; y++) {
                if (random == valores_azar[y]) {
                    random = (int) (Math.random() * (20 - 1) + 1);
                    y = 0;
                }
                valores_azar[i] = (int) (Math.random() * (20 - 1 + 1) + 1);
            }
        }
    }

    public static void Ordenar_Valores(int valores_azar[]) {
        for (int i = 0; i < valores_azar.length - 1; i++) {
            for (int y = valores_azar.length - 1; y > i; y--) {
                if (valores_azar[i] > valores_azar[y]) {
                    int menor = valores_azar[y];
                    valores_azar[y] = valores_azar[i];
                    valores_azar[i] = menor;
                }
            }
        }
    }
}
