package factoryMethod.ejemploFactory2;

public class HeladoCrema implements IHelado {
    private String tamano;
    private String forma;
    private Fruta fruta = new Fruta();
    private Base base = new Base();
    private Crema crema = new Crema();

    

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

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public HeladoCrema(){}

    @Override
    public void prepararHelado() {
        System.out.println("PREPARANDO HELADO DE AGUA");
        
    }

    @Override
    public void showHelado() {
        System.out.println("------------------------------------------");
        System.out.println("HELADO DE CREMA: "+tamano+" "+forma);
        System.out.println("FRUTA: ");
        fruta.show();
        System.out.println("BASE: ");
        base.show();
        System.out.println("CREMA: ");
        crema.show();
    }
}
