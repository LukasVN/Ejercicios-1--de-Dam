import java.util.Scanner;

public class Ej03 {
    /* Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes y
    devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos. A continuación, realizar un programa al
    que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero de ese año (no usar clases Java
    de fechas) */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int dia,mes,año;
        System.out.println("Introduzca numero del día del mes: ");
        dia = t.nextInt();
        System.out.println("Introduzca el número del mes: ");
        mes = t.nextInt();
        System.out.println("Introduzca el año: ");
        año = t.nextInt();
        
        System.out.println("Han pasado: "+diasaño(dia,mes,año)+" días");

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
    public static int diasaño (int dia, int mes, int año) {
        int totaldiasf = 0;
        for (int i=1; i<mes;i++) {
            totaldiasf +=calculardiasmes(i, año);
        }
        totaldiasf += dia;
        return totaldiasf;
    }
    

}
