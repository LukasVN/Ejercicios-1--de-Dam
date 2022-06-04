import java.time.LocalDate;
import java.util.Scanner;

public class ConsultorExterno extends Trabajador{
Scanner t = new Scanner(System.in);
    private int horas_t;
    protected float salariofinal;
    public ConsultorExterno(String id, String n, LocalDate fn, float sb,int ht,float sf) {
        super(id, n, fn, sb);
        sb = 0;
        this.horas_t = ht = 0;
        this.salariofinal = sf = 0;
    }
    public void setHt(){
        horas_t = t.nextInt();
    }
    public int getHt(){
        return horas_t;
    }
    public void calcularSalarioFinal(float costeht){
        salariofinal = horas_t*costeht;
    }
}
