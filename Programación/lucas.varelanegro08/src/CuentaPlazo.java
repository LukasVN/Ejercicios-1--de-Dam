import java.time.LocalDate;

public class CuentaPlazo extends CuentaCorriente{
    private LocalDate fecha_creacion;
    private float saldo;
    private int contadorIngresos;

    

CuentaPlazo (String i) {
    super(i);
    saldo =0;
    contadorIngresos = 0;
    fecha_creacion = LocalDate.now();
}    

public float        getSaldo ()              {return (saldo);}

public void ingresar (float importe) {
    float bonus=0;
    if (++contadorIngresos == 3) {
       contadorIngresos = 0; 
       bonus =0.7f;
    }    
    saldo += importe + bonus;
}

public boolean retirar (float importe) {
    if (importe <= saldo) {
       saldo -= importe;
       contadorIngresos = 0;
       return true;
    }
    else return false; 
}

} // fin clase

