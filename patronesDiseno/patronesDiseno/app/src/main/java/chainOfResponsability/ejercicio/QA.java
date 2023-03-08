package chainOfResponsability.ejercicio;

public class QA implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Falla falla) {
        if(falla.getSeveridad().equals("ALTA")){
            falla.show();
            System.out.println("El QA se encargara de revisar el problema------------------------------------");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        } else{
            System.out.println("El QA no puede manejar este problema");
            this.next.reportarProblema(falla);
        }
        
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }
    
}
