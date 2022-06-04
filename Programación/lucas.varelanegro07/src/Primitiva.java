public class Primitiva {
    private int[] result = new int[6];

    public Primitiva() {
        for (int i = 0; i < result.length; i++) {
            int random = (int) (Math.random() * (49 - 1) + 1);
            for (int y = 0; y <= i; y++) {
                if (random == result[y]) {
                    random = (int) (Math.random() * (49 - 1) + 1);
                    y = 0;
                }

            }
            result[i] = random;
        }
    }
    public int[] dameGanador(){
        for (int i=0; i<result.length;i++) {
             System.out.println(result[i]);
        }
           return result;
    }
    public int Intento(int[] intento) {
        int aciertos = 0;
        for (int i=0; i<result.length;i++) {
            for (int y = 0; y < intento.length; y++) {
                if (intento[y] == result[i]) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }
    public int[] Boleto_random() {
        int[] boletorng = new int[6];
        for (int i = 0; i < boletorng.length; i++) {
            int random = (int) (Math.random() * (49 - 1) + 1);
            for (int y = 0; y <= i; y++) {
                if (random == boletorng[y]) {
                    random = (int) (Math.random() * (49 - 1) + 1);
                    y = 0;
                }

            }
            boletorng[i] = random;
        }
        return boletorng;
}



}