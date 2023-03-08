package ejemploSingleton;

public class Sucursal {
    Cliente cliente;

    public Sucursal(Cliente cliente){
        this.cliente = cliente;
    }

    public void retirarDinero(double monto){
        Cuenta.getInstance().retirarDinero(monto);
    }
}
