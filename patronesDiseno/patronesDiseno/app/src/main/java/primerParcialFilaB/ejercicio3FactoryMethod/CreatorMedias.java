package primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorMedias extends Creator {
    @Override
    public IElemento factoryMethod() {
       Medias elemento = new Medias();
        elemento.setTamano(30);
        elemento.setPrecio(60);
        elemento.create();
        return elemento;
    }
}
