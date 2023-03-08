package visitor.ejercicio;

public class Bol implements IArea{
    private double aDol = 7;
    private double aEu = 7.4;

    @Override
    public double cambiarABol(double monto) {
        System.out.println("EL LIBRE CAMBISTA NO OFRECE ESTE CAMBIO");
        return monto;
    }

    @Override
    public double cambiarADol(double monto) {
        return monto/aDol;
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
