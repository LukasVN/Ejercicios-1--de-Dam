import java.time.Duration;
import java.time.LocalTime;

public class Parking2 {
    private String[] matriculas = new String[20];
    private LocalTime[] tiempo_parking = new LocalTime[20];
    private final float coste_minuto = 0.2f;
    private double recaudado;

    public String Estado_Parking() {
       String parking = "";
       for (int i =19; i > 0;i--) {
           parking +=(i+1)+"."+matriculas[i]+" "+tiempo_parking[i]+"|";
       }
        return parking;
    }
    public int Aparcar(String num_matricula) {
        int num_plaza=20;
        for (int i =19; i > 0;i--) {
            if (matriculas[i] == null) {
                matriculas[i] = num_matricula;
                num_plaza =i+1;
                tiempo_parking[i] = LocalTime.now().withNano(0).withSecond(0);
                break;
            }
        }
        return num_plaza;
    }
    public String Desaparcar() {
        String num_matricula = "";
        float coste_parking = 0;
        for (int i= 19; i>=0;i--) {
            if (matriculas[i] != null) {
                LocalTime hora_salida = tiempo_parking[i];
                Duration diferencia = Duration.between(hora_salida, LocalTime.now());
                coste_parking = ((diferencia.getSeconds()/60)*coste_minuto);
                recaudado+= coste_parking;
                num_matricula = matriculas[i];
                matriculas[i] = null;
                break;
            }
        }
        return num_matricula+" | "+coste_parking;
    }
    public double Recaudado() {
        return recaudado;
    }
}