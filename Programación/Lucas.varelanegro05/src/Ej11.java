public class Ej11 {
    // ¿Qué mostraría este código por pantalla? ¿Por qué?
    public static void main(String[] args) {
            float saldo = 500f;
            ingresar(saldo, 600f);
            if (saldo > 1000f) System.out.println("Ya tienes más de 1000 euros: " + saldo);
            else System.out.println("No tienes más de 1000 euros: "+ saldo);
            }
            static void ingresar(float saldo, float increm) {saldo += increm;}
        // Muestra 500, porque en ningun momento se modifica la variable del saldo
}
