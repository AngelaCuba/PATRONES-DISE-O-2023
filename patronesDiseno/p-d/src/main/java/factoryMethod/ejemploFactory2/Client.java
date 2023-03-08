package factoryMethod.ejemploFactory2;

public class Client {
    public static void main(String[] args) {
        HeladoAgua a1 = (HeladoAgua) new ConcreteCreatorHeladoAgua().create();
        HeladoAgua a2 = (HeladoAgua) new ConcreteCreatorHeladoAgua().create();
        HeladoAgua a3 = (HeladoAgua) new ConcreteCreatorHeladoAgua().create();

        a1.showHelado();
        a2.showHelado();
        a3.showHelado();

        HeladoCrema c1 = (HeladoCrema) new ConcreteCreatorHeladoCrema().create();
        HeladoCrema c2 = (HeladoCrema) new ConcreteCreatorHeladoCrema().create();
        HeladoCrema c3 = (HeladoCrema) new ConcreteCreatorHeladoCrema().create();

        c1.showHelado();
        c2.showHelado();
        c3.showHelado();

        HeladoMixto m1 = (HeladoMixto) new ConcreteCreatorHeladoMixto().create();
        HeladoMixto m2 = (HeladoMixto) new ConcreteCreatorHeladoMixto().create();
        HeladoMixto m3 = (HeladoMixto) new ConcreteCreatorHeladoMixto().create();

        m1.showHelado();
        m2.showHelado();
        m3.showHelado();
    }
}
