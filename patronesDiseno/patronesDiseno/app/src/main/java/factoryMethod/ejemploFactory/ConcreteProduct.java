package factoryMethod.ejemploFactory;

public class ConcreteProduct implements IProduct {

    @Override
    public void create() {
        System.out.println("Creando ConcreteProduct1");
        
    }
    
}
