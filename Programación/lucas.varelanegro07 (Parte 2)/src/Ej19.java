import java.util.Scanner;

public class Ej19 {
    /* Realizar una clase carritoCompra2 que mantenga las compras realizadas por un cliente en un
    ArrayList. Cada posición del ArrayList contendrá el código del producto, la descripción, el precio unitario y la
    cantidad de unidades compradas y el precio total de ese producto (cantidad x precio unitario). Se permite comprar
    un número indeterminado de artículos. Además de la lista de productos, la clase tiene el importe total de la compra,
    que debe estar siempre actualizado. Necesitamos los métodos:
    a) Mostrar por consola el estado actual del carrito.
    b) Vaciar carrito.
    c) Añadir producto.
    d) Eliminar producto (se le pasa el código de producto) y lo elimina físicamente del ArrayList.
    Hacer un programa con un menú que permita al usuario operar con el carrito de la compra.  */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        carritoCompra2 carrito = new carritoCompra2();
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: carrito.AñadirCompra();
                    break;
                case 2: System.out.println(carrito.MostrarCarrito()); 
                    break;
                case 3: carrito.VaciarCarrito();
                    break;
                case 4: 
                    System.out.println("Introduzca el código de la compra a eliminar: ");
                    String codigo = t.nextLine();
                    carrito.EliminarCompra(codigo);
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
        System.out.println("1 Añadir Compra");
        System.out.println("2 Mostrar Carrito");
        System.out.println("3 Vaciar Carrito");
        System.out.println("4 Eliminar Compra (Código de producto necesario)");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
   
    }
}
