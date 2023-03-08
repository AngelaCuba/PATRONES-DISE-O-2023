package factoryMethod.ejemploFactory2;

public class Crema {
    private String sabor;
    private String marca;
    private String costo;

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String tipo) {
        this.sabor = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String name) {
        this.marca = name;
    }
    public String getCosto() {
        return costo;
    }
    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void show(){
        System.out.println(sabor+" "+marca+" "+costo);
    }
}
