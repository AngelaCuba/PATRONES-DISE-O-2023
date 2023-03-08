package factoryMethod.ejercicioFactory;

public class ConcreteCreatorPasajeInfantil extends CreatorPasaje {

    @Override
    public IPasaje createPasaje(Pasajero pasajero, String numeroAsiento) {
        PasajeInfantil pasaje = new PasajeInfantil();
        pasaje.setAvion(new Avion("MOPAR", "1 ton", "AK-45", 100));
        pasaje.setCostoEspecial("30 US");
        pasaje.setOrigen(new Lugar("Japon", "Tokyo", "Aeropueto Internacional de Tokyo"));
        pasaje.setDestino(new Lugar("Irlanda", "Dublin", "Aeropuerto Internacional de Dublin"));
        pasaje.setNumeroVuelo("123AJ");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        return pasaje;
    }

}
