package primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorTenis extends Creator{
    @Override
    public IElemento factoryMethod() {
       Tenis elemento = new Tenis();
        elemento.setTamano(40);
        elemento.setPrecio(80);
        elemento.create();
        return elemento;
    }
}
