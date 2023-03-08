package primerParcialFilaB.ejercicio1Singleton;

public class Registro {
    private Tesis tesis;
    private String hora;

    public Registro(Tesis tesis, String hora) {
        this.tesis = tesis;
        this.hora = hora;
    }

    

    @Override
    public int hashCode() {
        return tesis.hashCode();
    }



    public void show(){
        tesis.show();
        System.out.println("HORA: "+hora);
    }
    
}
