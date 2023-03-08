package ejercicioSingletonLogger;

public class Cliente {
    private String nombre;
    private String id;
    private int cupon;

    public Cliente(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
        cupon = 10;
    }

    public void registrar(){
        Logger.getInstance().escribir("SE ESTÁ REGISTRANDO EL CLIENTE: "+nombre+" CON ID: "+id);
    }

    public void usarCupon(int compra){
        Logger.getInstance().escribir("EL CLIENTE "+nombre+" CON ID: "+id+" ESTÁ UTILIZANDO UN CUPÓN DE "+cupon+" BS EN SU COMPRA DE "+compra+" BS \n LA FACTURA FINAL ES DE: "+(compra-cupon+" BS");
    }
}
