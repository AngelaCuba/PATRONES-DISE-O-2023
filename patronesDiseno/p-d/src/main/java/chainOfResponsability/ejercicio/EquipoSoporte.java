package chainOfResponsability.ejercicio;

public class EquipoSoporte implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Falla falla) {
        if(falla.getSeveridad().equals("BAJA")){
            falla.show();
            System.out.println("El equipo de soporte se encargara de revisar el problema------------------------------------");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        } else{
            System.out.println("El equipo de soporte no puede manejar este problema");
            this.next.reportarProblema(falla);
        }
        
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }
    
}