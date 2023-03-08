package mediator;

public class QA extends Persona{

    private String grado;

    public QA(String nombre, String ci, String grado, ICanalComunicacion canalComunicacion) {
        super(nombre, ci, canalComunicacion);
        this.grado=grado;
        setTipo("qa");
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("QA "+getNombre()+" ("+getCi()+") RECIBIO EL MENSAJE: "+msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("QA "+getNombre()+" ("+getCi()+") ESTA ENVIANDO UN MENSAJE");
        this.getCanalComunicacion().send(msg,this);
    }

    
    
}
