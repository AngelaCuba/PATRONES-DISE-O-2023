package primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorPelota extends Creator {
    @Override
    public IElemento factoryMethod() {
        Pelota elemento = new Pelota();
        elemento.setColor("Azul");
        elemento.setGarantia(10);
        elemento.setTamano(30);
        elemento.setPrecio(70);
        elemento.create();
        return elemento;
    }
}
