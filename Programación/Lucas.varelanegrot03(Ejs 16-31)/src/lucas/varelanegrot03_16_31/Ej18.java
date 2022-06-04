package lucas.varelanegrot03_16_31;

public class Ej18 {

    public static void main(String[] args) {
        //Mostrar las tablas de multiplicar del 1 al 9

        for (int num = 1; num <= 9; num++) {
            System.out.println("Tabla del : " + num);

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + "= " + num* i);
            }

        }

    }

}
