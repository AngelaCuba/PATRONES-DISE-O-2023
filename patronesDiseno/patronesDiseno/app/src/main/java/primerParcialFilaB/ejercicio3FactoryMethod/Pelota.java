package primerParcialFilaB.ejercicio3FactoryMethod;

public class Pelota implements IElemento{
    private int precio;
    private int tamano;
    private int garantia;
    private String color;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void create() {
        System.out.println("CREANDO PELOTA");
    }

    @Override
    public void showInfo() {
        System.out.println("------------------PELOTA FUTBOL---------------------");
        System.out.println("TAMAÑO: "+tamano);
        System.out.println("PRECIO: "+precio);
        System.out.println("COLOR: "+color);
        System.out.println("GARANTIA: "+garantia);
    }
}
