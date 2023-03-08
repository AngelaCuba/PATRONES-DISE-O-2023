package ejercicioSingletonLogger;

public class Factura {

    private String nit;
    private double monto;

    public Factura(String nit, double monto){
        this.nit = nit;
        this.monto = monto;
    }

    public void escribir(){
        Logger.getInstance().escribir("SE CREÓ UNA FACTURA CON NIT: "+nit+" DE UN MONTO DE: "+monto+" BS");
    }

    public void anular(){
        Logger.getInstance().escribir("SE ANULÓ UNA FACTURA CON NIT: "+nit+" DE UN MONTO DE: "+monto+" BS");
    }
}
