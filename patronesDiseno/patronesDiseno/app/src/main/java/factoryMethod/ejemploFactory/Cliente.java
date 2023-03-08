package factoryMethod.ejemploFactory;

public class Cliente {
    public static void main (String[]ars){
        IProduct prod1 = new ConcreteCreatorProduct1().factoryMethod();
        prod1.create();
    }
}
