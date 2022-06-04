import java.time.LocalDate;

public class EjemplarLibro {
    private String titulo;
    private LocalDate fecha;
    private final int nejemplar;
    private boolean prestado;

    public EjemplarLibro(String t) {
        titulo = t;
        nejemplar = 1;
        prestado = false;
        fecha = LocalDate.now();
    }
    public EjemplarLibro(EjemplarLibro l) {
        titulo = l.titulo;
        nejemplar = l.nejemplar +1;
        prestado = l.prestado;
        fecha = l.fecha;
    }

    public boolean Prestar() {
        if (prestado = true) {
            return false;
        }
        else {
            System.out.println("El libro ahora está prestado");
            prestado = true;
            return true;
        }
    }
    public boolean Devolver() {
        if (prestado = true) {
            System.out.println("El libro ya no está prestado");
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        String datos;
        return datos = titulo + " ("+fecha+") "+" ["+nejemplar+"]";
    }




}
