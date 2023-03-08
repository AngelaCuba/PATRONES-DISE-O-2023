package chainOfResponsability.ejercicio;

public class DEV implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Falla falla) {
        if(falla.getSeveridad().equals("CRITICA")){
            falla.show();
            System.out.println("El DEV se encargara de revisar el problema------------------------------------");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        } else{
            System.out.println("El DEV no puede manejar este problema");
        }
        
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }
    
}

