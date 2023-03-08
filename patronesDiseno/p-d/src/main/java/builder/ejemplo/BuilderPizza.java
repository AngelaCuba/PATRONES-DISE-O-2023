package builder.ejemplo;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void prepararPizza(){
        pizza = new Pizza();
    }

    public abstract void buildTipoQueso();
    public abstract void buildTipoCarne();
    public abstract void buildTipoFruta();
    public abstract void buildPreparacion();
    public abstract void buildCondimentos();
    public abstract void buildTipoMasa();
}
