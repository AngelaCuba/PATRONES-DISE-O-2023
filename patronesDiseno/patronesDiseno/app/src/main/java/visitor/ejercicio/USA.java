package visitor.ejercicio;

public class USA implements IArea{
    private double aEu = 1.07;
    private double aBol = 7;

    @Override
    public double cambiarABol(double monto) {
        return monto*aBol;
    }

    @Override
    public double cambiarADol(double monto) {
        System.out.println("EL LIBRE CAMBISTA NO OFRECE ESTE CAMBIO");
        return monto;
    }

    @Override
    public double cambiarAEu(double monto) {
        return monto/aEu;
    }

    @Override
    public void darVisa(ILibreCambista libreCambista) {
        libreCambista.visitar(this);
    }

}