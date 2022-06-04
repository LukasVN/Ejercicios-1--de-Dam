package lucas.varelanegrot03_16_31;

public class Ej27 {

    public static void main(String[] args) {
    /* Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
    a.)     b.)     c.)      d.)
    0000000000 1 1111111111 9 
    1111111111 22 222222222 98
    2222222222 333 33333333 987
    3333333333 4444 4444444 9876
    ........ ...... ....... ....... */
        // a)
        System.out.println("Gráfico a: ");
        long a = 1111111111;

        System.out.println("0000000000");

        for (int i = 0; i < 9; i++) {
            System.out.println(a);
            a = (a + 1111111111);

        }
        System.out.println("-------------");
        // b)
        System.out.println("Gráfico b: ");
        long b = 0;

        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(b);

            }
            System.out.print("\n");
            b++;
        }
        System.out.println("-------------");
        // c)          
        System.out.println("Gráfico c: ");
        long c = 1111111111, sum=1111111111;
        
            for (int i = 0; i < 9; i++) {                                
                System.out.println(c);
                c = c + sum;
                c=c/10;
                sum=sum/10;

            }    
        System.out.println("-------------");
        // d)
        System.out.println("Gráfico d: ");
        long d = 10;

        for (int j = 1; j <=9 ; j++) {
            for (int i = 9 , cont=1; cont<=j ; i--,cont++) {
                System.out.print(i);               
            }            
            System.out.print("\n"); 
        d--;        
            
        }
    }
}