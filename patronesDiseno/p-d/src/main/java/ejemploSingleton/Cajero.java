package ejemploSingleton;

public class Cajero {

    Cliente cliente;

    public Cajero(Cliente cliente){
        this.cliente = cliente;
    }

    public void retirarDinero(double monto){
        Cuenta.getInstance().retirarDinero(monto);
    }
    
}
