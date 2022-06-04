import java.time.LocalDate;
import java.util.Scanner;

public class Asalariado extends Trabajador{
Scanner t = new Scanner(System.in);
    protected float salariofinal;
    private int he;
    public Asalariado(String id, String n, LocalDate fn, float sb, float sf,int he) {
        super(id, n, fn, sb);
        this.salariofinal = sf = sb;
        this.he = he = 0;
    }
    public void setHe(){
        he = t.nextInt();
    }
    public int getHe(){
        return he;
    }
    public void calcularSalarioFinal(float costehe){
        salariofinal = getSb() + he*costehe;
    }
    
}
