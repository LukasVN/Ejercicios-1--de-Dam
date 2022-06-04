public class MovilTarifaPlana extends MovilPrepago {

    public MovilTarifaPlana(long nM, float cEL, float cML, float cMB, float s) {
        super(nM, cEL, cML, cMB, s); cMB = 0;
        
    }
    @Override
    public void navegar(int mb) {
        super.navegar(mb);
    }
    
    
}
