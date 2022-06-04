public class Parking {
    private String[] matriculas = new String[20];

    public String Estado_Parking() {
       String parking = "";
       for (int i =0; i < matriculas.length;i++) {
           parking +=(i+1)+"."+matriculas[i]+"|";
       }
        return parking;
    }
    public int Aparcar(String num_matricula) {
        int num_plaza=0;
        for (int i =0; i < matriculas.length;i++) {
            if (matriculas[i] == null) {
                matriculas[i] = num_matricula;
                num_plaza =i+1;
                break;
            }
        }
        return num_plaza;
    }
    public String Desaparcar() {
        String num_matricula = "";
        for (int i= 19; i>=0;i--) {
            if (matriculas[i] != null) {
                num_matricula = matriculas[i];
                matriculas[i] = null;
                break; 
            }
        }
        return num_matricula;
    }
    public int Plazas_libres() {
        int libres = 0;
        for (int i =0; i < matriculas.length;i++) {
            if (matriculas[i] == null) {
                libres++;
            }
        }
        return libres;
    }

    
    

}
