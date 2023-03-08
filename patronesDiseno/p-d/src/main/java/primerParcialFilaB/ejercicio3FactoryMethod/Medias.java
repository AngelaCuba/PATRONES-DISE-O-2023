package primerParcialFilaB.ejercicio3FactoryMethod;

public class Medias implements IElemento{
    private int tamano;
    private int precio;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void create() {
        System.out.println("CREANDO MEDIAS");
    }

    @Override
    public void showInfo() {
        System.out.println("---------------------MEDIAS-------------------");
        System.out.println("TAMAÑO: "+tamano);
        System.out.println("PRECIO: "+precio);
    }
}
