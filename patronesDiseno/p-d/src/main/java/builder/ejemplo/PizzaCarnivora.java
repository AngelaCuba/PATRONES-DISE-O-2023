package builder.ejemplo;

public class PizzaCarnivora extends BuilderPizza {

    @Override
    public void buildCondimentos() {
        this.pizza.setCondimentos("CARNIVORA oregano");
        
    }

    @Override
    public void buildPreparacion() {
        this.pizza.setPreparacion("CARNIVORA horno");
        
    }

    @Override
    public void buildTipoCarne() {
        this.pizza.setTipoCarne("CARNIVORA carne de res");
        
    }

    @Override
    public void buildTipoFruta() {
        this.pizza.setFruta("CARNIVORA no tiene");
        
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("CARNIVORA delgada");
        
    }

    @Override
    public void buildTipoQueso() {
       this.pizza.setTipoQueso("CARNIVORA mozzarella");
        
    }
    
}
