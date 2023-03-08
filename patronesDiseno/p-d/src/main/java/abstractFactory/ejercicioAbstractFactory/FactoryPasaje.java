package abstractFactory.ejercicioAbstractFactory;

public class FactoryPasaje {

    public static IPasaje createPasaje(Pasajero pasajero, String numeroAsiento, String type){
        IPasaje pasaje;
        
        switch(type){
            case "standard":
                pasaje = new PasajeStandard();
                pasaje.setCostoPasaje("100 US");
                break;
            case "solidario":
                pasaje = new PasajeSolidario();
                pasaje.setCostoPasaje("100 US");
                pasajeSolidario(0.5, "Discapacidad", (PasajeSolidario) pasaje);
                break;
            case "infantil":
                pasaje = new PasajeInfantil();
                pasaje.setCostoPasaje("50 US");
                break;
            default:
                pasaje = new PasajeStandard();
        }

        pasaje.setAvion(new Avion("MOPAR", "1 ton", "AK-45", 100));
        pasaje.setOrigen(new Lugar("Japon", "Tokyo", "Aeropueto Internacional de Tokyo"));
        pasaje.setDestino(new Lugar("Irlanda", "Dublin", "Aeropuerto Internacional de Dublin"));
        pasaje.setNumeroVuelo("123AJ");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);

        return pasaje;
    }

    public static void pasajeSolidario(double descuento, String motivo, PasajeSolidario pasaje) {
        pasaje.setDescuento(descuento);
        pasaje.setMotivoDeDescuento(motivo);
    }
}
