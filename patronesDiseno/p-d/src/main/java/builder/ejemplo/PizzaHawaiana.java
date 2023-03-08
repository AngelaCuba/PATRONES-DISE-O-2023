package builder.ejemplo;

public class PizzaHawaiana extends BuilderPizza{

    @Override
    public void buildCondimentos() {
        this.pizza.setCondimentos("HAWAIANA oregano");
        
    }

    @Override
    public void buildPreparacion() {
        this.pizza.setPreparacion("HAWAIANAhorno");
        
    }

    @Override
    public void buildTipoCarne() {
        this.pizza.setTipoCarne("HAWAIANA carne de res");
        
    }

    @Override
    public void buildTipoFruta() {
        this.pizza.setFruta("HAWAIANA no tiene");
        
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("HAWAIANAdelgada");
        
    }

    @Override
    public void buildTipoQueso() {
       this.pizza.setTipoQueso("HAWAIANA mozzarella");
        
    }
    
}
