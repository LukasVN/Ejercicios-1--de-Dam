public class Ej10 {
    /* Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué? */
    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        if (saldo>1000f)
        System.out.println("Ya tienes más de 1000 euros: " + saldo);
        else System.out.println("No tienes más de 1000 euros: " + saldo);
        }
        static float ingresar (float saldo, float increm){ return saldo+increm;}
        /* Por pantalla muestra que tengo 900 euros pero tenia un error declarando la
        variable saldo en el if de mayor que 1000.
        */
}
