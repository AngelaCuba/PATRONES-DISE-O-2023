package factoryMethod.ejercicioFactory;

public class ConcreteCreatorPasajeSolidario extends CreatorPasaje{

    private PasajeSolidario pasaje = new PasajeSolidario();

    @Override
    public IPasaje createPasaje(Pasajero pasajero, String numeroAsiento) {
        pasaje.setAvion(new Avion("MOPAR", "1 ton", "AK-45", 100));
        pasaje.setCostoPasaje("100 US");
        pasaje.setOrigen(new Lugar("Japon", "Tokyo", "Aeropueto Internacional de Tokyo"));
        pasaje.setDestino(new Lugar("Irlanda", "Dublin", "Aeropuerto Internacional de Dublin"));
        pasaje.setNumeroVuelo("123AJ");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        pasajeSolidario(0.5, "Discapacidad");
        return pasaje;
    }

    public void pasajeSolidario(double descuento, String motivo) {
        pasaje.setDescuento(descuento);
        pasaje.setMotivoDeDescuento(motivo);
    }

    
    
}
