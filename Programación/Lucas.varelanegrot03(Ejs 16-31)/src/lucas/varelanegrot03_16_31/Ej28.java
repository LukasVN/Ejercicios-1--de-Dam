package lucas.varelanegrot03_16_31;

public class Ej28 {

    public static void main(String[] args) {
        /*La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres. 
        Realizar un programa que compruebe si esta afirmación es correcta o no para 
        los primeros 10000 números enteros positivos.*/
        int sum = 0, num = 0, dec = 0, cent = 0, mil = 0;
        
        for (int i = 1; i < 10000; i++) {
            num = i;
            if (num < 10 && num % 3 == 0) {
                System.out.println(i);
            }

            if (num > 10 && num < 100) {
                dec = num % 10;
                num = num / 10;
                sum = num + dec;
                if (sum % 3 == 0) {
                    System.out.println(i);
                }
            }
            if (num > 100 && num < 1000) {
                cent = num % 10;
                num = num / 10;
                dec = num % 10;
                num = num / 10;
                sum = num + dec + cent;
                if (sum % 3 == 0) {
                    System.out.println(i);
                }
            }
            if (num > 1000 && num < 10000) {
                mil = num % 10;
                num = num / 10;
                cent = num % 10;
                num = num / 10;
                dec = num % 10;
                num = num / 10;
                sum = num + dec + cent +mil;
                if (sum % 3 == 0) {
                    System.out.println(i);
                }
            }

        }

    }
}
