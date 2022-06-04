package lucas.varelanegro03_15_primeros;

public class Ej15 {

    public static void main(String[] args) {
        //Sin ejecutarlo, intenta explicar que hace este programa.
        int hora=0;       
        for (int i=1;i<=7*24;i++) {
            System.out.println (hora);
            if (++hora > 23) hora=0;
        }   
        /*(Sin ejecutarlo) El programa una vez se ejecute mostrará todas las horas
                           horas de un reloj digital en formato 24hrs y cuando
                           llegue a 24 se reinicia empezando desde 0 otra vez.*/
    }
    
}
