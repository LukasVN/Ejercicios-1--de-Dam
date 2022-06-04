public class MovilPrepago {
    public long numeroMovil;
    private float costeEstablecLlamada;
    private float costeMinutoLlamada ;
    private float costeConsumoMB;
    private float saldo;

public MovilPrepago (long nM, float cEL, float cML, float cMB, float s) {
    numeroMovil = nM;
    costeEstablecLlamada = cEL;
    costeMinutoLlamada = cML;
    costeConsumoMB = cMB;
    saldo =s;
}    
public void efectuarLlamada (int segundos) {
      saldo  -= Math.round((costeEstablecLlamada +
                            costeMinutoLlamada /60f * segundos) * 100f)/100f; 
      if (saldo < 0) saldo = 0;
}
public void navegar (int mb) {
      saldo -= Math.round(costeConsumoMB* mb * 100f) / 100f;
      if (saldo < 0) saldo = 0;
}
public boolean recargar (int importe) {
      if (importe % 5 == 0) {
         saldo += importe;
         return true;
      }
      else return false;
}
public float Setsaldo(float saldo){
      this.saldo = saldo;
      return saldo;
}
public float consultarSaldo () {
      return saldo;
}
@Override
    public String toString() {
        System.out.println("Número: "+numeroMovil);
        System.out.println("Saldo: "+consultarSaldo());
        return super.toString();
    }
public float GetcosteConsumoMB(){
      return costeConsumoMB;
}
public float GetcosteMinutoLlamada(){
      return costeMinutoLlamada;
}
} //fin clase