package builder.ejemplo;

public class Cocinero {
    private BuilderPizza builder;

    public Pizza getPizza(){
        return builder.getPizza();
    }

    public void setTipoPizza(BuilderPizza builder){
        this.builder = builder;
    }

    public void buildPizza(){
        this.builder.prepararPizza();
        this.builder.buildCondimentos();
        this.builder.buildPreparacion();
        this.builder.buildTipoCarne();
        this.builder.buildTipoFruta();
        this.builder.buildTipoMasa();
        this.builder.buildTipoQueso();
    }

}
