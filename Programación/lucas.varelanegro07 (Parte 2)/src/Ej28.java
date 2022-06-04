import java.time.*;

// Sobre el siguiente código, modifica la clase Contacto para que funcione el main() mostrado:
public class Ej28 {
        public class ejercicio {
            public void main(String[] args) {
                Contacto[] agenda = new Contacto[10];
                agenda[0] = new Contacto("Marta", 6661111222L, LocalDate.parse("2019-11-25"));
                agenda[1] = new Contacto("Miguel", 1111111L, LocalDate.now());
                agenda[2] = new Contacto("Ana", 3333333L, "2019-11-20");
                agenda[3] = new Contacto("Daniel", 444444L);
            }
        }
        class Contacto {
            public String nombre;
            public long numero;
            public LocalDate fechaAltaAgenda;

            Contacto(String no, long nu, LocalDate fe) {
                this.nombre = no;
                this.numero = nu;
                this.fechaAltaAgenda = fe;
            }
            Contacto(String no, long nu, String fecha) {
                this.nombre = no;
                this.numero = nu;
                this.fechaAltaAgenda = LocalDate.parse(fecha);
            }
            Contacto(String no, long nu) {
                this.nombre = no;
                this.numero = nu;
            }
        }
}

