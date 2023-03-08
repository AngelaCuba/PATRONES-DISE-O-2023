package mediator;

public class SM extends Persona{
    public SM(String nombre, String ci, String lenguaje, ICanalComunicacion canalComunicacion) {
        super(nombre, ci, canalComunicacion);
        this.lenguaje = lenguaje;
        setTipo("sm");
    }

    private String lenguaje;

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("SM "+getNombre()+" ("+getCi()+") RECIBIO EL MENSAJE: "+msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("SM "+getNombre()+" ("+getCi()+") ESTA ENVIANDO UN MENSAJE");
        this.getCanalComunicacion().send(msg,this);
    }
    
}
