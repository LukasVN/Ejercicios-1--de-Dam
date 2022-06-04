import java.util.ArrayList;

public class Ej17b {
    /*
    b) Programa en el que se generen 1000 boletos al azar y nos informe de cuantos boletos hay con 3, 4, 5
    y 6 aciertos (a lo mejor es necesario crear un nuevo método en la clase Primitiva para generar
    boletos al azar). */
    public static void main(String[] args) {
        Primitiva2 p = new Primitiva2();
        ArrayList<ArrayList<Boolean>> contadores = new ArrayList<>();
        AñadirContadores(contadores);
        for(int i= 0; i<1000;i++) {
            if (p.Intento(p.Boleto_Random()) == 3) {
                contadores.get(0).add(true);
            }
            else if (p.Intento(p.Boleto_Random()) == 4) {
                contadores.get(1).add(true);
            }
            else if (p.Intento(p.Boleto_Random()) == 5) {
                contadores.get(2).add(true);
            }
            else if (p.Intento(p.Boleto_Random()) == 6) {
                contadores.get(3).add(true);
            }
        }
        System.out.println("Hubo "+contadores.get(0).size()+" boletos con 3 aciertos");
        System.out.println("Hubo "+contadores.get(1).size()+" boletos con 4 aciertos");
        System.out.println("Hubo "+contadores.get(2).size()+" boletos con 5 aciertos");
        System.out.println("Hubo "+contadores.get(3).size()+" boletos premiados");
    }
    public static void AñadirContadores(ArrayList<ArrayList<Boolean>> contadores) {
        for(int i=0; i<=4;i++) {
        contadores.add(new ArrayList<>());
        }
    }
}
