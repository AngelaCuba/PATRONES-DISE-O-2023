package factoryMethod.ejemploFactory;

public class ConcreteCreatorProduct2 extends Creator {

    @Override
    public IProduct factoryMethod() {
        ConcreteProduct2 p2 = new ConcreteProduct2();
        /*
         *
         * toda la logica de creacion del concrete product1
         *
         * */
        return p2;
    }
        
}
