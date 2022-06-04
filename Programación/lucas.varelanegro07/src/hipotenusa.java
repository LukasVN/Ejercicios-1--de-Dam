public class hipotenusa { 
    //Es el ejercicio 12, se debe ejecutar como indica el enunciado, con java hipotenusa (valor1) (valor2)
    /* Realizar un programa llamado hipotenusa al que se le pasen como parámetros dos valores, verifique
    que son enteros positivos y que suponiendo que son los catetos de un ángulo recto, calcule el valor de la
    hipotenusa. (se refiere a introducirlos en la llamada al programa, java prog param1 param2, sería algo
    así: java hipotenusa 4 2. */
    public static void main(String[] args) {
        int cateto1 = Integer.parseInt(args[0]);
        int cateto2 = Integer.parseInt(args[1]);
        if(Valores_Validos(cateto1, cateto2)) {
            System.out.println(Hipotenusa(cateto1, cateto2));
        }
        else {
            System.out.println("Valores erroneos");
        }

    }
    public static boolean Valores_Validos(int cateto1,int cateto2) {
        if (cateto1 > 0 && cateto2 > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static float Hipotenusa(float cateto1,float cateto2) {
        float hipotenusa;
        hipotenusa = (float) Math.sqrt((Math.pow(cateto1, 2)+Math.pow(cateto2, 2)));
        return hipotenusa;
    }
}