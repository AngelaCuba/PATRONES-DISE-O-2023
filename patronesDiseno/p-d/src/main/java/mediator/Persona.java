package mediator;

public abstract class Persona {
    private String nombre;
    private String ci;
    private ICanalComunicacion canalComunicacion;
    private String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Persona(String nombre, String ci, ICanalComunicacion canalComunicacion) {
        this.nombre = nombre;
        this.ci = ci;
        this.canalComunicacion = canalComunicacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public abstract void send(String msg);
    public abstract void messageReceived(String msg);
    
    public ICanalComunicacion getCanalComunicacion() {
        return canalComunicacion;
    }
    public void setCanalComunicacion(ICanalComunicacion canalComunicacion) {
        this.canalComunicacion = canalComunicacion;
    }
    
}
