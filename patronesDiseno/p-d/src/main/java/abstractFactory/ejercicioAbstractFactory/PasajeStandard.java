package abstractFactory.ejercicioAbstractFactory;

public class PasajeStandard implements IPasaje{

    private String numeroVuelo;
    private Lugar destino;
    private Lugar origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoPasaje;

    public String getNumeroVuelo() {
        return numeroVuelo;
    }
    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }
    public Lugar getDestino() {
        return destino;
    }
    public void setDestino(Lugar destino) {
        this.destino = destino;
    }
    public Lugar getOrigen() {
        return origen;
    }
    public void setOrigen(Lugar origen) {
        this.origen = origen;
    }
    public Avion getAvion() {
        return avion;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    public String getNumeroAsiento() {
        return numeroAsiento;
    }
    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    public String getCostoPasaje() {
        return costoPasaje;
    }
    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
    @Override
    public void compraPasaje() {
        System.out.println("***************************************");
        System.out.println("SE REALIZA LA COMPRA DE UN PASAJE");
        System.out.println("COMPRADOR: ");
        pasajero.show();
        
    }
    @Override
    public void show() {
        System.out.println("----------PASAJE STANDARD-------------");
        System.out.println("NUMERO VUELO: "+numeroVuelo);
        System.out.println("ORIGEN:");
        origen.show();
        System.out.println("DESTINO: ");
        destino.show();
        System.out.println("AVION: ");
        avion.show();
        System.out.println("PASAJERO: ");
        pasajero.show();
        System.out.println("NUMERO DE ASIENTO: "+numeroAsiento);
        System.out.println("COSTO: "+costoPasaje);
    }

    
    
}
