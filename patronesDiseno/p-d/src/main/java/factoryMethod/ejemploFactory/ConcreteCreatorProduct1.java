package factoryMethod.ejemploFactory;

public class ConcreteCreatorProduct1 extends Creator {

    @Override
    public IProduct factoryMethod() {
        ConcreteProduct p1 = new ConcreteProduct();
        /*
         *
         * toda la logica de creacion del concrete product1
         *
         * */
        return p1;
    }
        
}
