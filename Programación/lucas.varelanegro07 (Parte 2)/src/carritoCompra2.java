import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carritoCompra2 {
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
    private List<String> carrito = new ArrayList<>();
    private String codigo;
    public void AñadirCompra(){
    Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el código del producto");
        codigo = t.nextLine();
        System.out.println("Introduzca la descripción del producto");
        String desc = t.nextLine();
        System.out.println("Introduzca el precio del producto");
        double precio = t.nextDouble();
        System.out.println("Introduzca las unidades del producto");
        int unidades = t.nextInt();
        double precio_total = unidades*precio;
        String infoprod = "Código: "+codigo+"| "+" Descripción: "+desc+"| "+" Precio: "+precio+"| "+" Unidades: "+unidades+"| "+" Precio Total: "+precio_total;
        carrito.add(infoprod);
    }
    public String MostrarCarrito() {
        return carrito.toString();
    }
    public void VaciarCarrito() {
        carrito.clear();
    }
    public void EliminarCompra(String codigo) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < carrito.size(); i++) {
            if(carrito.get(i).contains(codigo)) {
                carrito.remove(i);
            }
        }
    }
    
}
