public class Ej3 {
    /*
     * Realizar un programa que defina un Array con 10 elementos e introduzca
     * valores a azar entre 1 y 20.
     * Al finalizar informar si tiene repetidos o no.
     */
    public static void main(String[] args) throws Exception { 
        int[] nums = new int[10];
        for (int i = 0; i<10;i++) {
            nums[i]+= (int)(Math.random()*(20-1)+1);
        }
        if (Repetidos(nums)) {
            System.out.println("Tiene repetidos");
        }
        else {
            System.out.println("No tiene repetidos");
        }
        
    }
    
// Funciones
public static boolean Repetidos(int[] nums) {
    boolean repetidos = false;
    for (int i = 0; i<9;i++) {
        for (int y=9; y>0;y--) {
            if (nums[i] == nums[y]) {
                repetidos = true;
            }
        }
    }
    return repetidos;
}

}
