import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Parking3 {
    private ArrayList<String> matriculas = new ArrayList<>();
    private ArrayList<LocalTime> tiempo_parking = new ArrayList<>();
    private final float coste_minuto = 0.02f;
    private double recaudado;

    public void Estado_Parking() {
        for(int i= 0; i<matriculas.size();i++) {
            System.out.println("Plaza "+(i+1)+":");
            System.out.println("Matricula:"+" "+matriculas.get(i));
            System.out.println("Hora Aparcado: "+tiempo_parking.get(i));
        }
    }
    public int Aparcar(String num_matricula) {
        if(matriculas.size() <= 20) {
        matriculas.add(num_matricula);
        tiempo_parking.add(LocalTime.now().withNano(0).withSecond(0));
        return matriculas.size();
        }
        else {
            return 0;
        }
    }
    public String Desaparcar() {
        String num_matricula = matriculas.get(matriculas.size()-1);
        float coste_parking = 0;
        matriculas.remove(matriculas.size()-1);
        LocalTime hora_salida = tiempo_parking.get(tiempo_parking.size()-1);
        Duration diferencia = Duration.between(hora_salida, LocalTime.now());
        coste_parking = ((diferencia.getSeconds()/60)*coste_minuto);
        if(coste_parking>10) {
            coste_parking = 10;
        }
        recaudado+= coste_parking;
        return num_matricula+" | "+coste_parking;
    }
    public double Recaudado() {
        return recaudado;
    }
}

