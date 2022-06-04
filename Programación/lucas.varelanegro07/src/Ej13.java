public class Ej13 {
    // Se debe ejecutar como indica el enunciado, con java (nombre).
    /* Realizar un programa que tenga un Array con una agenda de teléfonos simple con unos valores
    cualquiera. Por ejemplo:
    Marta 666111222
    Miguel 981981981
    Ana 900900900
    Daniel +34881000001
    Al programa se le pasará como parámetros un nombre. Si el nombre está en la agenda, mostrará su teléfono, y en
    caso contrario informará que no existe dicha persona. java prog Ana. */
    public static void main(String[] args) {
        String telefonos[] = new String[4];
        telefonos[0] = "666111222"; telefonos[1] = "981981981"; telefonos[2] = "900900900"; telefonos[3] = "+34881000001";
        switch (args[0].toLowerCase()) {
            case "marta": System.out.println(telefonos[0]);
                break;
            case "miguel": System.out.println(telefonos[1]);
                break;
            case "ana": System.out.println(telefonos[2]);
                break;
            case "daniel": System.out.println(telefonos[3]);
            default: System.out.println("El contacto no existe");
                break;
        }
    }
}
