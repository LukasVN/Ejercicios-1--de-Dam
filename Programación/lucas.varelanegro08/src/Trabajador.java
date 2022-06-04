import java.time.LocalDate;
import java.util.Scanner;

public class Trabajador {
Scanner t = new Scanner(System.in);
    private String id;
    private String nombre;
    private LocalDate fnacimiento;
    private float sb;
    public Trabajador(String id,String n,LocalDate fn, float sb){
        this.id = id;
        this.nombre = n;
        this.fnacimiento = fn;
        this.sb = sb;
    }
    public void setId(){
        id = t.nextLine();
    }
    public String getId(){
        return id;
    }
    public void setNombre(){
        nombre = t.nextLine();
    }
    public String getNombre(){
        return nombre;
    }
    public void setFnacimiento(){
        fnacimiento = LocalDate.parse(t.nextLine());
    }
    public LocalDate getFnacimiento(){
        return fnacimiento;
    }
    public void setSb(){
        sb = t.nextFloat();
    }
    public float getSb(){
        return sb;
    }
    public boolean equals(Trabajador tr) {
        if(tr.id == this.id){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de nacimiento: "+fnacimiento);
        System.out.println("Salario base: "+sb+" euros");
        return super.toString();
    }
}
