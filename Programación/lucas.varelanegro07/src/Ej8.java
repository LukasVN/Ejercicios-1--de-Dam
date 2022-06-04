import java.util.Scanner;

/* Realizar una clase carritoCompra que mantenga las compras realizadas por un cliente en un Array.
Cada posición del Array contendrá el código del producto, la descripción, el precio unitario y la cantidad de
unidades compradas y el precio total de ese producto (cantidad x precio unitario). Se permite comprar como
máximo de 100 artículos diferentes. Además de la lista de productos, la clase tiene el importe total de la compra,
que debe estar siempre actualizado. Necesitamos los métodos:
a. Mostrar por consola el estado actual del carrito.
b. Añadir producto.
c. Eliminar producto (se le pasa el código de producto) y se le marcará de alguna forma que ese producto
está anulado (eliminarlo físicamente sería lioso, habría que desplazar todos los productos a la derecha
en el Array para cubrir el hueco dejado por el elemento borrado.
Hacer un programa con un menú que permita al usuario operar con el carrito de la compra. */

public class Ej8 {
   public static void main(String[] args) {
      String codproducto; String descripcion; double precio; int unidades;
      Scanner t = new Scanner(System.in);
      CarritoCompra carrito = new CarritoCompra();
      boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: System.out.println(carrito.CarritoActual());
                    break;
                case 2: 
                        System.out.print("Código del producto: ");
                        codproducto = t.nextLine();
                        System.out.print("Descripción del producto: ");
                        descripcion = t.nextLine();
                        System.out.print("Precio de la unidad: ");
                        precio = t.nextDouble();
                        t.nextLine(); // Línea para areglar error de Escáner
                        System.out.print("Cantidad de unidades: ");
                        unidades = t.nextInt();
                        t.nextLine(); // Línea para areglar error de Escáner
                        carrito.AñadirProducto(codproducto, descripcion, precio, unidades);
                    break;
                case 3: 
                        System.out.println("Introduce el código del producto a eliminar: ");
                        codproducto = t.nextLine();
                        carrito.EliminarProducto(codproducto);
                    break;
 
                case 4: System.out.println("El carrito cuesta un total de "+carrito.ImporteTotal()+" euros");
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
        System.out.println("1 Mostrar estado actual del carrito");
        System.out.println("2 Añadir producto");
        System.out.println("3 Eliminar producto");
        System.out.println("4 Importe total de la compra");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
   
    }

}

