import java.util.Arrays;
import java.util.Scanner;

public class Ej11 {
    /*Realizar un programa que tenga definido un Array de 12 filas y 30 columnas llamado temperaturaDia
    con las temperaturas medias de un lugar en cada uno de los días del año (suponemos meses de 30 días). Serán
    valores enteros negativos o positivos. El programa debe tener funciones para realizar las siguientes tareas:
    a. Llenar de valores el Array: para evitar tener que introducir los valores a mano, genera valores al azar
    para todos los días. Para enero, febrero, marzo, noviembre y diciembre los valores estarán
    comprendidos entre -10 y +20 y para el resto de meses entre +10 y +35.
    b. Mostrar por pantalla el contenido del array en forma de tabla: todos los días de un mes en la misma fila,
    ocupando 3 posiciones (una para el signo y dos dígitos para la temperatura).
    c. Mostrar la temperatura media del año.
    d. Mostrar el día en el que más calor hizo del año.
    e. Calcular la temperatura media de cada mes.
    f. Decir si hay algún día con más de 30 grados, recorriendo lo imprescindible del array, es decir, en
    cuanto sepa que sí hay alguno, que pare de recorrer el array.
    g. Crear un Array unidimensional con la temperatura mínima de cada mes. */
    public static void main(String[] args) {
        int temperaturaDia[][] = new int[12][30];
        temperaturas(temperaturaDia); //a.
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: //b.
                    for(int i = 0; i<12;i++) {
                        int mes = 1+i;
                        System.out.println("Mes "+mes+": "+Arrays.toString(temperaturaDia[i]));
                    }
                    break;
                case 2: System.out.printf("%+.1f", TemperaturaMedia(temperaturaDia)); //c.
                    break;
                case 3: System.out.println("El día más caluroso del año fue el "+TemperaturaMax(temperaturaDia)); //d.
                    break;
                case 4: //e.
                    System.out.println("Temperatura media de todos los meses del año: "+Arrays.toString(TemperaturaMediaMes(temperaturaDia)));
                    break;
                case 5: //f.
                    if(Mayorde30(temperaturaDia)) {
                        System.out.println("Algun día hubo más de 30 grados");
                    }
                    else {
                        System.out.println("No hubo más de 30 grados en todo el año");
                    }
                    break;
                case 6: //g.
                    int temperatura_min[] = TemperaturaMin(temperaturaDia);
                    System.out.println(Arrays.toString(temperatura_min));
                    break;
                case 0:
                    salir = true;
                    break;
 
            }
        } while (!salir);
    }
    
    public static void temperaturas(int temperaturaDia[][] ) {
        for(int i=0;i<12;i++) {
            for(int y = 0; y < 30;y++) {
                if(i<3 || i>9) {
                temperaturaDia[i][y] = (int) ((Math.random()*(20-(-10)+1)+(-10)));
                }
                else {
                temperaturaDia[i][y] = (int) ((Math.random()*(35-10+1)+10));
                }
            }
        }
    }

    public static float TemperaturaMedia(int temperaturaDia[][]) {
    float mediatemp = 0;
    for(int i=0;i<12;i++) {
        for(int y = 0; y < 30;y++) {
        mediatemp+= temperaturaDia[i][y];
        }
    }
    mediatemp= mediatemp/365;
    return mediatemp;
    }

    public static String TemperaturaMax(int temperaturaDia[][]) {
        int maxtemp = 0; String dia_calor = "";
        for(int i=0;i<12;i++) {
            for(int y = 0; y < 30;y++) {
                if(temperaturaDia[i][y] > maxtemp) {
                    int dia = y+1; int mes = i+1;
                    maxtemp = temperaturaDia[i][y];
                    dia_calor = "día "+dia+" del mes "+mes;
                } 
            }
        }
        return dia_calor;
    }

    public static double[] TemperaturaMediaMes(int temperaturaDia[][]) {
         double mediatemp_mes[] = new double[12];
        for(int i=0;i<12;i++) {
            double mediatemp = 0;
            for(int y = 0; y < 30;y++) {
            mediatemp+= temperaturaDia[i][y];
            }
            mediatemp = Math.round(mediatemp/30*10)/10.0;
            mediatemp_mes[i] = mediatemp;
        }
        return mediatemp_mes;
        }

    public static boolean Mayorde30(int temperaturaDia[][]) {
        for(int i=0;i<12;i++) {
            for(int y = 0; y < 30;y++) {
                if(temperaturaDia[i][y] > 30) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] TemperaturaMin(int temperaturaDia[][]) {
        int temperaturas_min[] = new int[12];
        for(int i=0;i<12;i++) {
            int mintemp = 35;
            for(int y = 0; y < 30;y++) {
                if(temperaturaDia[i][y] < mintemp) {
                    mintemp = temperaturaDia[i][y];
                } 
            }
            temperaturas_min[i] = mintemp;
        }
        return temperaturas_min;

        
    }

    private static int pintarMenu() {
        Scanner t = new Scanner(System.in);
 
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Mostrar temperaturas");
        System.out.println("2 Temperatura media del año");
        System.out.println("3 Temperatura máxima del año");
        System.out.println("4 Temperatura media de cada mes");
        System.out.println("5 Hizo algún día más de 30 grados?");
        System.out.println("6 Temperatura mínima de cada mes");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }
}