package chainOfResponsability.ejercicio;

public class PO implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Falla falla) {
        if(falla.getSeveridad().equals("MEDIA")){
            falla.show();
            System.out.println("El PO se encargara de revisar el problema------------------------------------");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        } else{
            System.out.println("El PO no puede manejar este problema");
            this.next.reportarProblema(falla);
        }
        
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }
    
}