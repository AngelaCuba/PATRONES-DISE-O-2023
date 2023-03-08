package factoryMethod.ejercicioFactory;

public class Main {
    public static void main(String[] args) {
        PasajeStandard s1 = (PasajeStandard) new ConcreteCreatorPasajeStandard().createPasaje(new Pasajero("Josue Nazaret", "251200"), "A1");
        PasajeStandard s2 = (PasajeStandard) new ConcreteCreatorPasajeStandard().createPasaje(new Pasajero("Alba Nazaret", "861200"), "A2");

        PasajeSolidario so1 = (PasajeSolidario) new ConcreteCreatorPasajeSolidario().createPasaje(new Pasajero("Jose Luis Roncha", "126232"), "F3");
        PasajeSolidario so2 = (PasajeSolidario) new ConcreteCreatorPasajeSolidario().createPasaje(new Pasajero("Luis Miguel Roncha", "126227"), "J3");

        PasajeInfantil i1 = (PasajeInfantil) new ConcreteCreatorPasajeInfantil().createPasaje(new Pasajero("Roberto Sanjinez", "1237824"), "H2");
        PasajeInfantil i2 = (PasajeInfantil) new ConcreteCreatorPasajeInfantil().createPasaje(new Pasajero("Aquiles Illanes", "122134784"), "G5");

        s1.show();
        s2.show();

        so1.show();
        so2.show();

        i1.show();
        i2.show();

    }
}
