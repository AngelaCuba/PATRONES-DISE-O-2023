package ejercicioSingletonLogger;

public class Promociones {

    private Producto producto;
    private double descuento;
    private boolean aplicado;

    public Promociones(Producto producto, double descuento){
        this.producto = producto;
        this.descuento = descuento;
    }

    public void anadir(){
        aplicado = true;
        Logger.getInstance().escribir("EL PRODUCTO "+producto.nombre()+" TIENE UN DESCUENTO DE: "+descuento+" %");
    }

    public void quitar(){
        if(aplicado){
            Logger.getInstance().escribir("EL PRODUCTO "+producto.nombre()+" YA NO TIENE UN DESCUENTO DE: "+descuento+" %");
        } else{
            Logger.getInstance().escribir("EL PRODUCTO "+producto.nombre()+" TODAVÍA NO TIENE UN DESCUENTO DE: "+descuento+" %");
        }
    }
    
}
