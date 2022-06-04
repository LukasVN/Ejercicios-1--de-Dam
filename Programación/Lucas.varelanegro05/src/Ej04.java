import java.util.Scanner;

public class Ej04 {
    /*
     * Partiendo de la función del programa anterior, hacer un programa al que se le
     * introduzcan dos fechas
     * del mismo año y nos informe de los días comprendidos entre ellas (no usar
     * clases Java de fechas)
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int dia1,mes1,año,dia2,mes2;
        System.out.println("Introduzca el año: ");
        año = t.nextInt();
        System.out.println("Introduzca numero del día del mes (Primera Fecha): ");
        dia1 = t.nextInt();
        System.out.println("Introduzca el número del mes (Primera Fecha): ");
        mes1 = t.nextInt();
        System.out.println("Introduzca numero del día del mes (Segunda Fecha): ");
        dia2 = t.nextInt();
        System.out.println("Introduzca el número del mes (Primera Fecha): ");
        mes2 = t.nextInt();
        System.out.println("Han pasado un total de: "+diasaño(dia1,dia2,mes1,mes2,año)+" días");

    }
    public static int calculardiasmes (int mes, int año) {
    
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
                
            case 2:
                if( año%4==0 && año%100!=0|| año%400==0 )              
                    return 29;
                
                return 28;
                
            case 4: case 6: case 9: case 11:
                return 30;
            
            }
            return 0;
    
    }
    public static int diasaño (int dia1, int dia2, int mes1, int mes2, int año) {
        int totaldiasf = 0;
        int mesmenor,mesmayor;
        if (mes1 < mes2) {
            mesmenor = mes1;    mesmayor = mes2;    totaldiasf += dia2;
        }
        else {
            mesmenor = mes2;    mesmayor = mes1;    totaldiasf += dia1;
        }
        for (int i=mesmenor; i<mesmayor;i++) {
            totaldiasf +=calculardiasmes(i, año);
        }
        return totaldiasf;
    }
    
}
