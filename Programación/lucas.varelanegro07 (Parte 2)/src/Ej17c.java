public class Ej17c {
    /* 
    c) Programa con un bucle que genere boletos hasta que acierte los 6 números ¿Cuántos boletos has
    tenido que crear?*/
    public static void main(String[] args){
        Primitiva2 p = new Primitiva2();
        int cont=0;
        while(p.Intento(p.Boleto_Random()) != 6) {
            cont++;
        }
        System.out.println("Se han necesitado "+cont+" boletos para sacar uno premiado");
    }
}
