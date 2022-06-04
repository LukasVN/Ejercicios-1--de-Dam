import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej12 {
    /* Crear una clase llamada Trabajador con los atributos privados: id, nombre, fecha de nacimiento y
    salario base.
    • Dispondrá también de un constructor que inicialice todos sus campos, getters, setters, método
    toString () y equals (), sabiendo que dos trabajadores son iguales si tienen el mismo ‘id’.
    • Crear una subclase de Trabajador llamada Asalariado que añade un nuevo atributo llamado
    salarioFinal y otro llamado horasExtra.
    • El constructor de esta nueva clase Asalariado incorpora la inicialización a cero de las horas extra
    y el salario final igual al salario base.
    • La clase Asalariado también incorpora setter y getter para las horas extra y un método llamado
    calcularSalarioFinal() al que se le pasa a cuanto se paga la hora extra en ese momento y calcula
    el salario final del empleado siendo su salario base más el importe de las horas extras trabajadas.
    • Crear una subclase de Trabajador llamada ConsultorExterno que añade un nuevo atributo llamado
    horasTrabajadas y salarioFinal.
    • El constructor de esta nueva clase ConsultorExterno incorpora la inicialización a cero de las horas
    trabajadas, salario base y salario final.
    • La clase ConsultorExterno también incorpora setter y getter para las horas trabajadas y un método
    llamado calcularSalarioFinal() al que se le pasa a cuanto se paga la hora a los consultores en ese
    momento y calcula el salario final del consultor solo en función de las horas trabajadas (el salario
    base de estos trabajadores es cero).
    • Haz un programa que cree un ArrayList de Asalariados y otro de ConsultoresExternos e introduzca
    “a mano” empleados en ambos ArrayList.
        - Después modificar el contenido de ambos ArrayList añadiendo las horas extra/horas
        trabajadas respectivamente.
        - Fijar el importe de hora extra a 20 euros y la hora de consultor a 100 euros y modificar
        de nuevo los ArrayList calculando el salario final de cada trabajador.
        - Finalmente, recorriendo con un for-each ambos ArrayList, obtener el total que gastará la
        empresa en salarios.
        - ¿Sería útil tener un ArrayList que pudiese contener instancias de ambas clases? */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Asalariado> asalariados = new ArrayList<Asalariado>();
        ArrayList<ConsultorExterno> consultores = new ArrayList<ConsultorExterno>();
        Asalariado as = new Asalariado("", "", LocalDate.now(), 0, 0, 0);
        ConsultorExterno cons = new ConsultorExterno("", "", LocalDate.now(), 0, 0, 0);
        int ascont = 0; int conscont = 0;
        boolean salir = false;
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1: 
                    System.out.println("Asalariado "+(ascont+1));
                    System.out.println("Introduzca el id del Asalariado");
                    as.setId();
                    System.out.println("Introduzca el nombre del Asalariado");
                    as.setNombre();
                    System.out.println("Introduzca la fecha e nacimiento del Asalariado (Año-Mes-Dia)");
                    as.setFnacimiento();
                    System.out.println("Introduzca el salario base del Asalariado");
                    as.setSb();
                    asalariados.add(new Asalariado(as.getId(), as.getNombre(), as.getFnacimiento(), as.getSb(), as.salariofinal, as.getHe()));
                    ascont++;
                    break;
                case 2:
                    System.out.println("Consultor Externo "+(conscont+1));
                    System.out.println("Introduzca el id del Consultor Externo");
                    cons.setId();
                    System.out.println("Introduzca el nombre del Consultor Externo");
                    cons.setNombre();
                    System.out.println("Introduzca la fecha e nacimiento del Consultor Externo (Año-Mes-Dia)");
                    cons.setFnacimiento();
                    System.out.println("Introduzca el salario base del Consultor Externo");
                    cons.setSb();
                    consultores.add(new ConsultorExterno(cons.getId(), cons.getNombre(), cons.getFnacimiento(), cons.getSb(),cons.getHt(),cons.salariofinal));
                    conscont++;
                    break;
                case 3:
                    int numa = t.nextInt();
                    System.out.println("Introduzca las horas extra del Asalariado "+numa);
                    asalariados.get(numa).setHe();
                    asalariados.get(numa).calcularSalarioFinal(20);
                    break;
                case 4:
                    int numc = t.nextInt();
                    System.out.println("Introduzca las horas extra del Asalariado "+numc);
                    consultores.get(numc).setHt();
                    consultores.get(numc).calcularSalarioFinal(100);
                    break;
                case 5:
                    asalariados.toString();
                    consultores.toString();
                    break;
                case 6:
                    float coste_total = 0;
                    for(int i=0; i<asalariados.size();i++){
                        coste_total+=asalariados.get(i).salariofinal;
                    }
                    for(int i=0; i<consultores.size();i++){
                        coste_total+=consultores.get(i).salariofinal;
                    }
                    System.out.println("Gastos totales de la empresa en salarios: "+coste_total);
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
        System.out.println("1 Añadir Asalariado");
        System.out.println("2 Añadir Consultor");
        System.out.println("3 Modificar horas extra de Asalariado (Introducir número de Asalariado)");
        System.out.println("4 Modificar horas trabajadas de Consultor Externo (Introducir número de Consultor Externo)");
        System.out.println("5 Mostrar Arrays");
        System.out.println("6 Calcular gastos en salarios");
        System.out.println("0 Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(t.nextLine());
        } catch (Exception e) {
            return 999;
        }

    }
    /*Añadir un Arraylist con ambos sería más útil al simplificar el código, aunque habría que buscar
    una forma de diferenciarlos a la hora de buscarlos para realizar modificaciones*/
}
