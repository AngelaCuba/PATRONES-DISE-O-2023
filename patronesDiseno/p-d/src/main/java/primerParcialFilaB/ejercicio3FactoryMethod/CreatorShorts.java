package primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorShorts extends Creator {
    @Override
    public IElemento factoryMethod() {
       Shorts elemento = new Shorts();
        elemento.setTamano(40);
        elemento.setPrecio(90);
        elemento.create();
        return elemento;
    }
}
