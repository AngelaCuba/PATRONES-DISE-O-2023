package ejercicioPrototype;

public class Sim {
    private String nombreEmpresaTel;
    private String numeroTelefono;

    public Sim(String nombreEmpresaTel, String numeroTelefono){
        this.nombreEmpresaTel=nombreEmpresaTel;
        this.numeroTelefono=numeroTelefono;
    }

    public String getNombreEmpresaTel() {
        return nombreEmpresaTel;
    }
    public void setNombreEmpresaTel(String nombreEmpresaTel) {
        this.nombreEmpresaTel = nombreEmpresaTel;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
