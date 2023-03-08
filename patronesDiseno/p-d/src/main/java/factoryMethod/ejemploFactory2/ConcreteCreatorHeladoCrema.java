package factoryMethod.ejemploFactory2;

public class ConcreteCreatorHeladoCrema extends CreatorHelado {

    @Override
    public IHelado create() {
        HeladoCrema helado = new HeladoCrema();

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

        Crema crema = new Crema();
        crema.setCosto("15bs");
        crema.setMarca("calaca");
        crema.setSabor("chicle");

        helado.setCrema(crema);

        helado.setTamano("grande");
        helado.setForma("espiral");

        return helado;
    }
    
}
