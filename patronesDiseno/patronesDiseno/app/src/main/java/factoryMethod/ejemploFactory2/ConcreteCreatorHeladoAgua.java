package factoryMethod.ejemploFactory2;

public class ConcreteCreatorHeladoAgua extends CreatorHelado{

    @Override
    public IHelado create() {
        HeladoAgua helado = new HeladoAgua();

        Base aceite = new Base();
        aceite.setCosto("1 BS");
        aceite.setTamano("500ml");
        aceite.setName("Aceite");
        aceite.setTipo("Dietetico");

        helado.setBase(aceite);
        
        Fruta naranja = new Fruta();
        naranja.setCosto("5bs");
        naranja.setName("naranja");
        naranja.setTamano("grande");
        naranja.setTipo("citrico");

        helado.setFruta(naranja);

        helado.setTamano("grande");
        helado.setForma("espiral");

        return helado;
    }
    
}