package lucas.varelanegrot03_16_31;

public class Ej22 {

    public static void main(String[] args) {
        /*La serie de Fibonacci se compone a partir de números naturales, empezando por 0 y 1,
        y construyendo cada nuevo número de la serie como la suma de los dos anteriores elementos 
        de la serie, así pues el tercero sería 1 (es 0 +1), el siguiente 2 (1+1), luego 3 (2+1), 
        luego 5 (3+2), 8 (5+3) y así sucesivamente. El siguiente programa pretende   mostrar   12 
        primeros   números   de   esta   serie   ¿Funciona   correctamente?     
        Es   decir,muestra:0,1,1,2,3,5,8,13,21,34,55,89. Si no es así, corrígelo.*/
        int ant = 1, ant2 = 0, num=0;
        System.out.println("0");
        for (int i = 1; i < 11; i++) {                      
             num = ant + ant2; 
            System.out.println(num);
             ant2 = ant;  
            ant = num; 
            
        }
    }
}

