import java.util.Scanner;

public class CarritoCompra {
    private String productos[] = new String[100];
    private String codproductos[] = new String[100];
    private double precios[] = new double[100];
    private String codproducto;
    private String descripcion;
    private double precio;
    private int unidades;
    private double preciototal;

    public String CarritoActual() {
        String carrito = "";
        for (int i =0; i<100; i++) {
            if (productos[i] != null) {
            carrito += productos[i].toString() +" ||";
            }
            else {
                break;
            }
        }
        return carrito;
    }

    public void AñadirProducto(String codproducto, String descripcion, double precio, int unidades) {
        for (int i =0; i<100; i++) {
            if (productos[i] == null) {
                codproductos[i] = codproducto;
                productos[i] =codproducto+" |"+descripcion+" |"+precio+" euros "+" |"+unidades+" unidades"+" |"+" Total: "+precio*unidades+" euros ";
                preciototal+= precio*unidades;
                precios[i] = precio*unidades;
            break;
            }
        }
    }

    public void EliminarProducto(String codproducto) {
        for (int i = 0; i<100;i++) {
            if (codproducto.equals(codproductos[i])) {
                preciototal-= precios[i];
                productos[i] = "ELIMINADO";
                break;
            }
        }
        
    }

    public double ImporteTotal() {
        return preciototal;
    }



}
        

