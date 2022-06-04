
public class Ej01 {
    /*
     * A partir de la clase MovilPrepago que te proporcionará el profesor, haz un
     * programa en el
     * que se cree un teléfono con unas características determinadas y luego ejecute
     * una serie de
     * actividades como recargar 10 euros, llamar 30 seguntos, navegar 10MB, etc.
     * Viendo cómo se va
     * modificando el saldo.
     * Las propiedades de un móvil prepago son:
     * - int numeroMovil (13 digitos)
     * - float costeEstablecLlamada (euros, con dos decimales)
     * - float costeMinutoLlamada (euros, con dos decimales)
     * - float costeConsumoMB (euros, con dos decimales)
     * - float saldo (euros, con dos decimales)
     * Los métodos son:
     * - void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es
     * suficiente, se corta la llamada
     * - void navegar(int MB) análogo a efectuar una llamada
     * - boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5
     * euros, sino devuelve false
     * - float consultarSaldo ()
     */
    public static void main(String[] args) {
        MovilPrepago movil = new MovilPrepago(643856102, 0.10f, 0.5f, 0.02f, 10);
        System.out.println("Saldo actual = " + movil.consultarSaldo());

        movil.efectuarLlamada(60);

        System.out.println("Saldo actual = " + movil.consultarSaldo());

        movil.navegar(150);

        System.out.println("Saldo actual = " + movil.consultarSaldo());

        movil.recargar(10);

        System.out.println("Saldo actual = " + movil.consultarSaldo());

    }
}
