package abstractFactory.ejercicioAbstractFactory;

public interface IPasaje {
    void compraPasaje();
    void show();
    void setAvion(Avion avion);
    void setCostoPasaje(String costo);
    void setOrigen(Lugar origen);
    void setDestino(Lugar destino);
    void setNumeroVuelo(String numeroVuelo);
    void setNumeroAsiento(String numeroAsiento);
    void setPasajero(Pasajero pasajero);
}
