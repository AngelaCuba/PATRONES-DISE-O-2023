package factoryMethod.ejemploFactory2;

public class HeladoMixto implements IHelado {
    private String tamano;
    private String forma;
    private Fruta fruta = new Fruta();
    private Base base = new Base();
    private Crema crema = new Crema();
    private String costo;

    public HeladoMixto(){}

    

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



    public String getCosto() {
        return costo;
    }



    public void setCosto(String costo) {
        this.costo = costo;
    }



    @Override
    public void prepararHelado() {
        System.out.println("PREPARANDO HELADO DE AGUA");
        
    }

    @Override
    public void showHelado() {
        System.out.println("------------------------------------------");
        System.out.println("HELADO MIXTO: "+tamano+" "+forma+" "+costo);
        System.out.println("FRUTA: ");
        fruta.show();
        System.out.println("BASE: ");
        base.show();
        System.out.println("CREMA: ");
        crema.show();
    }
}
