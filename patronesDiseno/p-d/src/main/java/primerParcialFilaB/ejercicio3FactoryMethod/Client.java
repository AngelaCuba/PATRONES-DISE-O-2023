package primerParcialFilaB.ejercicio3FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Camiseta c = (Camiseta) new CreatorCamiseta().factoryMethod();
        Medias m = (Medias) new CreatorMedias().factoryMethod();
        Pelota p = (Pelota) new CreatorPelota().factoryMethod();
        Shorts s = (Shorts) new CreatorShorts().factoryMethod();
        Tenis t = (Tenis) new CreatorTenis().factoryMethod();

        c.showInfo();
        m.showInfo();
        p.showInfo();
        s.showInfo();
        t.showInfo();
    }
}
