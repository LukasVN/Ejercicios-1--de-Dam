import java.util.Scanner;

public class Ej20 {
    /* Diseñar una clase Factura que consta de:
    - Número identificador: lo proporciona el usuario en el alta de la factura.
    - Fecha de la factura: la toma del sistema en el momento del alta.
    - Número de cliente: : lo proporciona el usuario en el alta de la factura.
    - Porcentaje de IVA: 21% para todas las facturas.
    - Un número indeterminado de lineaFactura que contienen: 
    - Descripción del producto
    - Precio unitario
    - Cantidad de unidades
    - Porcentaje de descuento: 5% para líneas con más de 10 unidades.
    - Importe total de la línea. 
    - Importe total: inicialmente cero, y se va actualizando siempre que se añadan/eliminen líneas.
    Implementar la clase con su constructor y métodos para añadir línea de factura, eliminar línea de factura y mostrar
    la factura por consola. Te hará falta una clase lineaFactura con su constructor. 
    Para añadir línea de factura, habrá que solicitar al usuario los campos necesarios para añadirlo (descripción, precio
    unitario y cantidad de unidades). Para eliminar una línea, solicitaremos el número de línea.
    Hacer también un programa con un menú para gestionar una factura (alta, añadir/eliminar líneas, mostrar factura)
    Nota: pensar en método toString() para líneaFactura.
    */
    public static void main(String[] args) {
        Factura factura = new Factura();
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: factura.AltaFactura();
                    break;
                case 2: factura.AñadirLinea();
                    break;
                case 3: factura.EliminarLinea();
                    break;
                case 4: factura.MostrarFactura();
                    break;
                case 0:
                    salir = true;
                    break;
            }
        } while (!salir);
    }
    private static int pintarMenu() {
        Scanner t = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Dar nueva factura de alta");
        System.out.println("2 Añadir linea de factura");
        System.out.println("3 Eliminar linea de factura");
        System.out.println("4 Mostrar factura");
        System.out.println("5 ");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
   
    }

        
}

