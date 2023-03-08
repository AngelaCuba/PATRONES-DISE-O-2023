package ejercicioSingletonLogger;

public class Producto {
    
    private String nombre;
    private String marca;

    public Producto(String nombre, String marca){
        this.nombre = nombre;
        this.marca = marca;
    }

    public void registrar(){
        Logger.getInstance().escribir("SE ESTÁ REGISTRANDO EL PRODUCTO: "+nombre+" DE "+marca);
    }

    public void eliminar(){
        Logger.getInstance().escribir("SE ESTÁ ELIMINANDO EL PRODUCTO: "+nombre+" DE "+marca);
    }

    public String nombre(){
        return nombre+" DE "+marca;
    }
}
