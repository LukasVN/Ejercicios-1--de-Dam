import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Primitiva2 {
    private List<Integer> result = new ArrayList<>();

    public Primitiva2() {
            for(int i= 0; i<6;i++) {
            int random= (int)(Math.random()*(49-1)+1);
                while(result.contains(random)) {
                    random = (int)(Math.random()*(49-1)+1);
                }
                result.add(random);
            }
        }

    public String Premiado() {
        return result.toString();
    }

    public int Intento(List<Integer> intento) {
        int aciertos = 0;
        for(int i= 0; i<6;i++) {
            if(intento.contains(result.get(i))) {
            aciertos++;
            }
        }
        return aciertos;
    }

    public List<Integer> Boleto_Random() {
        List<Integer> boleto_rng = new ArrayList<>();
        for(int i= 0; i<6;i++) {
        int random= (int)(Math.random()*(49-1)+1);
        while(boleto_rng.contains(random)) {
            random = (int)(Math.random()*(49-1)+1);
        }
        boleto_rng.add(random);
        }
        return boleto_rng;
    }
}

