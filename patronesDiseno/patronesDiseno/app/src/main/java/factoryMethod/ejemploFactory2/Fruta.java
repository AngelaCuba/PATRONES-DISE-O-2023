package factoryMethod.ejemploFactory2;

public class Fruta {
    private String tipo;
    private String name;
    private String costo;
    private String tamano;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCosto() {
        return costo;
    }
    public void setCosto(String costo) {
        this.costo = costo;
    }
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void show(){
        System.out.println(tipo+" "+name+" "+costo+" "+tamano);
    }
}
