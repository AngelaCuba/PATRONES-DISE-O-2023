package factoryMethod.ejemploFactory2;

public class HeladoAgua implements IHelado {

    private String tamano;
    private String forma;
    private Fruta fruta = new Fruta();
    private Base base = new Base();

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public HeladoAgua(){}

    @Override
    public void prepararHelado() {
        System.out.println("PREPARANDO HELADO DE AGUA");
        
    }

    @Override
    public void showHelado() {
        System.out.println("------------------------------------------");
        System.out.println("HELADO DE AGUA: "+tamano+" "+forma);
        System.out.println("DE: ");
        fruta.show();
        base.show();
    }
    
}
