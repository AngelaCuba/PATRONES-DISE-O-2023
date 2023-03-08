package chainOfResponsability.ejercicio;

public class ServicioAlCliente implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Falla falla) {
        EquipoSoporte equipo = new EquipoSoporte();
        PO po = new PO();
        QA qa = new QA();
        DEV dev = new DEV();

            this.setNext(equipo);
            equipo.setNext(po);
            po.setNext(qa);
            qa.setNext(dev);
        
            this.next.reportarProblema(falla);
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }
    
}
    

