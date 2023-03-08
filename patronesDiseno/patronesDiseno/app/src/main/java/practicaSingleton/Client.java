package practicaSingleton;

public class Client {
    public static void main(String[] args) {
        Banco banco = new Banco();
        CasaCambios casaCambios = new CasaCambios();
        LibreCambista libre = new LibreCambista();

        banco.show();
        banco.conversionesBol(70);
        banco.conversionesDol(10);
        banco.conversionesEu(9);

        casaCambios.show();
        casaCambios.conversionesBol(70);
        casaCambios.conversionesDol(10);
        casaCambios.conversionesEu(9);

        libre.show();
        libre.conversionesBol(70);
        libre.conversionesDol(10);
        libre.conversionesEu(9);
    }
}
