import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factura {
    String id;
    LocalDate fecha_factura;
    final float IVA = 0.21f;
    int num_cliente;
    List<Linea> linea_factura = new ArrayList<>();
    ArrayList<Float> precios_linea = new ArrayList<>();
    float importe_total = 0;
    public void AltaFactura() {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el id de la factura");
        id = t.nextLine();
        fecha_factura = LocalDate.now();
        System.out.println("Introduzca el número de cliente");
        num_cliente = t.nextInt();
    }
    public void MostrarFactura() {
        System.out.println("\n\n\n");
        System.out.println("Id factura: "+id);
        System.out.println("Fecha de alta de la factura "+fecha_factura);
        System.out.println("Número de cliente: "+num_cliente);
        System.out.println("IVA: 21%");
        System.out.println("Número de Lineas de Factura: "+linea_factura.size());
        linea_factura.toString();
        System.out.println("Importe Total: "+importe_total);
    }
    public class Linea {
        public Linea(String descripcion,float precio,int unidades,float descuento,float importe_linea) {
        }
    }
    public void AñadirLinea() {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca la descripción de la Línea");
        String desc = t.nextLine();
        System.out.println("Introduzca el precio unitario");
        float precio = t.nextFloat();
        System.out.println("Introduzca el numero de unidades:");
        int unidades = t.nextInt();
        float descuento = 0;
        if(unidades > 10) {descuento = 0.05f;}
        float importe_linea = (precio*unidades)-((precio*unidades)*descuento);
        linea_factura.add(new Linea(desc,precio,unidades,descuento,importe_linea));
        precios_linea.add(importe_linea);
        importe_total+=importe_linea;
    }
    public void EliminarLinea() {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el número de Línea a eliminar:");
        int num = t.nextInt()-1;
        importe_total-= precios_linea.get(num);
        linea_factura.remove(num);
        precios_linea.remove(num);
    }
}
