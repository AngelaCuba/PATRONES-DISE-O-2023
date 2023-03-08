package ejemploSingleton;

public class WedApp {
    Cliente cliente;

    public WedApp(Cliente cliente){
        this.cliente = cliente;
    }

    public void retirarDinero(double monto){
        Cuenta.getInstance().retirarDinero(monto);
    }
}
