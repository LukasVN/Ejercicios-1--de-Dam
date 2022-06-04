public class Ej4 {
    /*
     * Realizar un programa que defina un Array con 10 elementos e introduzca
     * valores a azar entre 1 y 20
     * pero garantizando que no se introducen repetidos.
     */
    public static void main(String[] args) throws Exception {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * (20 - 1) + 1);
            for (int y = 0; y <= i; y++) {
                if (random == nums[y]) {
                    random = (int) (Math.random() * (20 - 1) + 1);
                    y = 0;
                }

            }
            nums[i] = random;

        }
        //Mostrar valores del Array: 
        for (int i = 0; i < nums.length; i++) {System.out.println(nums[i]); }
     
    }

}
