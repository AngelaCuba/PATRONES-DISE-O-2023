package abstractFactory.ejercicioAbstractFactory;

public class Main {
    public static void main(String[] args) {
        String s = "standard";
        String so = "solidario";
        String i = "infantil";

        PasajeStandard s1 = (PasajeStandard) FactoryPasaje.createPasaje(new Pasajero("Josue Nazaret", "251200"), "A1", s);
        PasajeStandard s2 = (PasajeStandard) FactoryPasaje.createPasaje(new Pasajero("Alba Nazaret", "861200"), "A2", s);

        PasajeSolidario so1 = (PasajeSolidario) FactoryPasaje.createPasaje(new Pasajero("Jose Luis Roncha", "126232"), "F3", so);
        PasajeSolidario so2 = (PasajeSolidario) FactoryPasaje.createPasaje(new Pasajero("Luis Miguel Roncha", "126227"), "J3", so);

        PasajeInfantil i1 = (PasajeInfantil) FactoryPasaje.createPasaje(new Pasajero("Roberto Sanjinez", "1237824"), "H2", i);
        PasajeInfantil i2 = (PasajeInfantil) FactoryPasaje.createPasaje(new Pasajero("Aquiles Illanes", "122134784"), "G5", i);

        s1.show();
        s2.show();

        so1.show();
        so2.show();

        i1.show();
        i2.show();

    }
}
