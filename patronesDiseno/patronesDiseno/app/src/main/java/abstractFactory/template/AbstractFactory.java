package abstractFactory.template;

public class AbstractFactory {
    public static IProduct make(String productType){
        IProduct product;
        switch(productType){
            case "A":
                product = new ConcreteProductA();
                break;
            case "B":
                product = new ConcreteProductB();
                break;
            default:
                product = new ConcreteProductA();
        }
        return product;
    }
}
