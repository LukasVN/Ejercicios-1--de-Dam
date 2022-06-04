public class MovilPlus extends MovilPrepago{
    
    public MovilPlus(long nM, float cEL, float cML, float cMB, float s) {
        super(nM, cEL, cML, cMB, s);
              
    }
    public void efectuarLlamada (int segundos) {
        Setsaldo(consultarSaldo() - Math.round((GetcosteMinutoLlamada() /60f * segundos) * 100f)/100f); 
        if (consultarSaldo() < 0) {Setsaldo(0);}
    }
    public void Videollamada(float segundos) {
        float consumomb = segundos*2;
        Setsaldo(consultarSaldo() - Math.round(GetcosteConsumoMB()* consumomb * 100f) / 100f);
      if (consultarSaldo() < 0) {Setsaldo(0);}
    }  

} //fin clase