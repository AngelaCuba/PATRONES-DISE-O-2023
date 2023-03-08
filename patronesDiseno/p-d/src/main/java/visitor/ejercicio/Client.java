package visitor.ejercicio;

public class Client {
    public static void main(String[] args) {
        USA usa = new USA();
        EU eu = new EU();
        Bol bol = new Bol();

        Viajero viajero = new Viajero();

        viajero.setMontoACambiar(170);

        usa.darVisa(viajero);
        eu.darVisa(viajero);
        bol.darVisa(viajero);
    }
}
