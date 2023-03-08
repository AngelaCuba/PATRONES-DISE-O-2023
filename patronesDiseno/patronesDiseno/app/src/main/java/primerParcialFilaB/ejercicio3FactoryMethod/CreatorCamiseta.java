package primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorCamiseta extends Creator{
    @Override
    public IElemento factoryMethod() {
        Camiseta elemento = new Camiseta();
        elemento.setTamano(40);
        elemento.setPrecio(50);
        elemento.create();
        return elemento;
    }
}
