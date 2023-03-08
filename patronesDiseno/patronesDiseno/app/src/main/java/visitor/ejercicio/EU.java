package visitor.ejercicio;

public class EU implements IArea{
    private double aDol = 1.07;
    private double aBol = 7.4;

    @Override
    public double cambiarABol(double monto) {
        return monto*aBol;
    }

    @Override
    public double cambiarADol(double monto) {
       return monto*aDol;
    }

    @Override
    public double cambiarAEu(double monto) {
        System.out.println("EL LIBRE CAMBISTA NO OFRECE ESTE CAMBIO");
        return monto;
    }

    @Override
    public void darVisa(ILibreCambista libreCambista) {
        libreCambista.visitar(this);
    }

}