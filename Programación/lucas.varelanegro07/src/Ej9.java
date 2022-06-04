import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Ej9 {
    /* Realiza un programa que tenga definido un Array como variable global llamado temperaturaMeses, de
        12 enteros, con las temperaturas medias de un lugar en cada uno de los meses del año. Serán valores enteros
        negativos o positivos. El programa tendrá diferentes funciones que realicen las siguientes tareas:
        a. Llenar el Array con valores al azar para todos los meses. Para enero, febrero, marzo, noviembre y
        diciembre los valores estarán comprendidos entre -10 y +20 y para el resto de meses entre +10 y +40.
        b. Mostrar por pantalla el contenido del array con el nombre de los meses (usar clases Java para obtener el
        nombre del mes)
        c. Calcular la temperatura media del año, usando printf especificando en el formato que incluya el signo
        “+” en temperaturas positivas y que solo muestre 1 decimal.
        d. Mostrar la temperatura máxima del año.
        e. Mostrar el mes más frío del año.
        f. Para hacer pruebas estadísticas, desplazar los valores a la derecha, pasando el último al primero.
        g. Para hacer pruebas estadísticas, desplazar los valores a izquierda, pasando el primero al último.
        h. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array, es decir, en
        cuanto sepa que sí hay alguno, que pare de recorrer el array. (No usar break)
        i. ¿Se repitió alguna temperatura? */
        public static void main(String[] args) {
            int temperaturaMeses[] = new int[12];
            boolean salir = false;
            temperaturas(temperaturaMeses);
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: System.out.println(MostrarMeses(temperaturaMeses));
                    break;
                case 2: System.out.printf("%+.1f", TemperaturaMedia(temperaturaMeses));
                    break;
                case 3: System.out.println("Temperatura máxima: "+TemperaturaMax(temperaturaMeses)+"°C");
                    break;
                case 4: System.out.println("Mes con temperatura mínima: "+TemperaturaMin(temperaturaMeses)+"°C");
                    break;
                case 5: DesplazarDerecha(temperaturaMeses);
                    break;
                case 6: DesplazarIzquierda(temperaturaMeses);
                    break;
                case 7: 
                    if(Mayorde30(temperaturaMeses)) {
                        System.out.println("Hubo temperaturas superiores a 30°C");
                    }
                    else {
                        System.out.println("No hubo temperaturas superiores a 30°C");
                    }
                    break;
                case 8: 
                    if(Repetidas(temperaturaMeses)) {
                        System.out.println("Se repiten temperaturas");
                    }
                    else {
                        System.out.println("No se repiten temperaturas");
                    }
                    break;
                case 0:
                    salir = true;
                    break;
 
            }
        } while (!salir);
    }
    private static int pintarMenu() {
        Scanner t = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Mostrar temperaturas de los meses");
        System.out.println("2 Calcular temperatura media del año");
        System.out.println("3 Mostrar temperatura máxima");
        System.out.println("4 Mostrar mes con temperatura mínima");
        System.out.println("5 Desplazar valores a la derecha");
        System.out.println("6 Desplazar valores a la izquierda");
        System.out.println("7 Hubo más de 30°C en algún mes?");
        System.out.println("8 Se repite alguna temperatura?");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
   
    }
    public static void temperaturas(int temperaturaMeses[]) {
        for(int i=0;i<12;i++) {
            if(i<3 || i>9) {
                temperaturaMeses[i] = (int) ((Math.random()*(20-(-10)+1)+(-10)));
            }
            else {
                temperaturaMeses[i] = (int) ((Math.random()*(40-10+1)+10));
            }
        }
    }

    public static String MostrarMeses(int temperaturaMeses[]) {
        String mestemp = "";
        for(int i =0; i<12;i++) {
            mestemp+= Month.of(i+1).getDisplayName(TextStyle.FULL, new Locale("es"))+" "+temperaturaMeses[i]+"°C |";
        }
        return mestemp;
    }

    public static Double TemperaturaMedia(int temperaturaMeses[]) {
        double mediatemp = 0;
        for(int i=0;i<12;i++) {
            mediatemp+= temperaturaMeses[i];
        }
        mediatemp= mediatemp/12;
        return mediatemp;
    }

    public static int TemperaturaMax(int temperaturaMeses[]) {
        int maxtemp = 0;
        for(int i=0;i<12;i++) {
            if(temperaturaMeses[i] > maxtemp) {
                maxtemp = temperaturaMeses[i];
            }
        }
        return maxtemp;
    }

    public static String TemperaturaMin(int temperaturaMeses[]) {
        int maxtemp = 40; int mes = 0;
        for(int i=0;i<12;i++) {
            if(temperaturaMeses[i] < maxtemp) {
                maxtemp = temperaturaMeses[i];
            }
        }
        for(int i=0;i<12;i++) {
            if(maxtemp == temperaturaMeses[i]) {
                mes = i+1;
            }
        }
        return Month.of(mes).getDisplayName(TextStyle.FULL, new Locale("es"))+" con "+maxtemp;
    }

    public static void DesplazarDerecha(int temperaturaMeses[]) {
        int ultimo = temperaturaMeses[11];
            for(int i = temperaturaMeses.length-2; i>=0;i--) {
            temperaturaMeses[i+1] = temperaturaMeses[i];
            }
        temperaturaMeses[0] = ultimo;
    }

    public static void DesplazarIzquierda(int temperaturaMeses[]) {
        int primero = temperaturaMeses[0];
            for(int i = 0; i<=temperaturaMeses.length-2;i++) {
            temperaturaMeses[i] = temperaturaMeses[i+1];
            }
        temperaturaMeses[11] = primero;
    }

    public static boolean Mayorde30(int temperaturaMeses[]) {
        for (int i= 0; i<=temperaturaMeses.length-2;i++) {
            if(temperaturaMeses[i] >30) {
                return true;
            }
        }
        return false;
    }

    public static boolean Repetidas(int temperaturaMeses[]) {
        for(int i= 0; i<=temperaturaMeses.length-2;i++) {
            for(int y=temperaturaMeses.length-2; y>=0;y--) {
                if(y != i) {
                    if(temperaturaMeses[i] == temperaturaMeses[y]) {
                    return true;
                    }
                }
            }
        }
        return false;
    }
}

